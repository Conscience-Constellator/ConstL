package CC.ConstL.SOrc.Java;

import CC.COd.Finishd;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.Ok;

import CC.ConstL.SOrc.AdrS;
import CC.ConstL.SOrc.NAm;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.List.Sub.List_REdr_To;

import java.util.ArrayList;
import java.util.List;

import static CC.ConstL.SOrc.AdrS.AdrS_REdr;
import static CC.ConstL.SOrc.Java.AnOt.AnOt_StRt;
import static CC.Encycloped.Abs.Org.Syc.TXt.$String.List$String;

public class AnOtg implements PRsd_Object
{
	public List<AnOt> AnOtg;

	@Finishd(Is_Finishd=true)
	public static List_REdr_To<PRsd_Object,PRsd_Object> AnOtg_REdr=(From,IndX,Nd,To)->
																{
																	while(IndX<Nd&&From.get(IndX)==AnOt_StRt)
																	{
																		IndX+=1;
																		List Branchg=new ArrayList<>();
																		IndX=AdrS_REdr.REd(From,IndX,Nd,Branchg);
																		List<PRsd_Object> PR_List=new ArrayList<>();
//																		AnOt_PRg PRg=AnOt_PRg_REdr.REd(From,IndX,Nd,PR_List);
//																		AdrS AdrS=new AdrS(Branchg,PRg);
																		IndX+=1;
																	}

																	return From.size();
																};

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public String toString(String IndNt)
	{return IndNt+List$String(AnOtg," ");}

	public AnOtg(List<AnOt> AnOtg)
	{this.AnOtg=AnOtg;}
}