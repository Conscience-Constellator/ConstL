package CC.ConstL.SOrc;

import CC.COd.Finishd;

import java.util.List;
import java.util.ArrayList;

import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.List.Sub.List_REdr_To;
import static CC.ConstL.SOrc.Java.Java_PRsr.*;
import static CC.ConstL.SOrc.Regbl_Symbl.*;
import static CC.Encycloped.Abs.Org.Syc.TXt.$String.List$String;

public class PRd_REgn extends Blok
{
	public static final List_REdr_To<PRsd_Object,PRsd_Object> PR_REdr=new List_REdr_To<>()
														 {
															 @Override
															 public int REd(List<PRsd_Object> From,int IndX,int Nd,List<PRsd_Object> To)
															 {
																 while(		IndX<Nd)
																 {
																	 PRsd_Object Item=From.get(IndX);

																		  if(Item.equals(  PR_Nd	 ))
																	 {
																		 IndX+=1;
																		 break;
																	 }
																	 else if(Item.equals(Blok_StRt))
																	 {
																		 List<PRsd_Object> Inr_Blok=new ArrayList<>();
																		 IndX=Blok_REdr.REd(From,IndX+1,Nd,Inr_Blok);
																		 To.add(new Blok(Inr_Blok));
																	 }
																	 else if(Item.equals(  PR_StRt))
																	 {
																		 List<PRsd_Object> PR=new ArrayList<>();
																		 IndX=REd(From,IndX+1,Nd,PR);
																		 To.add(new PRd_REgn(PR));
																	 }
																	 else
																	 {
																		 IndX=Ad_Item(Item,IndX,To);
																	 }
																 }

																 return IndX;
															 }
														 };

	@Finishd(Is_Finishd=true)
	public String toString()
	{return PR_StRt+List$String(Get_REgn(),",")+PR_Nd;}

	public PRd_REgn(List<PRsd_Object> REgn)
	{super(REgn);}
}