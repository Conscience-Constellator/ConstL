package CC.ConstL.SOrc;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.Ok;

import java.util.List;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.REgn_Object;
import CC.List.Sub.Enum_Stikfier;
import CC.List.Sub.List_REdr_To;
import static CC.Encycloped.Abs.Org.Syc.TXt.$String.List$String;
import static CC.List.Sub.Enum_Stikfier.Powdr;
import static CC.List.Sub.Enum_Stikfier.Standrd_Stik;

public class Abs_StRt
	  extends REgn_Object
	  implements StRt
{
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public void Set(List<PRsd_Object> REgn)
	{}

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public String toString(String IndNt)
	{	return "Unprocessed start: "+List$String(Get_REgn()," ");}

	public static List_REdr_To<PRsd_Object,StAtmnt_Haf> StRtfier=new Enum_Stikfier((Object)->
																				   {
																					   return (Object instanceof Nd)?Powdr:
																											  Standrd_Stik;
																				   }).
																  Bind_SegmNt_REdr((StRt)->
																				   {   return new Abs_StRt((List<PRsd_Object>)StRt);   });

	@Finishd(Is_Finishd=true)
	public Abs_StRt(List<PRsd_Object> REgn)
	{	super(REgn);}
}