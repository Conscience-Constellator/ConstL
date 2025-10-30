package CC.ConstL.SOrc.Java;

import CC.List.Sub.List_REdr_To;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import static CC.ConstL.SOrc.Java.CompIlAtn_Setup.CompIlAtn_Setup_REdr;
import static CC.ConstL.SOrc.Java.Clas.Clas_REdr;

public class CompIlAtn_Unit
{
	public static final List_REdr_To<PRsd_Object,PRsd_Object> CompIl_Unit_REdr=(From,IndX,Nd,To)->
														   {
															   CompIlAtn_Setup_REdr.REd(From,IndX,Nd,To);
															   for(;IndX<Nd
																   ;IndX=Clas_REdr.REd(From,IndX,Nd,To));

															   return IndX;
														   };
}