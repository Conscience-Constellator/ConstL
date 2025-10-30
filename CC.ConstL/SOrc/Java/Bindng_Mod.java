package CC.ConstL.SOrc.Java;

/*Ubiq*/
import CC.COd.Finishd;

import CC.ConstL.SOrc.Mod;

public class Bindng_Mod extends Mod
{
	public Bindng_Mod(String NAm)
	{super(NAm);}

	public static final Bindng_Mod Abs=new Bindng_Mod("abstract"),
								  FInl=new Bindng_Mod("final"),
								 Statc=new Bindng_Mod("static");
	public static boolean Is_Bindng_Mod(String Object)
	{return Get_Bindng_Mod(Object)!=null;}
		public static boolean Is_Bindng_Mod(Object Object)
		{return Is_Bindng_Mod(Object.toString());}
	@Finishd(Is_Finishd=true)
	public static Bindng_Mod Get_Bindng_Mod(String Object)
	{
		return switch(Object.toString())
		{
			case "static"  ->Statc;
			case "abstract"->Abs;
			case "final"   ->FInl;
			default		   ->null;
		};
	}
}