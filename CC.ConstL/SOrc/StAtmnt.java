package CC.ConstL.SOrc;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;
import CC.List.Sub.List_REdr_To;
import static CC.ConstL.SOrc.Abs_StAtmnt.ConcrEtIz_StRt;
import static CC.ConstL.SOrc.Nd.Nul;
import static CC.Encycloped.Abs.Org.Syc.TXt.$String.List$String;
import static CC.Encycloped.Abs.Org.Syc.TXt.TOkn.REgn_Object.Dfalt_PRsr;
import static CC.Encycloped.Abs.Org.Syc.TXt.TOkn.REgn_Object.List_NAm_Num;
import static CC.List.Sub.Enum_Stikfier.Standrd_Stik;
import static CC.List.Sub.Enum_Stikfier.Stik_BfOr;
import		  CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import static CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object.Point$String;
import CC.List.Sub.Enum_Stikfier;
import CC.List.Sub.List_SegmNtr.Bound_SegmNt_REdr;

import static java.lang.System.out;

public abstract class StAtmnt<StRt_Typ extends StRt,
								Nd_Typ extends	 Nd>
		   implements PRsd_Object
{
	@Finishd(Is_Finishd=true)
	private StRt_Typ StRt;
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public StRt_Typ Get_StRt()
		{	return StRt;}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public void Set_StRt(StRt_Typ StRt)
		{	this.StRt=StRt;}
	@Finishd(Is_Finishd=true)
	public	 Nd_Typ	  Nd;
	public static void REd_StAtmntg(List<Object> From,int IndX,
									List<Object>  To)
	{
		for(;IndX<From.size()
			;IndX+=1)
		{
			To.add(null);
		}
	}
	public void On_StAtmnt_Set()
	{
		out.println("Statement set: "+StRt+
					"\n			   " +Nd);
	}
	public void Set_StRNd(StRt_Typ StRt,Nd_Typ Nd)
	{
		this.StRt=StRt;
		this.Nd	 =Nd  ;
		On_StAtmnt_Set();
	}
		@Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public void Set_StRNd(Abs_StAtmnt<Nd_Typ> Abs)
		{	Set_StRNd((StRt_Typ)ConcrEtIz_StRt(Abs.Get_StRt()),Abs.Nd);}

	public static Enum_Stikfier<PRsd_Object> StAtmnt_PRsr=new Enum_Stikfier<>((Object)->
														 {
															 return (Object instanceof Nd)?Stik_BfOr:
																				   Standrd_Stik     ;
														 })
														{
														@Override
														public int REd(List<PRsd_Object> From,int IndX,int Nd,
																  List<List<PRsd_Object>> To)
														{
															Nd=super.REd(From,IndX,Nd,To);
															out.println(List_NAm_Num(From,"From")+":\n"+List$String(From,IndX,Nd,", "));
															out.println(List_NAm_Num( To, " To ")+"Strend pairs:\n"+List$String(To,", "));

															return Nd;
														}
													};
	public static final List_REdr_To<? extends PRsd_Object,? extends PRsd_Object> StAtmnt_Stikfier=StAtmnt_PRsr.Bind_SegmNt_REdr((REgn)->
																											 {   return new Abs_StAtmnt<>((Abs_StRt)REgn.get(0),(Nd)REgn.get(1));   });
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public List_REdr_To<PRsd_Object,PRsd_Object> Get_PRsr()
	{	return Dfalt_PRsr;}

	public static String CalculAt_Nek(Nd Nd)
	{
		return (Nd==Nul)?"":
					   "\n";
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	public final String StrNd$String(String IndNt,String BtwEn)
	{
		return Point$String(StRt,IndNt)+BtwEn+
			   Point$String(  Nd,IndNt);
	}
		@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public String toString(String IndNt)
		{	return StrNd$String(IndNt,CalculAt_Nek(Nd));}
			@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			public String toString()
			{	return toString("");}

	@Finishd(Is_Finishd=true)
	public StAtmnt(StRt_Typ StRt,Nd_Typ Nd)
	{	Set_StRNd(			StRt,		Nd);   }
		@Finishd(Is_Finishd=true)
		public StAtmnt(Abs_StAtmnt<Nd_Typ> Abs)
		{	Set_StRNd(					   Abs);   }
}