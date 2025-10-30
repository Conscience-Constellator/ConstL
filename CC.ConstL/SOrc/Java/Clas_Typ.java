package CC.ConstL.SOrc.Java;

/*Ubiq*/
import CC.COd.Finishd;

import CC.List.Sub.List_REdr_To;

import static CC.ConstL.SOrc.ComNt.Is_ComNt;
import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.QOt;
import CC.ConstL.SOrc.ComNt;
import CC.ConstL.SOrc.KEwrd;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import static CC.ConstL.SOrc.Java.Java_PRsr.*;

public class Clas_Typ extends KEwrd
{
	public Clas_Typ(String NAm)
	{super(NAm);}

	public static final Clas_Typ Clas=new Clas_Typ("class"	 ),
							  IntrfAc=new Clas_Typ("interface"),
								 Enum=new Clas_Typ("enum"	 ),
								 Rcrd=new Clas_Typ("record"	 );
		@Finishd(Is_Finishd=true)
		public static Clas_Typ Get_Clas_Typ(Object Object)
		{
			return switch(Object.toString())
			{
				case "class"	->Clas;
				case "interface"->IntrfAc;
				case "enum"		->Enum;
				case "record"	->Rcrd;
				default			->null;
			};
		}
		
	public static final List_REdr_To<PRsd_Object,PRsd_Object> Clas_Typ_REdr=(From,IndX,Nd,To)->
																		 {
																			 for(;IndX<Nd
																				 ;IndX+=1)
																			 {
																				 PRsd_Object		  Object=From.get(IndX);

																					  if(Get_Clas_Typ(Object) instanceof Clas_Typ PRsd_Clas_Typ)
																				 {
																					 IndX=Ad_Item(								  PRsd_Clas_Typ,IndX,To);

																					 break;
																				 }
																				 else if(	 Is_ComNt(Object))
																				 {	 IndX=Ad_Item(new ComNt(Object),IndX,To);}
																				 else
																				 {	 throw new RuntimeException("Invalid class type "+QOt(Object)+'\n'+
																											   List_So_FR_StAtmnt(To));
																				 }
																			 }

																			 return IndX;
																		 };
}