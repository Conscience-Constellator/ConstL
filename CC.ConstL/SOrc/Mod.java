package CC.ConstL.SOrc;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import static CC.ConstL.SOrc.Java.AccS.Get_AccS;
import static CC.ConstL.SOrc.Java.Bindng_Mod.Get_Bindng_Mod;

public class Mod extends KEwrd
{
	public static final Mod NAtv=new Mod("native"),
					   Strict_FP=new Mod("strictfp"),
						   Syncd=new Mod("synchronized"),
							Tran=new Mod("transient"),
						 VolitIl=new Mod("volatile");
	public static boolean Is_Othr(String Wrd)
	{return Get_Othr(Wrd)!=null;}
		public static boolean Is_Othr(Object Object)
		{return Is_Othr(Object.toString());}
	public static Mod Get_Othr(String Wrd)
	{
		return switch(Wrd)
		{
			case "native"	   ->NAtv	  ;
			case "strictfp"	   ->Strict_FP;
			case "synchronized"->Syncd	  ;
			case "transient"   ->Tran	  ;
			case "volatile"	   ->VolitIl  ;
			default			   ->null	  ;
		};
	}
	public static boolean Is_Mod(String TOkn)
	{	return Get_Mod(TOkn)!=null;	  }
	public static Mod Get_Mod(String TOkn)
	{
		return (Get_AccS	  (TOkn) instanceof Mod AccS  )?AccS  :
			   (Get_Bindng_Mod(TOkn) instanceof Mod Bindng)?Bindng:
			   (Get_Othr	  (TOkn) instanceof Mod Othr  )?Othr  :
															null  ;
	}

	public Mod(String Wrd)
	{super(			  Wrd);}
}