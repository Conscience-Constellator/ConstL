package CC.ConstL.SOrc;

import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.QOt;

public class Handl_Set
{
	public static <Typ>Typ ThrO(String NAm,Typ Old,Typ New)
	{
		throw new RuntimeException((Old==New)?"Redundant "+NAm+"  "					+QOt(New):
											"Conflicting "+NAm+"-s "+QOt(Old)+", & "+QOt(New));
	}
	public static <Typ>Typ Handl_FEld_Set(String NAm,Typ Old,Typ New)
	{
		return (Old!=null&&New!=null)?ThrO(NAm,Old,New):
												   New ;
	}
	public static <Typ>Typ Handl_FEld_Set(String NAm,Typ Dfalt,Typ Old,Typ New)
	{
		return (Old!=null&&Old!=Dfalt&&New!=null)?ThrO(NAm,Old,New):
															   New ;
	}
}