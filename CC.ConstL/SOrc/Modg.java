package CC.ConstL.SOrc;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;
import java.util.ArrayList;

import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.REgn_Object;
import CC.List.Sub.List_REdr_To;

import static CC.ConstL.SOrc.ComNt.Is_ComNt;
import static CC.ConstL.SOrc.Handl_Set.Handl_FEld_Set;
import static CC.ConstL.SOrc.Java.Java_PRsr.*;
import static CC.ConstL.SOrc.KEwrd.Get_KEwrd;
import static CC.Encycloped.Abs.Org.Syc.TXt.$String.List$String;
import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.QOt;

public class Modg extends REgn_Object
{
	public Mod[] Modg;

	@Finishd(Is_Finishd=true)
	public static List_REdr_To<PRsd_Object,PRsd_Object> Modg_REdr=(From,IndX,Nd,To)->
															   {
																   To.addAll(From);

																   return From.size();
															   },
		Modg_REdr_=(From,IndX,Nd,To)->
	{
		while(IndX<Nd)
		{
			PRsd_Object				Object=From.get(IndX);

				 if(Get_KEwrd(Object.toString()) instanceof KEwrd Wrd)
			{	IndX=Ad_Item(						  Wrd,IndX,To);}
			else if( Is_ComNt(Object		   )					 )
			{	IndX=Ad_Item(new ComNt(Object.toString()),IndX,To);}
			else
			{
				throw new RuntimeException("Unknown modifier "+QOt(Object)+" w/, "+To+'\n'+
										   List_So_FR_StAtmnt(To));
			}
		}

		List<PRsd_Object> Modg=new ArrayList<>();
		To.add(new Modg(Modg));
		return IndX;
	};
		@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public List_REdr_To<PRsd_Object,PRsd_Object> Get_PRsr()
		{return Modg_REdr;}
	@Override
	public void Set(List<PRsd_Object> REgn)
	{
	}

	@Override
	public String toString(String IndNt)
	{return IndNt+List$String(Modg," ");}
	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	public String toString()
	{return "Modifiers"+Get_PRsr();}

	public Modg(List<PRsd_Object> Regn)
	{super(Regn);}
}