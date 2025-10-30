package CC.ConstL.SOrc.Java;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.REgn_Object;
import CC.ConstL.SOrc.Blok;

public class Lamda_BoD extends REgn_Object
{
	public Blok Blok;
	@Override
	public void Set(List<PRsd_Object> REgn)
	{	Blok=(Blok)REgn.getFirst();}

	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	public String toString()
	{return Blok.toString();}

	public Lamda_BoD(List<PRsd_Object> REgn)
	{
		super(						   REgn);
		Blok=new Blok(				   REgn);
	}
}