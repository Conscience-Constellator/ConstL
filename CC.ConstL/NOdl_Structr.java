package CC.ConstL;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q$Q.Point$Bool;

public interface NOdl_Structr <Typ_Typ extends Typ>
		 extends ConstL_Object<Typ_Typ>
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	boolean Involvs(NOd NOd);
		@Finishd(Is_Finishd=true)
		static <Structr_Typ extends NOdl_Structr>Point$Bool<Structr_Typ> Involvs_Chekr(NOd NOd)
		{return (Structr)->{return Structr.Involvs(NOd);};}
}