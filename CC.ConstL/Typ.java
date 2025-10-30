package CC.ConstL;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Nd_ArAls_Cuz_No_VRg;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
import org.jetbrains.annotations.NotNull;

import static CC.ConstL.Util.MpT;
import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.QOt;
import java.util.	  List;
import java.util.ArrayList;

import static java.lang.System.out;

@Finishd(Is_Finishd=true)
public abstract class Typ
   <Parnt_Typ extends Typ> extends Material_Havr implements Parntd<Parnt_Typ>
{
	@Finishd(Is_Finishd=true)
	static <Typ extends Conectn_Typ>void X_StAtmnt(Typ Parnt,
												   Typ Child)
	{
		out.println("Extended "+QOt(Parnt)+'→'+
								QOt(Child));
	}

	@Finishd(Is_Finishd=true)
	private List<Parnt_Typ> Parntg=new ArrayList<>();
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public final List<Parnt_Typ> Get_Parntg()
		{return Parntg;}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public void Inherit(@NotNull Parnt_Typ Parnt)
	{
		Set_Material(Parnt.Get_Material());
		Set_ShAp	(Parnt.Get_ShAp	   ());
	}

	@Finishd(Is_Finishd=true)
	private String ShAp;
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public String Get_ShAp()
		{return ShAp;}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public	 void Set_ShAp(String ShAp)
		{this.ShAp=ShAp;}

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public String toString()
	{return "Typ: "+Get_NAm()+'('+Get_Material()+')';}

	@Finishd(Is_Finishd=true)
	public Typ(String	NAm,
			   Object	Material_SOrc,
			   String	ShAp,
			   Object[] Parntg)
	{
		super(NAm,Material_SOrc);
		Set_ShAp(ShAp);

		Ad_Parntg(Parntg);

		ThrO_If_No_Don();

		Registr();
	}
		@Nd_ArAls_Cuz_No_VRg @Finishd(Is_Finishd=true)
		public Typ(String NAm,
				   Object Material_SOrc,
				   String ShAp)
		{this(NAm,Material_SOrc,ShAp,MpT);}

		//<editor-fold desc="Infr NAm↔Material">
		@Finishd(Is_Finishd=true)
		protected Typ(String   NAm,
					  Object[] Parntg)
		{
			super(NAm);
			Set_ShAp(ShAp);

			Ad_Parntg(Parntg);

			Registr();
		}
			@Nd_ArAls_Cuz_No_VRg @Finishd(Is_Finishd=true)
			protected Typ(String NAm)
			{this(NAm,MpT);}
		@Finishd(Is_Finishd=true)
		public Typ(@NotNull Object	 Material_SOrc,
							String	 ShAp,
							Object[] Parntg)
		{
			super(Material_SOrc);
			Set_ShAp(ShAp);

			Ad_Parntg(Parntg);

			ThrO_If_No_Don();

			Registr();
		}
			@Nd_ArAls_Cuz_No_VRg @Finishd(Is_Finishd=true)
			public Typ(Object Material_SOrc,
					   String ShAp)
			{this(Material_SOrc,ShAp,MpT);}
		//</editor-fold>

		@Finishd(Is_Finishd=true)
		public Typ(String NAm,
			int TAk_Aftr,Object[] Parntg)
		{
			this(NAm,Parntg);
			Inherit(TAk_Aftr,Parntg);

			ThrO_If_No_Don();
		}
}