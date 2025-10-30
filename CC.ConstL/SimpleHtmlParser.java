package CC.ConstL;

import CC.ConstL.SOrc.PRsr;
import java.util.*;
import java.io.*;

import static CC.ConstL.FIl_Util.LOd_String;
import static java.lang.System.out;

/**
 * Small permissive HTML parser into a node tree. No external libraries required.
 *
 * Limitations / notes:
 * - Tolerant, not a full HTML5 parser (no sophisticated implicit tag insertion).
 * - Preserves attribute order; preserves raw attribute values (unescaped).
 * - Recognizes: doctype, comments <!-- -->, processing instructions <?...?>,
 *   start tags <tag ...>, end tags </tag>, self-closing tags <tag .../>,
 *   and text nodes. CDATA sections <![CDATA[ ... ]]> are captured as text node.
 */
public class SimpleHtmlParser
	 extends           PRsr
{
	// Node tree model
	public static abstract class Node
	{
		public final Node parent;

		public final List<Node> children=new ArrayList<>();
			public void add(Node c)
			{	children.add(c);   }

		protected Node(Node parent)
		{	this.parent = parent;   }
	}

	public static final class DocumentNode extends Node
	{
		public DocumentNode()
		{	super(null);   }
	}
	public static final class DoctypeNode extends Node
	{
		public final String text;

		public DoctypeNode(Node parent, String text)
		{
			super(parent);
			this.text=text;
		}
	}
	public static final class ElementNode extends Node
	{
		public final String tag;
		public final LinkedHashMap<String,String> attrs;
		public final boolean selfClosing;

		public ElementNode(Node parent, String tag,LinkedHashMap<String,String> attrs, boolean selfClosing)
		{
			super(parent); this.tag = tag; this.attrs = attrs; this.selfClosing = selfClosing;
		}
	}
	public static final class TextNode extends Node
	{
		public final String text;

		public TextNode(Node parent, String text)
		{
			super(parent);
			this.text=text;
		}
	}
	public static final class CommentNode extends Node
	{
		public final String comment;

		public CommentNode(Node parent, String comment)
		{ super(parent); this.comment = comment; }
	}

	public static final class ProcInstrNode extends Node {
		public final String instr;
		public ProcInstrNode(Node parent, String instr) { super(parent); this.instr = instr; }
	}

	public static DocumentNode parse(String SOrc)
	{
		Tokenizer t = new Tokenizer(SOrc);
		DocumentNode doc = new DocumentNode();
		Deque<ElementNode> stack = new ArrayDeque<>();

		while (t.hasMore()) {
			Token tk = t.next();
			switch (tk.type) {
				case TEXT -> docOrParentAdd(doc, stack.peek(), new TextNode(stack.peek(), tk.data));
				case COMMENT -> docOrParentAdd(doc, stack.peek(), new CommentNode(stack.peek(), tk.data));
				case PROCINSTR -> docOrParentAdd(doc, stack.peek(), new ProcInstrNode(stack.peek(), tk.data));
				case DOCTYPE -> docOrParentAdd(doc, stack.peek(), new DoctypeNode(stack.peek(), tk.data));
				case STARTTAG -> {
					ElementNode el = new ElementNode(stack.peek(), tk.tagName, tk.attrs, tk.selfClosing);
					docOrParentAdd(doc, stack.peek(), el);
					if(!tk.selfClosing){stack.push(el);}
				}
				case ENDTAG->
				{
					// pop until matching tag (case-insensitive); stop when stack is empty
					String endName = tk.tagName;
					while(!stack.isEmpty())
					{
						ElementNode top=stack.peek();
						if (top == null)
						{
							// defensive, should not happen now
							stack.pop();
							break;
						}
						if(equalsTag(top.tag, endName))
						{
							stack.pop();
							break;
						} else {
							// auto-close mismatched tag to be permissive
							stack.pop();
						}
					}
					// if nothing matched, ignore
				}
			}
		}

		return doc;
	}

	// helper: add node to document root or current parent
	private static void docOrParentAdd(DocumentNode doc, Node parent, Node child) {
		if(parent==null){doc.add(child);}
		else{parent.add(child);}
	}

	// token types and tokenizer
	private static final class Token {
		final TokenType type;
		final String data; // for TEXT, COMMENT, PROCINSTR, DOCTYPE
		final String tagName; // for STARTTAG/ENDTAG
		final LinkedHashMap<String,String> attrs; // for STARTTAG
		final boolean selfClosing;
		Token(TokenType type, String data) { this(type, data, null, null, false); }
		Token(TokenType type, String data, String tagName, LinkedHashMap<String,String> attrs, boolean sc) {
			this.type = type; this.data = data; this.tagName = tagName; this.attrs = attrs; this.selfClosing = sc;
		}
	}

	private enum TokenType { TEXT, STARTTAG, ENDTAG, COMMENT, DOCTYPE, PROCINSTR }

	private static final class Tokenizer
	{
		private final String s;
		private int i, n;
		Tokenizer(String s) { this.s = s == null ? "" : s; this.i = 0; this.n = this.s.length(); }

		boolean hasMore() { return i < n; }

		Token next()
		{
			if (peek() == '<') {
				if(match("<!--")){return new Token(TokenType.COMMENT,readUntil("-->"));}
				if (matchIgnoreCase("<!doctype")) {
					// consume until '>' balancing quotes loosely
					skipWhitespace();
					String dt = readUntil('>');
					// include the token up to '>' but remove trailing '>'
					if(dt.endsWith(">")){dt=dt.substring(0,dt.length()-1);}
					return new Token(TokenType.DOCTYPE, dt.trim());
				}
				if (match("<![CDATA[")) {
					String data = readUntil("]]>");
					return new Token(TokenType.TEXT, data);
				}
				if (match("<?")) {
					String pi = readUntil("?>");
					return new Token(TokenType.PROCINSTR, pi);
				}
				if (match("</")) {
					skipWhitespace();
					String name = readName();
					// consume until '>'
					readUntil('>');
					return new Token(TokenType.ENDTAG, null, name.toLowerCase(Locale.ROOT), null, false);
				}
				if (match("<")) {
					skipWhitespace();
					String name = readName();
					LinkedHashMap<String,String> attrs = new LinkedHashMap<>();
					while (true) {
						skipWhitespace();
						if(i>=n){break;}
						char c = peek();
						if (c == '>') { i++; break; }
						if (c == '/' && peek(1) == '>') { i+=2; return new Token(TokenType.STARTTAG, null, name.toLowerCase(Locale.ROOT), attrs, true); }
						if (c == '/') { i++; continue; }
						if (c == '>') { i++; break; }
						// attribute
						String key = readAttrName();
						if (key.isEmpty()) {
							// fallback: consume char and continue
							i++; continue;
						}
						String val = "";
						skipWhitespace();
						if (peek() == '=') {
							i++; skipWhitespace();
							val = readAttrValue();
						}
						attrs.put(key, val);
					}
					return new Token(TokenType.STARTTAG, null, name.toLowerCase(Locale.ROOT), attrs, false);
				}
			}
			// text until next '<'
			StringBuilder sb = new StringBuilder();
			while (i < n && peek() != '<') {
				sb.append(s.charAt(i++));
			}
			return new Token(TokenType.TEXT, sb.toString());
		}

		// small helpers for tokenizer
		private char peek() { return i < n ? s.charAt(i) : (char)-1; }
		private char peek(int ahead) { int j = i + ahead; return j < n ? s.charAt(j) : (char)-1; }
		private boolean match(String lit) {
			if (s.regionMatches(i, lit, 0, lit.length())) { i += lit.length(); return true; }
			return false;
		}
		private boolean matchIgnoreCase(String lit) {
			if (s.regionMatches(true, i, lit, 0, lit.length())) { i += lit.length(); return true; }
			return false;
		}
		private void skipWhitespace() { while (i < n && Character.isWhitespace(s.charAt(i))) i++; }
		private String readUntil(String terminator)
		{
			int start = i;
			int idx = s.indexOf(terminator, i);
			if (idx < 0) { // not found; consume rest
				i = n;
				return s.substring(start);
			} else {
				i = idx + terminator.length();
				return s.substring(start, i);
			}
		}
		private String readUntil(char end)
		{
			int start = i;
			while (i < n) {
				char c = s.charAt(i++);
				if(c==end){break;}
				if (c == '"' || c == '\'') {
					char q = c;
					while (i < n && s.charAt(i) != q) { i++; }
					if(i<n)
					{
						i++; // consume closing quote
					}
				}
			}
			return s.substring(start, Math.min(i, n));
		}
		private String readName() {
			int start = i;
			while (i < n) {
				char c = s.charAt(i);
				if(Character.isLetterOrDigit(c)||c=='-'||c==':'||c=='.'){i++;}
				else{break;}
			}
			return s.substring(start, i);
		}
		private String readAttrName() {
			int start = i;
			while (i < n) {
				char c = s.charAt(i);
				if(c=='='||c=='>'||c=='/'||Character.isWhitespace(c)){break;}
				i++;
			}
			return s.substring(start, i).trim();
		}
		private String readAttrValue() {
			skipWhitespace();
			if(i>=n){return "";}
			char q = s.charAt(i);
			if (q == '"' || q == '\'') {
				i++;
				int start = i;
				while (i < n && s.charAt(i) != q) i++;
				String v = s.substring(start, Math.min(i, n));
				if(i<n&&s.charAt(i)==q){i++;}
				return v;
			} else {
				// unquoted value until whitespace or > or /
				int start = i;
				while (i < n) {
					char c = s.charAt(i);
					if(Character.isWhitespace(c)||c=='>'||c=='/'){break;}
					i++;
				}
				return s.substring(start, i);
			}
		}
	}

	// tag-name compare tolerant (HTML is case-insensitive)
	private static boolean equalsTag(String a, String b) {
		if(a==null||b==null){return false;}
		return a.equalsIgnoreCase(b);
	}

	// Utilities for debugging / printing
	public static void dump(Node node, PrintWriter out) {
		dump(node, out, 0);
	}

	private static void dump(Node node, PrintWriter out, int indent)
	{
		String pad = "  ".repeat(Math.max(0, indent));
		if (node instanceof DocumentNode) {
			out.println(pad + "Document");
		} else if (node instanceof DoctypeNode dn) {
			out.println(pad + "Doctype: " + dn.text);
		} else if (node instanceof ElementNode en) {
			out.println(pad + "Element: <" + en.tag + "> attrs=" + en.attrs + (en.selfClosing ? " /" : ""));
		} else if (node instanceof TextNode tn) {
			out.println(pad + "Text: [" + escape(tn.text) + "]");
		} else if (node instanceof CommentNode cm) {
			out.println(pad + "Comment: [" + escape(cm.comment) + "]");
		} else if (node instanceof ProcInstrNode pn) {
			out.println(pad + "ProcInstr: [" + escape(pn.instr) + "]");
		} else {
			out.println(pad + node.getClass().getSimpleName());
		}
		for(Node c: node.children){dump(c,out,indent+1);}
	}

	private static String escape(String s) {
		return s.replace("\n", "\\n").replace("\r", "\\r");
	}

	public NOd<?,?> Reg_NOd(ConstL_Editr<?,?> ConstLAtn,NOd<?,?> PArnt,Object Typ_SOrc,String NAm,String DisplA)
	{
		NOd<?,?> TXt=ConstLAtn.ApNd_Child(PArnt);
		TXt.Set_NAm_Al_DisplAd(NAm,DisplA);
		TXt.Set_Typ(Typ_SOrc);

		return TXt;
	}
		public NOd<?,?> Reg_NOd(ConstL_Editr<?,?> ConstLAtn,NOd<?,?> PArnt,Object Typ_SOrc,String NAm)
		{	return Reg_NOd(ConstLAtn,PArnt,Typ_SOrc,NAm,NAm);   }
	public NOd Reg_NOd(ConstL_Editr<?,?> ConstLAtn,Node Doc,NOd<?,?> PArnt)
	{
		NOd<?,?> NOd=ConstLAtn.ApNd_Child(PArnt);
		for(Node P:Doc.children)
		{	Reg_NOd(ConstLAtn,P,NOd);   }
		switch(Doc)
		{
			case DocumentNode Node->
			{	Reg_NOd(ConstLAtn,NOd,"HTML_Doc","Document");   }
			case DoctypeNode Node->
			{	Reg_NOd(ConstLAtn,NOd,"Typ","text",Node.text);   }
			case ElementNode Node->
			{
				Reg_NOd(ConstLAtn,NOd,"HTML_Tag","tag",Node.tag);
				Map<String,String> Atributg=Node.attrs;
				for(String KE:Atributg.keySet())
				{	Reg_NOd(ConstLAtn,NOd,"FEld",KE,Atributg.get(KE));   }
			}
			case TextNode Node->
			{	Reg_NOd(ConstLAtn,NOd,"TXt_BoD","text",Node.text);   }
			case CommentNode Node->
			{	Reg_NOd(ConstLAtn,NOd,"COd_ComNt","comment",Node.comment);   }
			case ProcInstrNode Node->
			{	Reg_NOd(ConstLAtn,NOd,"Actn","instr",Node.instr);   }
			default->throw new IllegalStateException("Unexpected value: "+Doc);
		}

		return NOd;
	}
		public NOd<?,?> Reg_NOd(ConstL_Editr<?,?> ConstLAtn,Node Doc)
		{
			if(ConstLAtn.Get_NOd_A() instanceof NOd<?,?> PArnt)
			{
				NOd<?,?> Doc_NOd=Reg_NOd(ConstLAtn,Doc,PArnt);

				return Doc_NOd;
			}
			else
			{
				out.println("No node selected, to parse to.");

				return null;
			}
		}
	public static String TSt="C:\\Users\\Consc\\Desktop\\Entity\\Conscience Constellator\\Account\\Browser\\Conscience Constellator\\BookmRk\\CrOm\\favorites_6_5_21.html";
	public void PRs(String COd)
	{	Reg_NOd((ConstL_Editr<?,?>)ConstLAtn,parse(COd));   }
		public void PRs_FIl(String URL)
		{
			try
			{	PRs(LOd_String(URL));   }
			catch(IOException X)
			{	throw new RuntimeException(X);   }
		}
	// Example usage
	public static void main()
	{
		String html = """
			<!doctype html>
			<html lang="en">
			  <head>
				<meta charset="utf-8"/>
				<title>Test</title>
			  </head>
			  <body>
				<!-- a comment -->
				<div id="x" data-info="a&quot;value">
				  Hello <b>world</b>
				  <img src="icon.png" alt=ICON />
				  <script>console.log("x");</script>
				</div>
			  </body>
			</html>
			""";
		DocumentNode doc = parse(html);
		dump(doc,new PrintWriter(out, true));
	}

	public SimpleHtmlParser(ConstLAtn<?,?> ConstLAtn)
	{	super(ConstLAtn);   }
}