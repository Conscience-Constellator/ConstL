package CC.ConstL;

import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

public interface NOdg_Havr<NOd_ extends NOd> extends NOdl_Structr<Conectn_Typ>
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void RplAc_NOd(NOd	Old,
				   NOd_ New);
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Dtach();
}