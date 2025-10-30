package CC.ConstL.SOrc;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.REgn_Object;
import CC.List.Sub.List_REdr_To;

public class AdrS_Havr extends REgn_Object
{
	public AdrS AdrS;

	@Override
	public List_REdr_To<PRsd_Object,PRsd_Object> Get_PRsr()
	{
		return null;
	}
	@Override
	public void Set(List<PRsd_Object> REgn)
	{
	}

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public String toString(String IndNt)
	{return AdrS.toString();}

	public AdrS_Havr(List<PRsd_Object> REgn)
	{super(REgn);}
}