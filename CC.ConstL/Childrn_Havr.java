package CC.ConstL;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q$.Point$;
import CC.$.Q$Q.Point$Bool;
import java.util.List;
import CC.List.List_X;
import static CC.List.FrEch.FrEch;
import static CC.List.List_X.Get_Th_Item;
import static CC.List.List_X.Infr_If_AbsNt;

public interface Childrn_Havr<Child_Typ extends Childrn_Havr>
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	List<Child_Typ> Get_Childrn();
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default Child_Typ Get_Th_ConstL_Child()
		{return Get_Th_Item(Get_Childrn());}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default Child_Typ Get_Th_Sibling(Child_Typ Child)
		{return List_X.Pik_Th_Sibling(Child,Get_Childrn());}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default Child_Typ Infr_Child_If_AbsNt(Child_Typ StAtd)
		{return Infr_If_AbsNt(StAtd,Get_Childrn());}
		//<editor-fold desc="FrEch">
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void FrEch_Child(Point$<Child_Typ> Do)
		{	FrEch(Get_Childrn(),Do);   }
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void FrEch_Child(Point$<Child_Typ> Do,Point$Bool<Child_Typ> Filtr)
		{FrEch(Get_Childrn(),Do,Filtr);}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void FrEch_DsNdnt(Point$<Child_Typ> Do)
			{
				FrEch_Child((Child)->
							{
								Do.Point$(Child);
								Child.FrEch_DsNdnt(Do);
							});
			}
		//</editor-fold>
}