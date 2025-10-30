package CC.ConstL.SOrc;

import CC.COd.Finishd;
import CC.COd.Neds_Ovrid;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;

import static CC.COd.Neds_Ovrid.*;

import static CC.Encycloped.Abs.Org.Syc.TXt.$String.List$String;

public class PRg implements PRsd_Object
{
	public PR[] PRg;

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public String toString(String IndNt)
	{return IndNt+'('+List$String(PRg,",")+')';}

	public PRg(PR[] PRg)
	{this.PRg=PRg;}
}
