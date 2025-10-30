package CC.ConstL.SOrc.Java;

/*Ubiq*/
import CC.COd.Finishd;

import CC.ConstL.SOrc.Abs_StAtmnt;
import CC.List.Sub.List_REdr_To;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.ConstL.SOrc.Hed_BoD;
import static CC.ConstL.SOrc.NAm.Clas_NAm_REdr;
import static CC.ConstL.SOrc.Java.AnOtg.AnOtg_REdr;
import static CC.ConstL.SOrc.Java.Java_PRsr.BoD_REdr;
import static CC.ConstL.SOrc.Java.Java_PRsr.List_So_FR_StAtmnt;
import static CC.ConstL.SOrc.Java.XtNsn_Info.Parntg_REdr;
import		  CC.ConstL.SOrc.Nd;
import static CC.ConstL.SOrc.Modg.Modg_REdr;
import static CC.ConstL.SOrc.Java.Clas_Typ.Clas_Typ_REdr;

public class Clas extends Hed_BoD<Clas_Hedr,Nd>
{
	public static final List_REdr_To<PRsd_Object,PRsd_Object> Clas_REdr=(From,IndX,Nd,To)->
																	 {
																		 try
																		 {
																			 IndX=	AnOtg_REdr.REd(From,IndX,Nd,To);
//																			 out.println(IndX+","+Nd+','+From.get(IndX));
																			 IndX=	Modg_REdr.REd(From,IndX,Nd,To);
//																			 out.println(IndX+","+Nd+','+From.get(IndX));
																			 IndX=Clas_Typ_REdr.REd(From,IndX,Nd,To);
//																			 out.println(IndX+","+Nd+','+From.get(IndX));
																			 IndX=Clas_NAm_REdr.REd(From,IndX,Nd,To);
//																			 out.println(IndX+","+Nd+','+From.get(IndX));
																			 IndX=  Parntg_REdr.REd(From,IndX,Nd,To);
//																			 out.println(IndX+","+Nd+','+From.get(IndX));
																			 IndX=	 BoD_REdr.REd(From,IndX,Nd,To);
																		 }
																		 catch(Exception X)
																		 {
																			 throw new RuntimeException("Error reading class."+'\n'+
																										List_So_FR_StAtmnt(To),X);
																		 }

																		 return						 IndX;
																	 };

	@Finishd(Is_Finishd=true)
	public Clas(Abs_StAtmnt<Nd> Abs)
	{	super(Abs);	  }
}