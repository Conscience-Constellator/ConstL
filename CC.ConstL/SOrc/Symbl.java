package CC.ConstL.SOrc;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.TOkn;
import static CC.ConstL.SOrc.Regbl_Symbl.Get_Regbl_Symbl;

@Finishd(Is_Finishd=true)
public class Symbl
	 extends TOkn
{
	@Finishd(Is_Finishd=true)
	public Symbl(String Wrd)
	{super(Wrd);}

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	public static Symbl Get_Symbl(String TOkn)
	{
		return (Get_Regbl_Symbl(TOkn) instanceof Symbl Symbl)?Symbl:
													   new NAm(TOkn);
	}
}