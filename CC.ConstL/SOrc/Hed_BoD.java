package CC.ConstL.SOrc;

/*Ubiq*/
import CC.COd.Finishd;

import CC.ConstL.SOrc.Java.Hedr;

public abstract class Hed_BoD<Hed_Typ extends Hedr,
							  BoD_Typ extends Nd> extends StAtmnt<Hed_Typ,BoD_Typ>
{
	public Hed_Typ Hed;
	public BoD_Typ BoD;

	@Finishd(Is_Finishd=true)
	public Hed_BoD(Hed_Typ Hed,BoD_Typ BoD)
	{	super(			   Hed,		   BoD);   }
		@Finishd(Is_Finishd=true)
		public Hed_BoD(Abs_StAtmnt<BoD_Typ> Abs)
		{	super(							Abs);	}
}