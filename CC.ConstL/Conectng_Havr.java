package CC.ConstL;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q$.Point$;
import CC.$.Q$Q.Point$Bool;

import static CC.ConstL.Conectn.Is_FroTo_Chekr;
import static CC.List.FrEch.Filtr;
import static CC.List.FrEch.FrEch;
import static CC.ConstL.Conectn.Is_BtwEn_Chekr;
import static CC.ConstL.NOdl_Structr.Involvs_Chekr;
import java.util.List;
import static CC.List.List_X.Get_Th_Item;
import static java.lang.System.out;

public interface Conectng_Havr<NOd_ extends NOd,Conectn_Typ_PR extends Conectn>
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	List<Conectn_Typ_PR> Get_Conectng();

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void  Get_Conectng(List<Conectn_Typ_PR> To,
							  Point$Bool<Conectn_Typ_PR> Filtr)
	{
		int BfOr=To.size();
		Filtr(Get_Conectng(),To,Filtr);

//		out.println("Filtered "+(To.size()-BfOr)+" connection(s).");
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default List<Conectn_Typ_PR> Get_Conectng(Point$Bool<Conectn_Typ_PR> Filtr)
		{
			List<Conectn_Typ_PR>    Rsult=Filtr(Get_Conectng(),Filtr);

//			out.println("Filtered "+Rsult.size()+" connections.");
			return Rsult;
		}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void Get_Conectng(List<Conectn_Typ_PR> To,NOd NOd)
	{Get_Conectng(To,Involvs_Chekr(NOd));}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default List<Conectn_Typ_PR> Get_Conectng(NOd NOd)
		{return Get_Conectng(Involvs_Chekr(NOd));}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void Get_Conectng(List<Conectn_Typ_PR> To,
							  NOd A,NOd B)
	{	Get_Conectng(To,(Point$Bool<Conectn_Typ_PR>)Is_BtwEn_Chekr(A,B));   }
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default List<Conectn_Typ_PR> Get_Conectng(NOd A,NOd B)
		{	return Get_Conectng((Point$Bool<Conectn_Typ_PR>)Is_BtwEn_Chekr(A,B));   }
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void Get_Conectng_AB(List<Conectn_Typ_PR> To,
																								NOd A,NOd B)
	{			 Get_Conectng(                        To,(Point$Bool<Conectn_Typ_PR>)Is_FroTo_Chekr(A,    B));   }
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default List<Conectn_Typ_PR> Get_Conectng_AB(                                    NOd A,NOd B)
		{	return                   Get_Conectng((Point$Bool<Conectn_Typ_PR>)Is_FroTo_Chekr(B,    A));   }
	default void Get_Conectng_BA(List<Conectn_Typ_PR> To,
													  NOd A,NOd B)
	{			 Get_Conectng_AB(                     To, B,    A);   }
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default List<Conectn_Typ_PR> Get_Conectng_BA(NOd A,NOd B)
		{	return                   Get_Conectng_AB(    B,    A);   }
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default Conectn_Typ_PR Get_Th_Conectn(NOd A,NOd B)
	{return Get_Th_Item(Get_Conectng(	A,	  B));}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default Conectn_Typ_PR Get_Th_Conectn(NOd NOd)
	{return Get_Th_Item(Get_Conectng(	NOd));}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default Conectn_Typ_PR Gar_Conectn(Object SOrc)
		{
			if(SOrc instanceof Conectn Conectn)
			{	return (Conectn_Typ_PR)Conectn;   }
			else if(SOrc!=null)
			{
				if(SOrc.getClass().isArray())
				{
//					NOd_ NOd=Get_NOdg().get(SOrc);
//					if(NOd!=null)
//					{	return NOd;   }
//					else
//					{	throw new RuntimeException("No node of ID "+QOt(SOrc));   }
				}
			}
			throw new RuntimeException("Invalid connection source: "+SOrc);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void FrEch_Conectn(Point$	 <Conectn_Typ_PR> Do	,
								   Point$Bool<Conectn_Typ_PR> Filtr)
		{FrEch(Get_Conectng(),Do,Filtr);}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void FrEch_Conectn(Point$<Conectn_Typ_PR> Do)
			{FrEch(Get_Conectng(),Do);}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default Point$<Conectn_Typ_PR> OriNtAtn_BAsd_Actn(Point$<Conectn_Typ_PR> Do_A,Point$<Conectn_Typ_PR> Do_B,
																 NOd NOd)
		{
			return (Conectn)->
				   {
					   ((Conectn.Get_NOd_A()==NOd)?Do_A:
												   Do_B).Point$(Conectn);
				   };
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void FrEch_Conectn(Point$<Conectn_Typ_PR> Do_A,Point$<Conectn_Typ_PR> Do_B,
												NOd NOd)
		{FrEch_Conectn(OriNtAtn_BAsd_Actn(Do_A,Do_B,NOd),NOd);}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void FrEch_Conectn(Point$<Conectn_Typ_PR> Do ,
												NOd NOd)
		{FrEch_Conectn(Do,Involvs_Chekr(NOd));}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void FrEch_Conectn(Point$<Conectn_Typ_PR> Do_AB,Point$<Conectn_Typ_PR> Do_BA,
												NOd    A,              NOd    B)
		{FrEch_Conectn(OriNtAtn_BAsd_Actn(Do_AB,Do_BA,A),A,B);}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void FrEch_Conectn(Point$<Conectn_Typ_PR> Do,
								   NOd A,NOd B)
		{FrEch_Conectn(Do,(Point$Bool<Conectn_Typ_PR>)Is_BtwEn_Chekr(A,B));}
}