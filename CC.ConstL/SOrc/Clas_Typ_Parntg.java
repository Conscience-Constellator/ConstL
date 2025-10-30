package CC.ConstL.SOrc;

import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.REgn_Object;
import CC.List.Sub.List_REdr_To;

import java.util.List;

public class Clas_Typ_Parntg extends REgn_Object
{
	public List<Parnt_StAtmnt> Parntg;

	@Override
	public List_REdr_To<PRsd_Object,PRsd_Object> Get_PRsr()
	{
		return null;
	}
	@Override
	public void Set(List<PRsd_Object> REgn)
	{
	}

	public Clas_Typ_Parntg(List<PRsd_Object> REgn)
	{super(REgn);}
}