package CC.ConstL.SOrc.Java;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;

import CC.ConstL.SOrc.Abs_StRt;
import CC.ConstL.SOrc.ConcrEt_StRt;
import CC.ConstL.SOrc.StRt;
import CC.List.Sub.List_REdr_To;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;

public abstract class AnOtAtbl
			  extends ConcrEt_StRt
{
	@Finishd(Is_Finishd=true)
	public AnOtg AnOtg;

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public String toString(String IndNt)
	{	return AnOtg.toString();}

	@Finishd(Is_Finishd=true)
	public AnOtAtbl(Abs_StRt Abs)
	{	super(Abs);	  }
}