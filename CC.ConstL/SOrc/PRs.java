package CC.ConstL.SOrc;

import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.List.Sub.Graplr;
import static CC.ConstL.SOrc.Regbl_Symbl.StAtmnt_Nd;

public class PRs
{
	public static final Graplr<PRsd_Object> StAtmnt_Graplr=new CC.List.Sub.Graplr<>(new CC.List.Cond.Item_Eql<>(StAtmnt_Nd),1),
											   Blok_Graplr=new CC.List.Sub.Graplr<>((List,IndX)->
																					{	return List.get(IndX) instanceof Blok     ;},0),
												 PR_Graplr=new CC.List.Sub.Graplr<>((List,IndX)->
																					{	return List.get(IndX) instanceof PRd_REgn;},1);
}