package CC.ConstL.SOrc;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.	  List;
import java.util.ArrayList;

import CC.ConstL.SOrc.Java.ArA_Init;
import CC.ConstL.SOrc.Java.Lamda_BoD;
import CC.List.Sub.List_REdr_To;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.REgn_Object;

import static CC.ConstL.SOrc.Abs_StRt.StRtfier;
import static CC.ConstL.SOrc.Regbl_Symbl.*;
import static CC.ConstL.SOrc.StAtmnt.StAtmnt_Stikfier;
import static CC.ConstL.Typ_Util.Cast;
import static CC.Encycloped.Abs.Org.Syc.TXt.$String.List$String;
import static CC.ConstL.SOrc.Java.Java_PRsr.*;
import static java.lang.System.out;

public class Blok extends REgn_Object implements Nd
{
	public static int Nd_Blok(int IndX)
	{	return IndX+1;}
	public static final List_REdr_To<PRsd_Object,PRsd_Object> Blok_REdr=new List_REdr_To<>()
														   {
															   @Override
															   public int REd(List<PRsd_Object> From,int IndX,int Nd,
																			  List<PRsd_Object>	 To)
															   {
																   while(       IndX<From.size())
																   {
																	   PRsd_Object Object=From.get(IndX);

																			if(Object.equals(Blok_Nd  ))
																	   {
																		   IndX+=1;
																		   break;
																	   }
																	   else if(Object.equals(Blok_StRt))
																	   {
																		   int StRt_IndX=IndX;
																		   List<PRsd_Object> Braketd_REgn=new ArrayList<>();
																		   IndX=REd(From,IndX+1,Nd,Braketd_REgn);

																		   Wat_To_Do_W_It:
																		   {
																			   if(IndX!=0)
																			   {
																				   out.println(IndX);

																				   PRsd_Object Prev=From.get(StRt_IndX-1);
																						if(Prev==ArA_Nd)
																				   {
																					   To.add(new ArA_Init(Braketd_REgn));
																					   break Wat_To_Do_W_It;
																				   }
																				   else if(Object==Lamda)
																				   {
																					   To.set(To.size()-1,new Lamda_BoD(Braketd_REgn));
																					   break Wat_To_Do_W_It;
																				   }
																			   }
																			   IndX=Ad_Item(new Blok(Braketd_REgn),IndX,To);
																		   }
																	   }
																	   else
																	   {   IndX=Ad_Item(Object,IndX,To);   }
																   }

																   return IndX;
															   }
														   };
	public static final List_REdr_To<PRsd_Object,Abs_StAtmnt> Blok_ContNt_Stikfier=(List<PRsd_Object> From,int IndX,int Nd,
															List<Abs_StAtmnt>	 To)->
														{
															StAtmnt_Stikfier.REd_StRNd(Cast(StRtfier.REd(From,IndX,Nd)),Cast(To));

															return Nd;
														};
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public List_REdr_To<PRsd_Object,PRsd_Object> Get_PRsr()
	{	return Cast(Blok_ContNt_Stikfier);   }
	@Finishd(Is_Finishd=true)
	public List<StAtmnt> ContNt;
	@Override
	public void Set(List<PRsd_Object> ContNt)
	{
//		out.println(ContNt);
		Object[] P=new Object[]{ContNt};
		this.ContNt=(List<StAtmnt>)P[0];
	}

	public String TMp_Prefx()
	{	return Get_Clas_NAm(this)+'('+ContNt.size()+')';}
	@Override
	public String toString(String IndNt)
	{
		return TMp_Prefx()+Blok_StRt.toString()+'\n'+List$String(ContNt,"\n")+'\n'+
						   Blok_Nd;
	}
	@Finishd(Is_Finishd=true)
	public String toString()
	{
		return TMp_Prefx()+Blok_StRt.toString()+'\n'+List$String(ContNt,"\n")+'\n'+
						   Blok_Nd;
	}

	@Finishd(Is_Finishd=true)
	public Blok(List<PRsd_Object> REgn)
	{
		super(REgn);
//		out.println(this);
	}
}