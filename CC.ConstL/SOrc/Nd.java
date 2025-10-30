package CC.ConstL.SOrc;

import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;

import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.QOt;

public interface Nd extends StAtmnt_Haf
{
	static PRsd_Object ThrO_If_BoD_Invalid(PRsd_Object POtNtl_BoD)
	{
		if(POtNtl_BoD instanceof Nd BoD)
		{	return BoD;}
		else
		{	throw	new RuntimeException("Invalid body "+QOt(POtNtl_BoD));}
	}

	class	 TOkn_Nd
	extends Regbl_Symbl implements Nd
	{
		public TOkn_Nd(String TXt)
		{	super(TXt);}
	}
	TOkn_Nd Nul=new TOkn_Nd(";"){};
}