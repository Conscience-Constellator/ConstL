package CC.ConstL.SOrc.Java;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.Ok;

import CC.ConstL.SOrc.Abs_StRt;
import CC.List.Sub.List_REdr_To;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;

public class Method_Hedr
	 extends		Hedr
{
	@Finishd(Is_Finishd=false)
	public static final List_REdr_To<PRsd_Object,PRsd_Object> Method_Hedr_REdr=(From,IndX,Nd,To)->
																  {
																	  return IndX;
																  };

	@Override
	public void Set(Abs_StRt Abs)
	{
	}

	public Method_Hedr(Abs_StRt Abs)
	{	super(Abs);}
}