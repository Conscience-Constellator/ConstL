package CC.ConstL.SOrc;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;
import CC.List.Sub.List_REdr_To;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.REgn_Object;
import static CC.Encycloped.Abs.Org.Syc.TXt.$String.List$String;
import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.QOt;

public class AdrS extends REgn_Object
{
	public static boolean Is_AdrS(List<PRsd_Object> REgn)
	{
		for(int IndX=0,LNg=REgn.size();;)
		{
			if(IndX>=LNg)
			{	return false;}
			if(!(REgn.get(IndX) instanceof NAm))
			{	return false;}
			IndX+=1;
			if(IndX>=LNg)
			{	return true;}
			if(	 REgn.get(IndX)!=Dot)
			{	return false;}
			IndX+=1;
		}
	}
	public List<PRsd_Object> Branchg;

	public static final List_REdr_To<PRsd_Object,PRsd_Object> AdrS_REdr=(From,IndX,Nd,
																		  To)->
														   {
															   if(IndX<Nd)
															   {
																   for(;;)
																   {
																	   PRsd_Object Object=From.get(IndX);
																	   if(Object instanceof NAm NAm)
																	   {	To.add(NAm);}
																	   else
																	   {	break;}
																	   IndX+=1;

																	   if(IndX>=Nd)
																	   {	break;	 }
																	   Object=From.get(IndX);
																	   if(Object!=Dot)
																	   {	throw new RuntimeException("Required: Dot, got: "+QOt(Object));	}
																	   IndX+=1;
																   }
															   }
															   return IndX;
														   };
	@Override
	public List_REdr_To<PRsd_Object,PRsd_Object> Get_PRsr()
	{	return AdrS_REdr;}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public void Set(List<PRsd_Object> REgn)
	{	Branchg=REgn;}

	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	public String toString()
	{return List$String(Branchg,".");}

	public AdrS(List<PRsd_Object> REgn)
	{	super(REgn);}
}