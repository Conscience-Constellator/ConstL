package CC.ConstL;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;

import static CC.COd.Neds_Ovrid.No;

public class Util
{
	public static final String For_TOkn  ="→" ,
							   For_TOkn_2="->",
							   Bak_TOkn  ="←" ,
							   Bak_TOkn_2="<-",
							   Cyclcl="↺",
							 Hand_Me_Down="^" ;
	@Finishd(Is_Finishd=true)
	public static boolean Is_Conectn_From_PArnt_TOkn(String String)
	{
		return String.equals(For_TOkn)||
			   String.equals(For_TOkn_2);
	}
	@Finishd(Is_Finishd=true)
	public static boolean Is_Conectn_From_Child_TOkn(String String)
	{
		return String.equals(Bak_TOkn)||
			   String.equals(Bak_TOkn_2);
	}
	public static String Get_Dr(boolean Is_Child)
	{
		return						   (Is_Child)?Bak_TOkn:
												  For_TOkn;
	}
		public static String Get_Dr_From_Child(Conectn<?,?> Conectn,NOd<?,?> PArnt)
			{	return Get_Dr(                                  Conectn.Get_NOd_B()        ==PArnt);   }
	@Finishd(Is_Finishd=true)
	static boolean Has_Dr(Object A,Object B)
	{	return A!=B;   }
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	static String Get_Dr_String(Object A1,Object B1,
								Object A2,Object B2)
	{
		return null;
//		return (A1==A2)?
//			   (B1==B2)?For_TOkn:Non:
//			   (Get_NOd_A()==B)?Forwrd:
	}

	@Finishd(Is_Finishd=true)
	public static final Object[] MpT=new Object[0];
}