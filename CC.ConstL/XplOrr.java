package CC.ConstL;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q$.Point$;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.QOt;

import static java.lang.System.out;

public abstract class XplOrr
{
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	public abstract void XplOr();
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	public abstract void Chek_Mach(ConstLAtn Graph);

	public static XplOrr
		 Material_XplOrr=new XplOrr()
		 {
			 public static String StM="Constellatory.Material";
			 @Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			 public void Chek_Mach(ConstLAtn Graph)
			 {
				 Map<String,Material> Materialg=Material.Registry;

				 NOd Material=Graph.Get_NOd(StM);
				 if(Material!=null)
				 {
					 List<String> NAmg=new ArrayList<>(Materialg.keySet());
					 for(int IndX=0;
							 IndX<NAmg.size();)
					 {
						 String NAm=NAmg.get(IndX);
						 if(NAm.contains("(BlNdr"))
						 {
							 NAmg.remove(NAm);

							 continue;
						 }
						 IndX+=1;
					 }
					 Material.FrEch_DsNdnt((Point$<NOd>)(NOd)->
										   {
											   String NAm=NOd.Get_NAm();
											   if(NAm.contains("(BlNdr"))
											   {return;}
											   if(!NAmg.contains(NAm))
											   {out.println("Node "+QOt(NOd)+" doesn't represent material.");}
											   else
											   {NAmg.remove(NAm);}
										   });
					 out.println("Missing materials: "+NAmg);
				 }
			 }

			 @Override
			 public void XplOr()
			 {}
		 },
			  COd_XplOrr=new XplOrr()
		 {
			 public static String StM="Code.Package";
			 @Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			 public void Chek_Mach(ConstLAtn Graph)
			 {
				 ;
			 }

			 @Override
			 public void XplOr()
			 {}
		 };
}