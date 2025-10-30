package CC.ConstL.SOrc.Python;

import CC.Encycloped.Abs.Org.Syc.TXt.Cond.ChR_Eqls;
import CC.Encycloped.Abs.Org.Syc.TXt.Cond.ChR_Eval;
import CC.Encycloped.Abs.Org.Syc.TXt.Cond.StRt;
import CC.Encycloped.Abs.Org.Syc.TXt.Cond.String_IndX$Bool;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.Ncountr_Handlr;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.TOknIzr;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.TOknIzr_W_X;
import static CC.ConstL.SOrc.ComNt.*;
import static CC.Encycloped.Abs.Org.Syc.TXt.TOkn.Ncountr_Handlr.QOt_Graplr;
import static CC.Encycloped.Abs.Org.Syc.TXt.TOkn.Ncountr_Handlr.WItspAc_Skipr;

public class Python_PRsr
{
	public static TOknIzr Python_SOrc_TOknIzr=new TOknIzr_W_X(new String_IndX$Bool[]{(ChR_Eval)Character::isWhitespace,
																			   new ChR_Eqls('"'),
																			   new StRt(ComNt_LIng_StRt),
																			   new StRt(ComNt_LIn_StRt )},
														new Ncountr_Handlr[]{WItspAc_Skipr,
																				  QOt_Graplr,
																		   ComNt_LIng_Graplr,
																			ComNt_LIn_Graplr});
}