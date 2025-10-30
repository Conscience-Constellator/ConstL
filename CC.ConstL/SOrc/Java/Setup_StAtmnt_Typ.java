package CC.ConstL.SOrc.Java;

/*Ubiq*/
import CC.COd.Finishd;

import CC.ConstL.SOrc.KEwrd;

@Finishd(Is_Finishd=true)
public class Setup_StAtmnt_Typ
	 extends KEwrd
{
	@Finishd(Is_Finishd=true)
	public Setup_StAtmnt_Typ(String TXt)
	{super(TXt);}

	@Finishd(Is_Finishd=true)
	public static final Setup_StAtmnt_Typ Pakg=new Setup_StAtmnt_Typ("package"),
										Import=new Setup_StAtmnt_Typ("import" );
}