package CC.ConstL;

import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
import org.jetbrains.annotations.NotNull;

import java.awt.Color;
import CC.Encycloped.Abs.Scal.Physc.Colr.Colr_Havr;

public interface ConstL_Object<Typ_Typ extends Typ> extends Colr_Havr
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	boolean  Is_NAtv();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Set_Is_NAtv(boolean Is);

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	Typ_Typ Get_Typ();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void	Set_Typ(Typ_Typ Typ);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void	Set_Typ(Object SOrc)
		{Set_Typ(Gar_Typ(SOrc));}
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	Typ_Typ Gar_Typ(Object SOrc);

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default Color Get_Colr()
	{return Get_Typ().Get_Colr();}
	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void Set_Colr(@NotNull Color Colr)
	{}
}