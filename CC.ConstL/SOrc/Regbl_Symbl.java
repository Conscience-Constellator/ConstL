package CC.ConstL.SOrc;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Alias;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.Map;
import java.util.HashMap;
import static CC.ConstL.SOrc.KEwrd.Get_KEwrd;
import static CC.ConstL.SOrc.Nd.Nul;
import static CC.ConstL.SOrc.OprAtr.Get_OprAtr;

@Finishd(Is_Finishd=true)
public class Regbl_Symbl
	 extends	   Symbl
{
	@Finishd(Is_Finishd=true)
	public Regbl_Symbl(String TXt)
	{
		super(TXt);
		Registr();
	}

	@Finishd(Is_Finishd=true)
	public static Map<String,Regbl_Symbl> Registry=new HashMap<>();
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public Map<String,Regbl_Symbl> Get_Registry()
		{return Registry;}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final void Registr()
			{Get_Registry().put(Get_String(),this);}
			public static Regbl_Symbl Get_Misc_Symbl(String TXt)
			{	return Registry.get(TXt);}
			@Finishd(Is_Finishd=false)
			public static Symbl Get_Symbl(String TOkn)
			{
				return (Get_Misc_Symbl(TOkn) instanceof Symbl Symbl	)?Symbl:
					   (Get_OprAtr	  (TOkn) instanceof Symbl OprAtr)?OprAtr:
					   (Get_KEwrd	  (TOkn) instanceof Symbl KEwrd	)?KEwrd:
																	  null;
			}
				@Alias @Finishd(Is_Finishd=true)
				public static Symbl Get_Regbl_Symbl(String TOkn)
				{return Get_Symbl(TOkn);}
		@Finishd(Is_Finishd=true)
		public static Regbl_Symbl StAtmnt_Nd=Nul,
										LAbl=new Regbl_Symbl(":"),
									  Lamda=new Regbl_Symbl("->"),
									Calbl_RF=new Regbl_Symbl("::"),
								List_Dlimitr=new Regbl_Symbl(","),
										 Dot=new Regbl_Symbl("."),
										 VRg=new Regbl_Symbl("..."),
									ArA_StRt=new Regbl_Symbl("["),ArA_Nd=new Regbl_Symbl("]"),
									/*TrE*/
									Blok_StRt=new Regbl_Symbl("{"),Blok_Nd=new Regbl_Symbl("}"),
										PR_StRt=new Regbl_Symbl("("),PR_Nd=new Regbl_Symbl(")"),
										Typ_PR_StRt=new Regbl_Symbl("<"),Typ_PR_Nd=new Regbl_Symbl(">"),
									String_StRt=new Regbl_Symbl("\"");

	static
	{
		try
		{	Class.forName("CC.ConstL.SOrc.KEwrd");}
		catch(ClassNotFoundException X)
		{	throw new RuntimeException(X);}
	}
}