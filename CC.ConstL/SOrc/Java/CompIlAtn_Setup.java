package CC.ConstL.SOrc.Java;

import CC.List.Sub.List_REdr_To;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.ConstL.SOrc.ComNt;
import static CC.ConstL.SOrc.ComNt.Is_ComNt;
import static CC.ConstL.SOrc.Java.Setup_StAtmnt_Typ.Pakg;
import static CC.ConstL.SOrc.Java.Setup_StAtmnt_Typ.Import;
import static CC.ConstL.SOrc.Java.Java_PRsr.*;
import static CC.ConstL.SOrc.PRs.StAtmnt_Graplr;

public class CompIlAtn_Setup
{
	public static final List_REdr_To<PRsd_Object,PRsd_Object> CompIlAtn_Setup_REdr=(From,IndX,Nd,To)->
																				{
																					boolean Has_Pakg_StAtmnt=false;
																					for(PRsd_Object Object;IndX <Nd;)
																					{
																						Object=From.get(IndX);
						
																							 if(Object==Import)
																						{	IndX=StAtmnt_Graplr.REd_SegmNtd(From,IndX,Nd,To);}
																						else if(Object==Pakg)
																						{
																								 if(Has_Pakg_StAtmnt)
																							{	throw new RuntimeException("Package declaration already found.\n"+
																															List_So_FR_StAtmnt(To));
																							}
						
																							IndX=StAtmnt_Graplr.REd_SegmNtd(From,IndX,Nd,To);
						
																							Has_Pakg_StAtmnt=true;
																						}
																						else if(Is_ComNt(Object))
																						{	IndX=Ad_Item(new ComNt(Object.toString()),IndX,To);}
																						else
																						{	break;}
																					}

																					return IndX;
																				};

	public	 CompIlAtn_Setup()
	{}
}