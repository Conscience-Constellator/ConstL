package CC.ConstL.SOrc.Java;

/*Ubiq*/
import		  CC.COd.Finishd;

import CC.ConstL.SOrc.Mod;

public class AccS extends Mod
{
	public AccS(String NAm)
	{super(NAm);}

	public static final AccS Publc=new AccS("public"),
							 Dfalt=new AccS("default"),
						  Protectd=new AccS("protected"),
							Privat=new AccS("private");
	public static boolean Is_AccS(String Object)
	{return Get_AccS(Object.toString())!=null;}
		public static boolean Is_AccS(Object Object)
		{return Is_AccS(Object.toString());}
		@Finishd(Is_Finishd=true)
		public static AccS Get_AccS(String Object)
		{
			return switch(Object.toString())
			{
				case "public"	->Publc;
				case "default"	->Dfalt;
				case "protected"->Protectd;
				case "private"	->Privat;
				default			->null;
			};
		}
}