package CC.ConstL.SOrc.Java;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import	 java.util.List;

import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.TOkn;
import CC.List.Sub.List_REdr_To;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.REgn_Object;

public class XtNsn_Info extends REgn_Object
{
	@Finishd(Is_Finishd=true)
	public static final TOkn XtNds=new TOkn(   "extends"),
							  Imps=new TOkn("implements");

	@Finishd(Is_Finishd=true)
	public static List_REdr_To<PRsd_Object,PRsd_Object> Parntg_REdr=(From,IndX,Nd,To)->
													   {
														   int XtNds_IndX=From.indexOf(	  "extends");
														   int	Imps_IndX=From.indexOf("implements");

														   return From.size();
													   };
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public List_REdr_To<PRsd_Object,PRsd_Object> Get_PRsr()
		{return Parntg_REdr;}

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public void Set(List<PRsd_Object> REgn)
	{
		;
	}

	@Finishd(Is_Finishd=true)
	public XtNsn_Info(List<PRsd_Object> Regn)
	{super(Regn);}
}