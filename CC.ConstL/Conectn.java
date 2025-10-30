package CC.ConstL;

import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import static CC.ConstL.Util.Bak_TOkn;
import static CC.ConstL.Util.For_TOkn;
import static CC.Point.Point_Util.*;
import CC.$.Q$Q.Point$Bool;
import CC.Encycloped.TIm.UpdAtbl;

public interface Conectn<NOd_GNerc_Typ extends NOd,
					 Conectn_ extends Conectn>
		 extends ConstL_Object<Conectn_Typ>,NOdg_Havr<NOd_GNerc_Typ>,UpdAtbl
{
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default boolean R_NOds_NAtv()
	{	return Get_NOd_A().Is_NAtv()&&Get_NOd_B().Is_NAtv();   }

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default Conectn_Typ Gar_Typ(Object SOrc)
	{return Conectn_Typ.Gar_Typ(	   SOrc);}

	//<editor-fold desc="NOd">
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	NOd_GNerc_Typ Get_NOd_A();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Set_NOd_A(NOd_GNerc_Typ A);
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	NOd_GNerc_Typ Get_NOd_B();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Set_NOd_B(NOd_GNerc_Typ B);
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void Set_NOdg(NOd_GNerc_Typ A,NOd_GNerc_Typ B)
	{
		Set_NOd_A(A);
		Set_NOd_B(B);
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Set_NOdg(ConstLAtn<NOd_GNerc_Typ,Conectn_> ConstL,Object A,Object B)
		{
			Set_NOdg(ConstL.Gar_NOd(A),
					 ConstL.Gar_NOd(B));
		}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void Swap()
	{	Set_NOdg(Get_NOd_B(),Get_NOd_A());   }
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void RplAc_NOd(NOd  Old,
						   NOd_GNerc_Typ New)
	{
		Set_NOd_A(Gar_Acceptbl(
		Get_NOd_A(),Old,New));
		Set_NOd_B(Gar_Acceptbl(
		Get_NOd_B(),Old,New));
	}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void Dtach()
	{
		Get_NOd_A().Get_Conectng().remove(this);
		Get_NOd_B().Get_Conectng().remove(this);
		Set_NOdg(null,null);
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void Get_Is_Rvrs()
	{
		Get_NOd_A().Get_Conectng().remove(this);
		Get_NOd_B().Get_Conectng().remove(this);
		Set_NOdg(null,null);
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default String Get_Dr_String(NOd<?,?> A,
								   NOd<?,?> B)
		{
			return Util.Get_Dr_String(Get_NOd_A(),Get_NOd_B(),
											  A  ,        B  );
		}

	// <editor-fold desc="Chek">
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default boolean Involvs(NOd NOd)
	{
		return Mach_Ethr(NOd,
					 Get_NOd_A(),Get_NOd_B());
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default int IndX(NOd NOd)
	{
		return (NOd==Get_NOd_A())?0:
			   (NOd==Get_NOd_B())?1:
								 -1;
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default boolean Is_FroTo(NOd A,NOd B)
	{
		return Mach(A  ,        B  ,
			Get_NOd_A(),Get_NOd_B());
	}
		@Finishd(Is_Finishd=true)
		static Point$Bool<Conectn> Is_FroTo_Chekr(NOd A,NOd B)
		{return (Conectn)->{return Conectn.Is_FroTo(A,B);};}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default boolean Is_BtwEn(NOd A,NOd B)
	{
		return Mach_Comutbl(A  ,        B  ,
					Get_NOd_A(),Get_NOd_B());
	}
		@Finishd(Is_Finishd=true)
		static Point$Bool<Conectn> Is_BtwEn_Chekr(NOd A,NOd B)
		{return (Conectn)->{return Conectn.Is_BtwEn(A,B);};}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default boolean Is_Parnt()
	{
		return Get_NOd_B().Get_ConstL_PArnt()==
			   Get_NOd_A();
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default boolean Is_Child()
	{
		return Get_NOd_A().Get_ConstL_PArnt()==
			   Get_NOd_B();
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default  boolean    RpresNts_ConstL_Lin_RL()
	{	return          RpresNts_ConstL_Lin_RL_W(Get_NOd_A());   }
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default     boolean RpresNts_ConstL_Lin_RL_W(NOd_GNerc_Typ NOd)
	{	return Get_NOd_B().Is_In_ConstL_Lin_RL_W(NOd);   }
	/**Assumes, if not reverse, must be forward.*/
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default String RL$String()
	{
		return ((!Is_Child())?Bak_TOkn:
			For_TOkn)+' '+Get_Typ().Get_NAm();
	}
	//</editor-fold desc="Chek">
	//</editor-fold desc="NOd">

	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void Set(Object Typ_SOrc,
					 NOd_GNerc_Typ A,NOd_GNerc_Typ B)
	{
		Set_Typ(Typ_SOrc);
		Set_NOdg(A,B);

		UpdAt();
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Set(Object Typ_SOrc,
						 NOd_GNerc_Typ A,NOd_GNerc_Typ B,boolean Rvrs)
			{
				if(Rvrs)
				{Set(Typ_SOrc,B,A);}
				else
				{Set(Typ_SOrc,A,B);}
		}

		@Lin_DclAr @Neds_Ovrid(NEds=Ok/*There might be an interaction w/ ConstL, that isn't getting A node from source.*/) @Finishd(Is_Finishd=true)
		default void Set(Object Typ_SOrc,ConstLAtn<NOd_GNerc_Typ,Conectn_> ConstL,Object A,Object B)
		{Set(Typ_SOrc,ConstL.Gar_NOd(A),ConstL.Gar_NOd(B));}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void Set(Object Typ_SOrc,ConstLAtn<NOd_GNerc_Typ,Conectn_> ConstL,Object A,Object B,boolean Rvrs)
			{
				Set(Typ_SOrc,ConstL.Gar_NOd(A),
							 ConstL.Gar_NOd(B),Rvrs);
			}

	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void UpdAt()
	{}

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	Conectn_ CoP(Conectn_Typ Typ,NOd_GNerc_Typ A,NOd_GNerc_Typ B);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default Conectn_ CoP(NOd_GNerc_Typ A,NOd_GNerc_Typ B)
		{return CoP(Get_Typ(),A,B);}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default Conectn_ CoP_W_New_A(NOd_GNerc_Typ A)
			{
				return CoP(		   A  ,
						   Get_NOd_B());
			}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default Conectn_ CoP_W_New_B(NOd_GNerc_Typ B)
			{
				return CoP(Get_NOd_A(),
								   B  );
			}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default Conectn_ Split_KEp_A(NOd_GNerc_Typ Mid)
			{
				Conectn_ New_Haf=CoP_W_New_A(Mid);
				Set_NOd_B(Mid);

				return New_Haf;
			}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default Conectn_ Split_KEp_B(NOd_GNerc_Typ Mid)
			{
				Conectn_ New_Haf=CoP_W_New_B(Mid);
				Set_NOd_A(Mid);

				return New_Haf;
			}

	class				 Conectn_Imp<NOd extends CC.ConstL.NOd,Conectn extends Conectn_Imp<NOd,?>>
	implements CC.ConstL.Conectn    <NOd                      ,Conectn                           >
	{
		private          boolean  Is_NAtv=true;
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final boolean  Is_NAtv()
			{	return            Is_NAtv;   }
			@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
			public       void Set_Is_NAtv(boolean Is)
			{		              Is_NAtv        =Is;   }
		@Finishd(Is_Finishd=true)
		private Conectn_Typ Typ;
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final Conectn_Typ Get_Typ()
			{return Typ;}
			@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			public				void Set_Typ(Conectn_Typ Typ)
			{this.Typ=Typ;}

		@Finishd(Is_Finishd=true)
		private NOd A,B;
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final NOd Get_NOd_A()
			{return A;}
			@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			public		void Set_NOd_A(NOd A)
			{this.A=A;}
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final NOd Get_NOd_B()
			{return B;}
			@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			public		void Set_NOd_B(NOd B)
			{this.B=B;}

		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public Conectn CoP(Conectn_Typ Typ,NOd A,NOd B)
		{return (Conectn)new Conectn_Imp(Typ,A,B);}

		@Finishd(Is_Finishd=true)
		public Conectn_Imp(Object Typ_SOrc,
						   NOd A,NOd B)
		{Set(Typ_SOrc,A,B);}
			@Finishd(Is_Finishd=true)
			public Conectn_Imp(Object Typ_SOrc,
							   NOd A,NOd B,boolean Rvrs)
			{Set(Typ_SOrc,A,B,Rvrs);}

			@Finishd(Is_Finishd=true)
			public Conectn_Imp(Object Typ_SOrc,
							   ConstLAtn ConstL,Object A,Object B)
			{Set(Typ_SOrc,ConstL,A,B);}
				@Finishd(Is_Finishd=true)
				public Conectn_Imp(Object Typ_SOrc,
								   ConstLAtn ConstL,Object A,Object B,boolean Rvrs)
				{Set(Typ_SOrc,ConstL,A,B,Rvrs);}
	}
}