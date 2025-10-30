package CC.ConstL.SOrc.Java;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.Ok;

import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import java.util.List;


public class			   Import_StAtmnt
	 extends CompIlAtn_Setup_StAtmnt
{
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public String Get_Prefx()
	{return "import";}

	@Finishd(Is_Finishd=true)
	public Import_StAtmnt(List<PRsd_Object> REgn)
	{super(REgn);}
}