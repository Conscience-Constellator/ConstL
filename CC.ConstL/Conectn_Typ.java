package CC.ConstL;

import CC.COd.*;
import static CC.COd.Neds_Ovrid.*;
import org.jetbrains.annotations.NotNull;

import CC.$.Q3$1.Int3$1;
import static CC.ConstL.Invalid_X.ThrO_Invalid_SOrc;
import static CC.ConstL.NOd_Typ.Gar_NOd_Typ;
import static CC.ConstL.Util.Hand_Me_Down;
import static CC.Encycloped.Abs.Org.Syc.TXt.ContXt.Is_QOtd;
import static CC.Encycloped.Abs.Org.Syc.TXt.ContXt.PRs_LIn;
import static CC.Encycloped.Abs.Org.Syc.TXt.Ling.Inherit;
import java.awt.Color;
import CC.Encycloped.Abs.Scal.Physc.Colr.Colr;
import static CC.Encycloped.Abs.Scal.Physc.Colr.Colr.*;
import static CC.Util.Fun.V.V;
import static CC.List.FrEch.FrEch;
import CC.$.Q$.Point$;
import java.util.    Map;
import java.util.HashMap;

public class	 Conectn_Typ
	 extends Typ<Conectn_Typ>
{
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public void Inherit(@NotNull Conectn_Typ Parnt)
	{
		super.Inherit(Parnt);
		Set_Mixr	 (Parnt.Get_Mixr());
	}

	public int CalculAt_Colr(int A,int B)
	{return Get_Mixr().Int3$1(Get_ARGB(),A,B);}
		public Color CalculAt_Colr(Color A,Color B)
		{return New_Colr(Get_Mixr().Int3$1(Get_ARGB(),A.getRGB(),B.getRGB()));}
	@Finishd(Is_Finishd=true)
	private Int3$1 Mixr;
		public static double Th5=1D/5,Th5_2=2D/5;
		public static int Mix_Chanl_A1_BC2(int A,int B,int C)
		{return (int)((A*Th5)+(B*Th5_2)+(C*Th5_2));}
		public static int Mix_A1_BC2(int A,int B,int C)
		{
			return AsMbl(Mix_Chanl_A1_BC2(Get_A(A),Get_A(B),Get_A(C)),
						 Mix_Chanl_A1_BC2(Get_A(A),Get_A(B),Get_A(C)),
						 Mix_Chanl_A1_BC2(Get_A(A),Get_A(B),Get_A(C)),
						 Mix_Chanl_A1_BC2(Get_A(A),Get_A(B),Get_A(C)));
		}
		@Finishd(Is_Finishd=true)
		public static Int3$1 Only_A=(A,B,C)->{return A;},
							 Only_B=(A,B,C)->{return B;},
							 Only_C=(A,B,C)->{return C;},
							BC_Mixr=(A,B,C)->{return Norml_Mixr.Mix(B,C);},
							AB_Mixr=(A,B,C)->{return Norml_Mixr.Mix(A,B);},
							AC_Mixr=(A,B,C)->{return Norml_Mixr.Mix(A,C);},
						  A_BC_Mixr=(A,B,C)->{return Norml_Mixr.Mix(A,Norml_Mixr.Mix(B,C));},
						  B_AC_Mixr=(A,B,C)->{return Norml_Mixr.Mix(B,Norml_Mixr.Mix(A,C));},
						  C_AB_Mixr=(A,B,C)->{return Norml_Mixr.Mix(C,Norml_Mixr.Mix(A,B));},
						   Evn_Mixr=		Norml_Mixr::Mix_Colr,
					  Material_Mixr=Colr.Material_Mixr::Mix_Colr,
					Invrs_A_BC_Mixr=Conectn_Typ::Mix_A1_BC2,
						 Dfalt_Mixr=		   BC_Mixr,
						 Dfalt_X_A_Tran_Mixr=(A,B,C)->{return Set_A(Dfalt_Mixr.Int3$1(A,B,C),Get_A(A));};
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public final Int3$1 Get_Mixr()
		{return Mixr;}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public		   void Set_Mixr(Int3$1 Mixr)
		{this.	Mixr=Mixr;}

	//<editor-fold desc="Construct">
	@Inheritd_Constructr(VRgfId=false) @Finishd(Is_Finishd=true)
	public Conectn_Typ(String NAm,
					   Object Material_SOrc,Int3$1 Mixr,String ShAp,
					   Object[] Parntg)
	{
		super(NAm,Material_SOrc,ShAp,Parntg);
		Set_Mixr(Mixr);
	}
		@Inheritd_Constructr(VRgfId=false) @Finishd(Is_Finishd=true)
		public Conectn_Typ(String NAm,
						   Object Material_SOrc,Int3$1 Mixr,String ShAp)
		{
			super(NAm,Material_SOrc,ShAp);
			Set_Mixr(Mixr);
		}

		//<editor-fold desc="Infr NAm↔Material">
		@Inheritd_Constructr(VRgfId=false) @Finishd(Is_Finishd=true)
		protected Conectn_Typ(String NAm,
							  Int3$1 Mixr,String ShAp,
							  Object[] Parntg)
		{
			super(NAm,ShAp);
			Set_Mixr(Mixr);
		}
			@Inheritd_Constructr(VRgfId=false) @Nd_ArAls_Cuz_No_VRg @Finishd(Is_Finishd=true)
			protected Conectn_Typ(String NAm,
								  Int3$1 Mixr,String ShAp)
			{
				super(NAm,ShAp);
				Set_Mixr(Mixr);
			}
		@Inheritd_Constructr(VRgfId=false) @Finishd(Is_Finishd=true)
		public Conectn_Typ(Object Material_SOrc,Int3$1 Mixr,String ShAp,
						   Object[] Parntg)
		{
			super(Material_SOrc,ShAp,Parntg);
			Set_Mixr(Mixr);
		}
			@Inheritd_Constructr(VRgfId=false) @Nd_ArAls_Cuz_No_VRg @Finishd(Is_Finishd=true)
			public Conectn_Typ(Object Material_SOrc,Int3$1 Mixr,String ShAp)
			{
				super(Material_SOrc,ShAp);
				Set_Mixr(Mixr);
			}
		//</editor-fold>

		@Inheritd_Constructr(VRgfId=false) @Nd_ArAls_Cuz_No_VRg @Finishd(Is_Finishd=true)
		public Conectn_Typ(String NAm,
			int TAks_Aftr,Object[] Parntg)
		{
			super(NAm,Parntg);
			Inherit(Get_Parntg().get(TAks_Aftr));
		}
	//</editor-fold>

	//<editor-fold desc="Reg">
	@Finishd(Is_Finishd=true)
	public static final Map<String,Conectn_Typ> Registry=new HashMap<>();
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public Map<String,Conectn_Typ> Get_Registry()
		{return Registry;}
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public void Registr()
		{Get_Registry().put(Get_NAm(),this);}
		@Finishd(Is_Finishd=true)
		public static Conectn_Typ Get_Typ(String SOrc)
		{
			Conectn_Typ Typ=Registry.get(SOrc);

			return (Typ!=null)?Typ:
			 ThrO_Invalid_SOrc("Conectn_Typ",SOrc);
		}
			@Alias @Finishd(Is_Finishd=true)
			public static Conectn_Typ Get_Conectn_Typ(String ID)
			{	return Get_Typ(ID);	  }

			@Finishd(Is_Finishd=true)
			public static Conectn_Typ Get_Typ_QOtd(String SOrc)
			{	return                Get_Typ(    PRs_LIn(SOrc));	 }
				@Alias @Finishd(Is_Finishd=true)
				public static Conectn_Typ Get_Conectn_Typ_QOtd(String ID)
				{	return Get_Typ_QOtd(ID);   }
		@Finishd(Is_Finishd=true)
		public static Conectn_Typ Get_Typ(String ID,Conectn DOnr)
		{
			return (ID.equals(Inherit))?(Conectn_Typ)DOnr.Get_Typ(  ):
														  Gar_Typ(ID);
		}
			@Alias @Finishd(Is_Finishd=true)
			public static Conectn_Typ Get_Conectn_Typ(String ID,Conectn DOnr)
			{	return Get_Typ(ID,DOnr);   }

			@Finishd(Is_Finishd=true)
			public static Conectn_Typ Get_Typ_PRsd(String ID,Conectn DOnr)
			{
				return (Is_QOtd(ID))?Get_Typ_QOtd(ID):
									 Get_Typ	 (ID,DOnr);
			}
				@Alias @Finishd(Is_Finishd=true)
				public static Conectn_Typ Get_Conectn_Typ_PRsd(String ID,Conectn DOnr)
				{	return Get_Typ_PRsd(ID,DOnr);   }
		@Finishd(Is_Finishd=true)
		public static Conectn_Typ Get_Typ(String ID,Conectn Parnt,Conectn Old_Sibling)
		{
			return (ID.equals(Hand_Me_Down))?(Conectn_Typ)Old_Sibling.Get_Typ(		 ):
														 Get_Typ(ID,Parnt);
		}
			@Alias @Finishd(Is_Finishd=true)
			public static Conectn_Typ Get_Conectn_Typ(String ID,Conectn Parnt,Conectn Old_Sibling)
			{return Get_Typ(ID,Parnt,Old_Sibling);}

			@Finishd(Is_Finishd=true)
			public static Conectn_Typ Get_Typ_PRsd(String ID,Conectn Parnt,Conectn Old_Sibling)
			{
				return (Is_QOtd(ID))?Get_Typ_QOtd(ID):
									 Get_Typ	 (ID,Parnt,Old_Sibling);
			}
				@Alias @Finishd(Is_Finishd=true)
				public static Conectn_Typ Get_Conectn_Typ_PRsd(String ID,Conectn Parnt,Conectn Old_Sibling)
				{	return Get_Conectn_Typ_PRsd(ID,Parnt,Old_Sibling);	 }
		@Finishd(Is_Finishd=true)
		public static Conectn_Typ Gar_Typ(Object SOrc)
		{
			return (SOrc instanceof Conectn_Typ Typ)?			 Typ	:
				   (SOrc instanceof String		ID )?Get_Conectn_Typ(ID):
				   (SOrc instanceof Conectn Conectn)?(Conectn_Typ)Conectn.Get_Typ():
							 ThrO_Invalid_SOrc("Conectn_Typ",SOrc);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public final Conectn_Typ Gar_Parnt(Object SOrc)
		{return Gar_Typ(SOrc);}
			@Alias @Finishd(Is_Finishd=true)
			public static Conectn_Typ Gar_Conectn_Typ(Object SOrc)
			{return Gar_Typ(SOrc);}

		public static Conectn_Typ Reg_Conectn_Typ(Conectn_Typ Typ)
		{
			Registry.put(Typ.Get_NAm(),Typ);
			return Typ;
		}
		public static Conectn_Typ Reg_Conectn_Typ(String ID,Material Material,Int3$1 Mixr,String ShAp)
		{return Reg_Conectn_Typ(new Conectn_Typ(ID,Material,Mixr,ShAp));}
			public static Conectn_Typ Reg_Conectn_Typ(Object[] MEt,Int3$1 Mixr,String ShAp)
			{return Reg_Conectn_Typ((String)MEt[0],(Material)MEt[1],Mixr,ShAp);}
				public static Conectn_Typ Reg_Conectn_Typ(Object MEt,Int3$1 Mixr,String ShAp)
				{return Reg_Conectn_Typ(Get_MEt(MEt),Mixr,ShAp);}
		public static Conectn_Typ Infr_Conectn_Typ(Object A_SOrc,
												   Object B_SOrc)
		{
			NOd_Typ A=Gar_NOd_Typ(A_SOrc),
					B=Gar_NOd_Typ(B_SOrc);
			if(A==B)
			{	Get_Conectn_Typ(A.Get_NAm());   }
			throw new RuntimeException("Can't infer connection type.");
		}

		static
		{
			new Conectn_Typ("Conectn","Conectn",Dfalt_Mixr,"LIn");

			new Conectn_Typ("Straw","Glas",Material_Mixr,"LIn");

			new Conectn_Typ("Material",0,V("Straw"));

			new Conectn_Typ("RlAt","RlAt",A_BC_Mixr,"LIn");

			new Conectn_Typ("DpNdNC","DpNdNC",A_BC_Mixr,"LIn");
			new Conectn_Typ("DpNdNC_Dubious","DpNdNC_Dubious",Dfalt_Mixr,"LIn");

			new Conectn_Typ("Proxy","Proxy",A_BC_Mixr,"LIn");
			new Conectn_Typ("ManifStAtn","ManifStAtn",A_BC_Mixr,"LIn");
			new Conectn_Typ("Abreviatn","Abreviatn",A_BC_Mixr,"LIn");

			new Conectn_Typ("Com","Com",Dfalt_Mixr,"LIn");
			new Conectn_Typ("SeqNc","SeqNc",Dfalt_Mixr,"LIn");
			new Conectn_Typ("Suport","Suport",Dfalt_Mixr,"LIn");
			new Conectn_Typ("Contiguous","Contiguous",Dfalt_Mixr,"LIn");
			new Conectn_Typ("Typ_X","Typ",Dfalt_Mixr,"LIn");
			new Conectn_Typ("Inst_O","Inst_O",Dfalt_X_A_Tran_Mixr,"LIn");

			new Conectn_Typ("Rducs_To","Rducs_To",Dfalt_Mixr,"LIn");

			new Conectn_Typ("Functn_Cal","Functn_Cal",Dfalt_Mixr,"LIn");
			new Conectn_Typ("Method_OvrId","Method_OvrId",Dfalt_Mixr,"LIn");
			new Conectn_Typ("MMbr","MMbr",Dfalt_Mixr,"LIn");
				new Conectn_Typ("Inst_MMbr","Inst_MMbr",A_BC_Mixr,"LIn",V("MMbr"));
				new Conectn_Typ("Clas_MMbr","Clas_MMbr",A_BC_Mixr,"LIn",V("MMbr"));

			new Conectn_Typ("COd_Pakg_ContAn","COd_Pakg",A_BC_Mixr,"LIn");

			new Conectn_Typ("Modul_ContAn","COd_Modul",Dfalt_Mixr,"LIn");

			new Conectn_Typ("COd_Pakg_Al_Modul","COd_Pakg_Al_Modul",Dfalt_Mixr,"LIn");

			new Conectn_Typ("Program_Conectn","Program",Dfalt_Mixr,"LIn");

			new Conectn_Typ("FIl_ContAn","FIl_Structr",Dfalt_Mixr,"LIn");
				new Conectn_Typ("FIl_ContAn_Pakd","FIl_Pakd",Dfalt_Mixr,"LIn");

			new Conectn_Typ("TSt0","TSt0",Dfalt_Mixr,"LIn");
			new Conectn_Typ("TSt1","TSt1",Dfalt_Mixr,"LIn");
			new Conectn_Typ("TSt2","TSt2",Dfalt_Mixr,"LIn");
			new Conectn_Typ("TSt3","TSt3",Dfalt_Mixr,"LIn");
			new Conectn_Typ("Shufl","Shufl",Dfalt_Mixr,"LIn");
		}
		@Finishd(Is_Finishd=true)
		public static void FrEch_Conectn_Typ(Point$<Conectn_Typ> Do)
		{FrEch(Registry.values(),Do);}
	//</editor-fold>
}