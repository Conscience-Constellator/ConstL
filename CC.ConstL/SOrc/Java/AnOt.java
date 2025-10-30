package CC.ConstL.SOrc.Java;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;
import CC.ConstL.SOrc.AdrS;
import CC.ConstL.SOrc.AdrS_Havr;
import CC.ConstL.SOrc.PRg;
import CC.ConstL.SOrc.Symbl;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;

public class AnOt extends AdrS_Havr
{
	public static final Symbl AnOt_StRt=new Symbl("@");

	public CC.ConstL.SOrc.PRg PRg;

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public String toString(String IndNt)
	{return IndNt+'@'+AdrS+PRg;}

	public AnOt(List<PRsd_Object> REgn)
	{super(REgn);}
}