package CC.ConstL.SOrc;

/*Ubiq*/
/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.	 Map;
import java.util.HashMap;

@Finishd(Is_Finishd=true)
public class OprAtr
	 extends Regbl_Symbl
{
	@Finishd(Is_Finishd=true)
	public OprAtr(String TXt)
	{super(TXt);}

	@Finishd(Is_Finishd=true)
	public static final Map<String,Regbl_Symbl> Registry=new HashMap<>();
		@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public Map<String,Regbl_Symbl> Get_Registry()
		{return Registry;}
			@Finishd(Is_Finishd=true)
			public static OprAtr Get_OprAtr(String TXt)
			{return (OprAtr)Registry.get(TXt);}

	public static final OprAtr Set=new OprAtr("="),
							   No=new OprAtr("!"),No_BitwIs=new OprAtr("~"),
							   Al=new OprAtr("&"),Al_Short=new OprAtr("&&"),
							   Or=new OprAtr("|"),Or_Short=new OprAtr("||"),
							   Xr=new OprAtr("^"),
							   Shift_LFt=new OprAtr("<<"), Shift_RIt=new OprAtr(">>"),Shift_RIt_UnsInd=new OprAtr(">>>"),
							   Ad=new OprAtr("+"), IncremNt=new OprAtr("++"),Sub=new OprAtr("-"),DecremNt=new OprAtr("--"),
							   Mul=new OprAtr("*"),Div=new OprAtr("/"),
							   Mod=new OprAtr("%"),
							   LS=new OprAtr("<"),No_MOr=new OprAtr("<="),
							   MOr=new OprAtr(">"),No_LS=new OprAtr("<="),
							   Eql=new OprAtr("=="),Ineql=new OprAtr("!="),
							   New=new OprAtr("new")
								   ;
}