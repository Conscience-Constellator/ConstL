package CC.ConstL.SOrc;

import CC.COd.Finishd;
import CC.COd.Alias;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q$Q.Point1$1;
import java.util.List;
import java.util.ArrayList;

public interface Bildr<From_Typ,To_Typ> extends Point1$1<List<From_Typ>,List<To_Typ>>
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Bild(List<From_Typ> From,List<To_Typ> To);
		@Lin_DclAr @Neds_Ovrid(NEds=Ok/*At least may change To type.*/) @Finishd(Is_Finishd=true)
		default List<To_Typ> Bild(List<From_Typ> From)
		{
			List<To_Typ> To=new ArrayList<>();

			Bild(From,To);

			return To;
		}
			@Override @Neds_Ovrid(NEds=No) @Alias @Finishd(Is_Finishd=true)
			default List<To_Typ> Point1$1(List<From_Typ> From)
			{return Bild(From);}
}