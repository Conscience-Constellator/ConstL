package CC.ConstL.SOrc;

/*Ubiq*/
import CC.COd.Finishd;

import CC.Encycloped.Abs.Org.Syc.TXt.Cond.ChR_Eval;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.List.Sub.List_REdr_To;

import static CC.ConstL.Invalid_X.ThrO_Invalid;
import static CC.ConstL.SOrc.ComNt.Is_ComNt;
import static CC.ConstL.SOrc.Java.Java_PRsr.Ad_Item;
import static CC.ConstL.SOrc.Java.Java_PRsr.List_So_FR_StAtmnt;
import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.QOt;
import static java.lang.Character.isLetterOrDigit;

public class NAm
	 extends Symbl
{
	public static final List_REdr_To<PRsd_Object,PRsd_Object> Clas_NAm_REdr=(From,IndX,Nd,To)->
																		 {
																			 while(IndX<Nd)
																			 {
																				 PRsd_Object Object=From.get(IndX);
				
																					  if(Is_ID(Object))
																				 {
																					 IndX=Ad_Item(new NAm(Object),IndX,To);
				
																					 break;
																				 }
																				 else if(	Is_ComNt(Object))
																				 {	IndX=Ad_Item(new ComNt(Object),IndX,To);}
																				 else
																				 {	throw new RuntimeException("Invalid class name "+QOt(Object)+'\n'+
																												 List_So_FR_StAtmnt(To));
																				 }
																			 }
				
																			 return	IndX;
																		 };

	@Finishd(Is_Finishd=true)
	public static ChR_Eval Is_ID_ChR=(ChR)->
	{
		return isLetterOrDigit(ChR)	   ||
							   ChR=='_'||
							   ChR=='$';
	};
	@Finishd(Is_Finishd=true)
	public static boolean Is_ID(Object TOkn)
	{
		return TOkn instanceof String NAm&&
				   Is_ID_ChR.ChR$Bool(NAm,0);
	}
	@Finishd(Is_Finishd=true)
	public static String ThrO_Invalid_ID(String TOkn)
	{
		return (Is_ID(TOkn))?TOkn:
		   ThrO_Invalid("ID",TOkn);
	}

	@Finishd(Is_Finishd=true)
	public NAm(String NAm)
	{
		super(NAm);
		ThrO_Invalid_ID(NAm);
	}
		@Finishd(Is_Finishd=true)
		public NAm(Object NAm)
		{this(NAm.toString());}
}