package CC.ConstL.SOrc;

import CC.COd.Finishd;

import CC.Encycloped.Abs.Org.Syc.TXt.Cond.StRt;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.Graplr;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.TOkn;

@Finishd(Is_Finishd=true)
public class ComNt
	 extends TOkn
{
	@Finishd(Is_Finishd=true)
	public static TOkn ComNt_LIn_StRt =new TOkn("//"),ComNt_LIn_Nd=new TOkn("\n"),
					   ComNt_LIng_StRt=new TOkn("/*"),ComNt_LIng_Nd=new TOkn("*/");
	@Finishd(Is_Finishd=true)
	public static boolean Is_ComNt(Object Object)
	{
		return Object instanceof String TOkn&&(TOkn.startsWith(ComNt_LIng_StRt.toString())||
											   TOkn.startsWith(	ComNt_LIn_StRt.toString()));
	}

	@Finishd(Is_Finishd=true)
	public static final Graplr ComNt_LIng_Graplr=new Graplr(new StRt(ComNt_LIng_Nd),2),
								ComNt_LIn_Graplr=new Graplr(new StRt(ComNt_LIn_Nd ),1);

	@Finishd(Is_Finishd=true)
	public ComNt(String String)
	{super(String);}
		@Finishd(Is_Finishd=true)
		public ComNt(Object ContNt)
		{this(ContNt.toString());}
}