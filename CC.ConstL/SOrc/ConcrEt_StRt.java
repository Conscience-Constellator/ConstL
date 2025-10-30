package CC.ConstL.SOrc;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

public abstract class ConcrEt_StRt
		   implements		  StRt
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	public abstract void Set(Abs_StRt Abs);

	@Finishd(Is_Finishd=true)
	public ConcrEt_StRt(Abs_StRt Abs)
	{	Set(Abs);	}
}