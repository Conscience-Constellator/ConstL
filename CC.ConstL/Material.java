package CC.ConstL;

import CC.$.Q$.Point$;
import CC.COd.Finishd;
import CC.COd.Inheritd_Constructr;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
import org.jetbrains.annotations.NotNull;

import CC.ConstL.Parntd.Parntd_Imp;
import static CC.ConstL.Invalid_X.ThrO_Invalid_SOrc;
import static CC.ConstL.Util.MpT;
import static CC.Encycloped.Abs.Scal.Physc.Colr.Colr.*;
import static CC.Util.Fun.V.V;
import java.awt.Color;
import static CC.List.FrEch.FrEch;
import static java.awt.Color.*;

import java.util.Map;
import java.util.HashMap;

public class			Material
	 extends Parntd_Imp<Material>
{
	@Finishd(Is_Finishd=true)
	private Color Colr,Colr_ShOn;
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public Color Get_Colr()
		{return Colr;}
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public void Set_Colr(@NotNull Color Colr)
		{this.Colr=Colr;}
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public Color Get_Colr_ShOn()
		{return Colr_ShOn;}
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public void Set_Colr_ShOn(@NotNull Color Colr)
		{Colr_ShOn=Colr;}

	public static int Dfalt_OpaciT=32;
	public static int Dfalt_OpaciT_=1/8;
		public static Color Dfalt_Colr(int R,int G,int B)
		{return new Color(R,G,B,Dfalt_OpaciT);}
		public static Color Dfalt_Colr(float R,float G,float B)
		{return new Color(R,G,B,Dfalt_OpaciT_);}
			public static Color Dfalt_Colr(Color Colr)
			{
				return Dfalt_Colr(Colr.getRed  (),
								  Colr.getGreen(),
								  Colr.getBlue ());
			};
	public static int FAnt_OpaciT=16;
	public static int FAnt_OpaciT_=1/16;
		public static Color FAnt_Colr(int R,int G,int B)
		{return new Color(R,G,B,FAnt_OpaciT);}
		public static Color FAnt_Colr(float R,float G,float B)
		{return new Color(R,G,B,FAnt_OpaciT_);}
		public static Color FAnt_Colr(Color Colr)
		{
			return FAnt_Colr(Colr.getRed  (),
							 Colr.getGreen(),
							 Colr.getBlue ());
		};
	@Finishd(Is_Finishd=true)
	public static Color Get_Colr_From_Material(Object SOrc)
	{return Gar_Material(SOrc).Get_Colr();}
	@Finishd(Is_Finishd=true)
	public static Color Gar_Colr(			   Object SOrc)
	{
		return (SOrc instanceof Color	 Colr	 )?						 Colr  :
			   (SOrc instanceof Material Material)?	   Material		.Get_Colr():
			   (SOrc instanceof String	 NAm	 )?Get_Material(NAm).Get_Colr():
												   ThrO_Invalid_SOrc("Color",SOrc);
	}

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	public void Inherit(@NotNull Material Parnt)
	{Set_Colr(Parnt.Get_Colr());}

	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public boolean Is_Don()
	{return Get_Colr()!=null;}

	@Inheritd_Constructr(VRgfId=false) @Finishd(Is_Finishd=true)
	public Material(String NAm,
					Object[] Parntg)
	{super(NAm,Parntg);}
		@Inheritd_Constructr(VRgfId=false) @Finishd(Is_Finishd=true)
		public Material(String NAm)
		{super(NAm);}

		@Finishd(Is_Finishd=true)
		public Material(String NAm,
						Object Colr_SOrc,
						Object[] Parntg)
		{
			this(NAm,Parntg);
			Init_Colr(Gar_Colr(Colr_SOrc));
		}
			@Finishd(Is_Finishd=true)
			public Material(String NAm,
							Object Colr_SOrc)
			{this(NAm,Colr_SOrc,MpT);}

		@Inheritd_Constructr(VRgfId=false) @Finishd(Is_Finishd=true)
		public Material(String NAm,
						int TAks_Aftr,Object[] Parntg)
		{super(NAm,TAks_Aftr,Parntg);}

	//<editor-fold desc="Reg">
	@Finishd(Is_Finishd=true)
	public static final Map<String,Material> Registry=new HashMap<>();
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public final Map<String,Material> Get_Registry()
		{return Registry;}
		@Finishd(Is_Finishd=true)
		public static Material Get_Material(String NAm)
		{
			Material Material=Registry.get(NAm);

			return (Material!=null)?Material:
									//ThrO_Invalid_SOrc("Material",NAm)
									Registry.get("Err_Material")
									;
		}
		@Finishd(Is_Finishd=true)
		public static Material Gar_Material(Object SOrc)
		{
			return (SOrc instanceof Material Material)?	   Material			  :
				   (SOrc instanceof String	 ID		 )?Get_Material(ID)		  :
							   ThrO_Invalid_SOrc(		  "Material",SOrc);
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final Material Gar_Parnt(Object SOrc)
			{return Gar_Material(SOrc);}
		public static void FrEch_Material(Point$<Material> Do)
		{FrEch(Registry.values(),Do);}
	//</editor-fold>
	public static final Color Dfalt_Colr=Dfalt_Colr(191,191,255);
	public static final Color		Glas=new Color(192,192,255,16);
	public static final String BlNdr="(BlNdr)";
	static
	{
		/*
		new ConstLatn_Typ("Dfalt");
		new ConstLatn_Typ("Ncyclopedia");
		new ConstLatn_Typ("Philosophy");
		new ConstLatn_Typ("Abstract prpos");
		new ConstLatn_Typ("Pointr");
		new ConstLatn_Typ("Modul");
		new ConstLatn_Typ("Java clas");
		new ConstLatn_Typ("Java intrfAc");
		new ConstLatn_Typ("Java rcrd");
		new ConstLatn_Typ("Java enum");*/
		new Material("Dfalt",Dfalt_Colr);
//		new Material("NOd",Dfalt_Colr);
		new Material("ConstL_Object"+BlNdr,new Color(.006041F,.301466F,0F,.278896F));
		new Material("NOd",Dfalt_Colr(255,255,255));
		new Material("Conectn",new Color(.8F,.075299F,.571741F));
		new Material("Conectn",Dfalt_Colr);
		new Material("Glas",Glas);

		new Material("Philosophy",Dfalt_Colr(255,255,255));
		new Material("Grup",new Color(1,1,1,.25F));
		new Material("Thout",Dfalt_Colr(192,192,255));
			new Material("TXt",//Dfalt_Colr(.75F,1,.25F),
									  new Color(.5F,1,.25F,.75F),V("Thout"));
				new Material("TXt_BoD",0,V("TXt"));
					new Material("PhonEm",Dfalt_Colr(224,224,255),V("TXt_BoD"));
					new Material("Abreviatn",Dfalt_Colr(192,255,192),V("TXt_BoD"));
		new Material("Com",Dfalt_Colr(0,0,255));
		new Material("Com",Dfalt_Colr(255,0,255));
		new Material("Oposit",Dfalt_Colr(255,0,255));
			new Material("Oposit_A",Dfalt_Colr(255,0,0));
			new Material("Oposit_B",Dfalt_Colr(0,0,255));
		new Material("Ncyclopedia",Dfalt_Colr(255,255,255));
		new Material("Abs prpos",Dfalt_Colr(0,0,255));
		new Material("Pointr",Dfalt_Colr(255,0,0));

		new Material("Impropr",Dfalt_Colr);
		new Material("Dubious",Dfalt_Colr);

		new Material("Typ", Set_A(green,64));
		new Material("Inst",Dfalt_Colr(green ));
		new Material("Inst_O",new Color(128,128,255,16));
		new Material("Actn",Dfalt_Colr(yellow));
		new Material("SeqNc",Set_A(white,(int)(255*.25)));
		new Material("Suport",Dfalt_Colr(0,255,255));
		new Material("Contiguous",new Color(.313154F,.313154F,.313154F));
		new Material("RlAt",new Color(128,255,0,128));
		new Material("DpNdNC",new Color(255,128,128,32));
		new Material("DpNdNC_Dubious",new Color(255,64,64,128),V("DpNdNC","Dubious"));

		// <editor-fold desc="DOF">
		new Material("DOF",new Color(.16066F,0,1,1));
			new Material("DOF"+BlNdr,new Color(.16066F,0,1,1));

			new Material("PODOF",red);
				new Material("PODOF"+BlNdr,red);

				new Material("Mul_PODOF",Set_B(red,.124682F),V("PODOF"));
					new Material("Mul_PODOF"+BlNdr,Set_B(red,.124682F),V("PODOF"+BlNdr));

					new Material("SpAc",new Color(.077462F,0,1,1));
		//</editor-fold desc="DOF">

		new Material("Ncycloped",Dfalt_Colr(.5F,.7F,.6F));

		new Material("Xampl",Dfalt_Colr(.4F,1,.4F));

		new Material("IntrfAc",Dfalt_Colr(255,255,223));
			new Material("Rsult_Tabl",Dfalt_Colr(128,255,128));
			new Material("!_PAr",Dfalt_Colr(255,0,255));

		new Material("Rducs_To",Dfalt_Colr(255,192,128));

		new Material("Contiguous",Set_A(white,.071313F));
		new Material("Proxy",FAnt_Colr(1,.75F,.5F));
		new Material("ManifStAtn",FAnt_Colr(.5F,.75F,1));

		new Material("FEld",new Color(0,.301693F,.8F));

		new Material("RAtng",Dfalt_Colr(1,.75F,.5F));

		// <editor-fold desc="COd">
		new Material("COd_ComNt",Dfalt_Colr(64,64,64),V("TXt_BoD"));
		new Material("COd_Typ",0,V("Typ"));
		new Material("COd_Inst",0,V("Inst"));
			new Material("Impropr_Typ",0,V("COd_Typ"));
			new Material("Prim_Typ",Dfalt_Colr(red),V("COd_Typ"));
			new Material("Prim_Inst",red,V("COd_Inst"));
			new Material("COd_Clas",0,V("COd_Typ"));
			new Material("COd_Clas_Inst",0,V("COd_Inst"));
			new Material("GNerc",new Color(0,.225747F,.8F,1),V("COd_Typ"));
				new Material("GNerc_StRt",new Color(.4F,.8F,.8F,1),V("GNerc"));
				new Material("GNerc_Nd",new Color(0,.8F,.8F,1),V("GNerc"));

		new Material("COd_Functn",0,V("Actn"));
			new Material("COd_Functn"+BlNdr,new Color(.8F,.633756F,.214662F,.377255F),V("Actn"));

			new Material("Op",new Color(0,.356466F,.8F,.257074F),V("COd_Functn"));
				new Material("Op"+BlNdr,new Color(0,.356466F,.8F,.257074F),V("COd_Functn"));

			new Material("COd_Blok",Dfalt_Colr(lightGray),V("COd_Functn"));
			new Material("COd_StAtmnt",Dfalt_Colr(gray),V("COd_Functn"));
			new Material("PR_Com",new Color(.8F,0,.208217F,1));

			new Material("Modul_Functn",new Color(.8F,.772258F,.316784F),V("COd_Functn"));
			new Material("Method",0,V("COd_Functn"));
				new Material("Inst_Method",Dfalt_Colr(yellow),V("Method"));
					new Material("Method_OvrId",new Color(.8F,.208217F,0F),V("Method"));
						new Material("Method_OvrId"+BlNdr,new Color(.8F,.208217F,0F),V("Method"));
					new Material("Method_Abs",new Color(.8F,.143252F,0F,.322629F),V("Inst_Method"));
						new Material("Method_Abs"+BlNdr,new Color(.8F,.143252F,0F,.322629F),V("Inst_Method"));
				new Material("Stat_Method",Dfalt_Colr(192,192,64),V("Method"));
				new Material("COd_Functn_Cal",0,V("COd_Functn","Inst"));
			new Material("Constructr","COd_Typ",V("COd_Functn"));

		new Material("MMbr",Dfalt_Colr(128,255,64));
			new Material("Inst_MMbr",Dfalt_Colr(96,255,96),V("MMbr"));
			new Material("Clas_MMbr",Dfalt_Colr(96,128,96),V("MMbr"));
		new Material("COd_Script",Dfalt_Colr(192,128,96));
		new Material("COd_Xeptn",Set_A(red,.257074F));

		new Material("COd_Pakg",Set_A(white,64));
		new Material("COd_Pakg",new Color(196,196,255,64));
			new Material("COd_Pakg"+BlNdr,new Color(255,255,255,64));
		new Material("COd_Library",Dfalt_Colr(64,64,64));
		new Material("COd_Modul",Dfalt_Colr(255,128,0));

		new Material("COd_Pakg_Al_Modul",Dfalt_Colr(255,192,128));

		new Material("Program",new Color(64,0,64,128));
		new Material("XtNsn",new Color(96,48,64,64));
		new Material("Mod",Dfalt_Colr(128,64,16));
			new Material("Mod_Lin",Dfalt_Colr(128,96,16));
		new Material("Programng_Lang",new Color(64,32,64,64));

		new Material("Java_Clas",(false)?Dfalt_Colr(blue):Set_A(blue,64),V("COd_Typ"));
			new Material("Java_Clas"+BlNdr,new Color(.000001F,0F,.5F,.25F),V("COd_Typ"));
			new Material("Java_Clas"+BlNdr,new Color(0,0,128,64),V("COd_Typ"));
		new Material("Java_Clas_Abs",Dfalt_Colr(0,0,128),V("Java_Clas"));
			new Material("Java_Clas_Abs"+BlNdr,new Color(0F,.080481F,1F,1F),V("Java_Clas"));
		new Material("Java_Clas_FInl",new Color(.001628F,0F,.320172F,.34448F),V("Java_Clas"));
			new Material("Java_Clas_FInl"+BlNdr,new Color(.001628F,0F,.320172F,.34448F),V("Java_Clas"));
		new Material("Java_Clas_Abs_FInl",new Color(.001628F,0F,.320172F,.34448F),V("Java_Clas_Abs","Java_Clas_FInl"));
		new Material("Java_Xeptn",new Color(255,64,0,192)/*Jasper*/,V("COd_Typ"));
		new Material("Java_IntrfAc",Dfalt_Colr(255,255,0),V("COd_Typ"));
			new Material("Java_IntrfAc"+BlNdr,new Color(.134534F,1F,.8F,.257074F),V("COd_Typ"));
			new Material("Java_IntrfAc(BlNdr2)",new Color(.638011F,.8F,0F,.158746F),V("COd_Typ"));
			new Material("Java_IntrfAc(BlNdr3(Prob RIt))",new Color(.8F,.645763F,0,.257074F),V("COd_Typ"));
		new Material("Java_AnOt",Dfalt_Colr(255,255,128),V("Java_IntrfAc"));
			new Material("Java_AnOt"+BlNdr,new Color(.679027F,.8F,.233214F,1F),V("Java_IntrfAc"));
		new Material("Java_Enum",Dfalt_Colr(255,0,255),V("Impropr_Typ"));
			new Material("Java_Enum"+BlNdr,new Color(.8F,0,0.475615F),V("Impropr_Typ"));
		new Material("Java_Rcrd",Dfalt_Colr(255,128,0),V("Impropr_Typ"));
			new Material("Java_Rcrd"+BlNdr,new Color(.8F,.128621F,0),V("Impropr_Typ"));
		new Material("Python_Clas",0,V("Typ"));
		new Material("JS_Clas",0,V("Typ"));
		new Material("JS_Modul",0,V("COd_Script"));

		new Material("HTML_Tag",Dfalt_Colr(0,128,0));
		new Material("HTML_Doc",Dfalt_Colr(0,128,0));
		//<editor-fold desc="COd">

		new Material("FIl_Structr",Dfalt_Colr(darkGray));
			new Material("FIl_Structr"+BlNdr,new Color(.008573F,0F,.8F,.349998F));

			new Material("FIl",Dfalt_Colr(gray),V("FIl_Structr"));
				new Material("FIl_Pakd",Dfalt_Colr(darkGray),V("FIl"));

			new Material("FOl",Dfalt_Colr(yellow),V("FIl_Structr"));
				new Material("FOl"+BlNdr,new Color(.8F,.63551F,.103198F,.349998F),V("FIl_Structr"));

				new Material("StOrg_DvIc",Dfalt_Colr(lightGray),V("FOl"));
			new Material("Shortcut",new Color(0,.337163F,.799103F,.349998F),V("FIl"));

			new Material("Map_FIl",Dfalt_Colr(255,192,64),V("FIl"));
			new Material("TXt_FIl",Dfalt_Colr(192,192,192),V("FIl"));

		new Material("AI_GN",new Color(0F,.843703F,.038957F,.349998F),V("FOl"));
			new Material("Img_GN+Prompt",new Color(0F,.843703F,.038957F,.349998F),V("AI_GN"));
			new Material("Img_GN+URL",new Color(0F,.843703F,.038957F,.349998F),V("AI_GN"));
			new Material("Img_GN+Data",new Color(0F,.843703F,.038957F,.349998F),V("AI_GN"));

		new Material("WebsIt",Dfalt_Colr(white));
			new Material("Auxilry_SIt",Dfalt_Colr(white),V("WebsIt"));

		new Material("Son",Dfalt_Colr(128,128,255));
			new Material("PhonEm",Dfalt_Colr(96,96,255),V("Son"));

		new Material("Todo",Dfalt_Colr(128,255,128));
		new Material("Don",Dfalt_Colr(255,128,128));
		new Material("Ongong",Dfalt_Colr(64,128,192));
		new Material("Do_Upon",Dfalt_Colr(0,128,192));
		new Material("Plan",Dfalt_Colr(255,255,192));

		new Material("TSt0",Dfalt_Colr(red));
		new Material("TSt1",Dfalt_Colr(green));
		new Material("TSt2",Dfalt_Colr(blue));
		new Material("TSt3",Dfalt_Colr(white));
		new Material("Shufl",Shufl_Colr());

		new Material("Err_Material",red);

		/*Style:
		 *Wave front like new plant growth; light green, & smooth.
		 *Wave front like burning paper's edge; orange.*/
	}
}