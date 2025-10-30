package CC.ConstL;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import static CC.ConstL.Invalid_X.ThrO_Invalid_SOrc;
import static CC.ConstL.Material.Gar_Material;
import CC.Util.NAm.NAm_Havr.NAm_Havr_ConcrEt;
import java.awt.Color;
import CC.Encycloped.Abs.Scal.Physc.Colr.ShOn_Colr_Havr;
import org.jetbrains.annotations.NotNull;

public class  Material_Havr
	 extends	   NAm_Havr_ConcrEt
  implements ShOn_Colr_Havr,Is_Don_Chekbl
{
	@Finishd(Is_Finishd=true)
	private Material Material;
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public final Material Get_Material()
		{return Material;}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public void Set_Material(@NotNull Material Material)
		{this.Material=Material;}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			public void Set_Material(@NotNull Object SOrc)
			{Set_Material(Gar_Material(SOrc));}
		// <editor-fold desc="Colr">
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public Color Get_Colr	  ()
		{return Get_Material().Get_Colr();}
		@Override @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
		public  void Set_Colr	  (Color Colr)
		{}
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public Color Get_Colr_ShOn()
		{return Get_Material().Get_Colr_ShOn();}
		@Override @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
		public  void Set_Colr_ShOn(Color Colr)
		{}
		//</editor-fold>

	//<editor-fold desc="Infr">
	@Finishd(Is_Finishd=true)
	public static Material Infr_Material(String NAm)
	{return CC.ConstL.Material.Get_Material(NAm);}
	@Finishd(Is_Finishd=true)
	public static String 	Infr_NAm(Object Material_SOrc)
	{return Gar_Material(Material_SOrc).Get_NAm();}
	public static Object[] Get_MEt(Object MEt)
	{
		return (MEt instanceof String   NAm		)?new Object[]{NAm,		CC.ConstL.Material.Get_Material(NAm)}:
			   (MEt instanceof Material Material)?new Object[]{Material.Get_NAm(),Material					}:
												  ThrO_Invalid_SOrc("MEt",MEt);
	}
	//</editor-fold>

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public boolean Is_Don()
	{
		Material Material=Get_Material();

		return Get_NAm()!=null&&
			   Material !=null&&
			   Material.Is_Don();
	}

	//<editor-fold desc="Construct">
	/*3 vrs:
	 *base takes both,
	 *others assume 1 from other.*/
	@Finishd(Is_Finishd=true)
	public Material_Havr(@NotNull String NAm,@NotNull Object Material_SOrc)
	{
		super(NAm);
		Set_Material(Material_SOrc);

		ThrO_If_No_Don();
	}
		@Finishd(Is_Finishd=true)
		public Material_Havr(@NotNull String NAm)
		{
			UpdAt_NAm	 (NAm);
			Infr_Material(NAm);
		}
		@Finishd(Is_Finishd=true)
		public Material_Havr(		@NotNull Object Material_SOrc)
		{
					 Set_Material(Material_SOrc);
			Infr_NAm(Gar_Material(Material_SOrc));

			ThrO_If_No_Don();
		}
	//</editor-fold>
}