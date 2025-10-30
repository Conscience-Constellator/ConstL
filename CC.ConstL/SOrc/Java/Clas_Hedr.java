package CC.ConstL.SOrc.Java;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.Ok;

import java.util.List;
import static CC.ConstL.SOrc.Java.Java_PRsr.Get_Clas_NAm;
import CC.ConstL.SOrc.NAm;
import CC.ConstL.SOrc.Abs_StRt;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.ConstL.SOrc.Modg;
import CC.ConstL.SOrc.Clas_Typ_Parntg;

public class Clas_Hedr
	 extends	  Hedr
{
	public Clas_Typ_Parntg Parntg;

	public Clas_Typ Typ;

	public void Set(List<PRsd_Object> REgn)
	{
		AnOtg=(AnOtg)REgn.get(0);
		Modg =(	Modg)REgn.get(1);
		Typ	 =(Clas_Typ)REgn.get(2);
		NAm	 =(NAm)REgn.get(3);
	}
	@Override
	public void Set(Abs_StRt Abs)
	{
	}

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public String toString()
	{
		return Get_Clas_NAm(this)+AnOtg.toString()+' '+Modg+' '+Typ+' '+NAm+' '+
													 Parntg;
	}

	@Finishd(Is_Finishd=true)
	public Clas_Hedr(Abs_StRt Abs)
	{	super(Abs);	  }
}