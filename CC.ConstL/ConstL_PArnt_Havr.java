package CC.ConstL;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;

import static CC.COd.Neds_Ovrid.Yes;

/**Made, then realized unnecessary for now.*/
public interface ConstL_PArnt_Havr<PArnt_Typ extends ConstL_PArnt>
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	PArnt_Typ Get_ConstL_Parnt();
}