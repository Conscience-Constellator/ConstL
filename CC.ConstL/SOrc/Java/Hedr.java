package CC.ConstL.SOrc.Java;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.ConstL.SOrc.NAm;
import CC.ConstL.SOrc.Abs_StRt;

public abstract class Hedr extends Modfiabl
{
	public NAm NAm;

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public String toString(String IndNt)
	{return IndNt+AnOtg+' '+Modg;}

	@Finishd(Is_Finishd=true)
	public Hedr(Abs_StRt Abs)
	{	super(Abs);	  }
}