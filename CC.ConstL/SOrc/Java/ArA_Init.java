package CC.ConstL.SOrc.Java;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;
import CC.List.Cond.Item_ID;
import CC.List.Sub.Graplr;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.REgn_Object;
import CC.List.Sub.List_REdr_To;
import static CC.ConstL.SOrc.Regbl_Symbl.Blok_Nd;

public class ArA_Init extends REgn_Object
{
	public static final List_REdr_To<PRsd_Object,PRsd_Object> ArA_Init_REdr=new Graplr<>(new Item_ID(Blok_Nd),1).Bind_SegmNt_REdr((REgn)->{return REgn;});
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public List_REdr_To<PRsd_Object,PRsd_Object> Get_PRsr()
		{	return ArA_Init_REdr;	}
	@Override
	public void Set(List<PRsd_Object> REgn)
	{}

	public ArA_Init(List<PRsd_Object> REgn)
	{	super(REgn);   }
}