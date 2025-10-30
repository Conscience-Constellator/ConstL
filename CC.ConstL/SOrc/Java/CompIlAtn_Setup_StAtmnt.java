package CC.ConstL.SOrc.Java;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;
import CC.ConstL.SOrc.AdrS_Havr;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import static CC.ConstL.SOrc.Regbl_Symbl.StAtmnt_Nd;

@Finishd(Is_Finishd=true)
public abstract class CompIlAtn_Setup_StAtmnt extends AdrS_Havr
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	public abstract String Get_Prefx();

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public String toString(String IndNt)
	{return Get_Prefx()+' '+AdrS+StAtmnt_Nd;}

	@Finishd(Is_Finishd=true)
	public CompIlAtn_Setup_StAtmnt(List<PRsd_Object> REgn)
	{super(REgn);}
}