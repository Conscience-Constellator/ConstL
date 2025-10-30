package CC.ConstL;

import CC.$.Q$.Point$;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q$Q.Point1$1;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static CC.ConstL.NOd.AsMbl_ID;
import static CC.List.FrEch.FrEch;
import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.Wethr_$String;

import static java.lang.System.out;
import static CC.UI.ConsOl.Print_IndX;

public interface ConstL_Editr<NOd_GN_Typ extends NOd,Conectn_ extends Conectn>
		 extends ConstLAtn	 <NOd_GN_Typ,Conectn_>,Stepg_Havr
{
	// <editor-fold desc="SL">
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	NOd_GN_Typ Get_NOd_A();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Set_NOd_A(NOd_GN_Typ NOd);
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void On_SL_NOd_A()
		{
			if(Conect_On_A_SL())
			{Try_Conect_AB();}
		}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void	SL_NOd_A(NOd_GN_Typ NOd)
		{
			Set_NOd_A(NOd);
			On_SL_NOd_A();
		}
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	NOd_GN_Typ Get_NOd_B();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Set_NOd_B(NOd_GN_Typ NOd);
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void On_SL_NOd_B()
		{
			if(Conect_On_B_SL())
			{Try_Conect_AB();}
		}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void	SL_NOd_B(NOd_GN_Typ NOd)
		{
			Set_NOd_B(NOd);
			On_SL_NOd_B();
		}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default NOd_GN_Typ Get_NOd(int ID)
	{
		return switch(ID)
		{
			case 0->Get_NOd_A();
			case 1->Get_NOd_B();
			default->throw new RuntimeException("Invalid ID");
		};
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void Swap_SL()
	{
			NOd_GN_Typ C=
		Get_NOd_A();
		 SL_NOd_A(
		Get_NOd_B());
		 SL_NOd_B(
				C);
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void SL_ConstL_Parnt_NOd()
	{
		if(Get_NOd_A()					instanceof NOd A	&&
				   A.Get_ConstL_PArnt() instanceof NOd Parnt)
		{	SL_NOd_A(	  (NOd_GN_Typ)Parnt);}
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void SL_ConstL_Child_NOd()
	{
		if(Get_NOd_A()                     instanceof NOd A&&
				   A.Get_Th_ConstL_Child() instanceof NOd Child)
		{	SL_NOd_A(        (NOd_GN_Typ)Child);}
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void SL_Th_Sibling()
	{
		if(Get_NOd_A	 ()	 instanceof NOd A&&
		 A.Get_Th_Sibling(A) instanceof NOd Sibling)
		{	SL_NOd_A((NOd_GN_Typ)Sibling);}
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default boolean Print_Is_Presnt_From(String NAm)
	{
		return      Print_Is_Presnt     ((Get_NOd_A() instanceof NOd NOd)?AsMbl_ID(NOd.Get_ID(),NAm):
																								NAm);
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default boolean Print_Is_Presnt_From(     Point1$1<String,String> SOrc)
		{	return      Print_Is_Presnt_From(SOrc.Point1$1(""));   }
	@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
	default NOd_GN_Typ SL_If_Presnt(String ID)
	{
		NOd_GN_Typ NOd=SEk_Th_NOd(ID);

		SL_NOd_A(NOd);
		return NOd;
	}
		@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
		default NOd_GN_Typ SL_If_Presnt(Point1$1<String,String> SOrc)
		{
			return   SL_If_Presnt(SOrc.Point1$1((Get_NOd_A() instanceof NOd_GN_Typ NOd)?NOd.Get_ID():
																				  ""));
		}
	@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
	default NOd_GN_Typ SL_If_Presnt_From(String NAm)
	{
		return   SL_If_Presnt     ((Get_NOd_A() instanceof NOd NOd)?AsMbl_ID(NOd.Get_ID(),NAm):
																						  NAm);
	}
		@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
		default NOd_GN_Typ SL_If_Presnt_From(Point1$1<String,String> SOrc)
		{
			return   SL_If_Presnt_From(SOrc.Point1$1((Get_NOd_A() instanceof NOd_GN_Typ NOd)?NOd.Get_ID():
																					   ""));
		}
	// <editor-fold desc="Conectn">

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	Conectn_ Get_Conectn_A();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void    Set_Conectn_A(Conectn_ Conectn);
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void    SL_Conectn_A(Conectn_ Conectn)
		{	Set_Conectn_A(Conectn);   }
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	Conectn_ Get_Conectn_B();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void     Set_Conectn_B(Conectn_ Conectn);
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void    SL_Conectn_B(Conectn_ Conectn)
		{	Set_Conectn_B(Conectn);   }
	//</editor-fold desc="Conectn">
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	NOd_Typ Get_NOd_Typ();
	@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
	default void ClEr_SL()
	{
		SL_NOd_A    (null);
		SL_NOd_B    (null);
		SL_Conectn_A(null);
		SL_Conectn_B(null);
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
	default NOd_GN_Typ Get_Eqvlnt_NOd(NOd_GN_Typ NOd)
	{
		return (NOd!=null)?Get_NOd(NOd.Get_ID()):
						   null;
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
	default void Rset_SL()
	{
		 SL_NOd_A(Get_Eqvlnt_NOd(
		Get_NOd_A()));
		 SL_NOd_B(Get_Eqvlnt_NOd(
		Get_NOd_B()));
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=false)
	default boolean Conect_On_A_SL()
	{return false;}
	@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=false)
	default boolean Conect_On_B_SL()
	{return false;}
	//</editor-fold desc="SL">

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	Conectn_Typ Get_Conectn_Typ();
	//<editor-fold desc="Conect">
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default Conectn_ Conect_AB(Object Typ_SOrc)
	{return Reg_Conectn(Typ_SOrc,Get_NOd_A(),Get_NOd_B());}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default Conectn_ Conect_AB()
		{return Conect_AB(Get_Conectn_Typ());}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default Conectn_ Try_Conect_AB(Object Typ_SOrc)
	{
		return (Typ_SOrc!=null)?
			Conect_AB(Typ_SOrc):
			null;
	}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default Conectn_ Try_Conect_AB()
		{return Try_Conect_AB(Get_Conectn_Typ());}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void Conect_AB(List<Conectn_> Conectng,
						   NOd_GN_Typ A,NOd_GN_Typ B)
	{
		FrEch(Conectng,(Conectn)->
					   {   Reg_Conectn(Conectn.Get_Typ(),A,B);   });
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default Conectn_ Conect_BA(Object Typ_SOrc)
	{return Reg_Conectn(Typ_SOrc,Get_NOd_B(),Get_NOd_A());}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default Conectn_ Conect_BA()
		{return Conect_BA(Get_Conectn_Typ());}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default Conectn_ Try_Conect_BA(Object Typ_SOrc)
	{
		return (Typ_SOrc!=null)?
			Conect_AB(Typ_SOrc):
			null;
	}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default Conectn_ Try_Conect_BA()
		{return Try_Conect_BA(Get_Conectn_Typ());}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default boolean Disconect_BtwEn_AB(Conectn_ Conectn,
		NOd_GN_Typ A,NOd_GN_Typ B)
	{
		if(Conectn.Is_BtwEn(A,B))
		{
			Unreg_Conectn(Conectn);

			return true;
		}
		return false;
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
	default void Disconect(NOd_GN_Typ A,NOd_GN_Typ B)
	{
		AtomicInteger Num=new AtomicInteger();
		FrEch_Conectn((Conectn)->
					  {
						  if(Disconect_BtwEn_AB(Conectn,A,B))
						  {   Num.addAndGet(1);   }
					  });

		out.println("Removed "+Num+" connection(s) between "+A.Get_ID()+'/'+
															 B.Get_ID());
	}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Disconect()
		{Disconect(Get_NOd_A(),Get_NOd_B());}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void Rconect_A(NOd_GN_Typ Old_A,NOd_GN_Typ Old_B,
						   NOd_GN_Typ New_A			)
	{
		FrEch_Conectn((Conectn)->
					  {Conectn.Set_NOd_A(New_A);},
					  Old_A,Old_B);
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void Rconect_B(NOd_GN_Typ Old_A,NOd_GN_Typ Old_B,
									  NOd_GN_Typ New_B)
	{
		FrEch_Conectn((Conectn)->
					  {Conectn.Set_NOd_B(New_B);},
					  Old_A,Old_B);
	}
	//</editor-fold>
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void DlEt_NOd()
	{
		Unreg_NOd(Get_NOd_A());
		SL_NOd_A(null);
	}

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Absorb_Typ();

	// <editor-fold desc="Parnt">
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void Set_ConstL_Parnt(NOd_GN_Typ Parnt,
								  NOd_GN_Typ Child)
	{
		if(Parnt!=null&&
		   Child!=null)
		{
		   Child.ConstL_Parnt(
						Parnt);
		}
	}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Set_ConstL_Parnt_AB()
		{
			Set_ConstL_Parnt(Get_NOd_A(),
							 Get_NOd_B());
		}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Set_ConstL_Parnt_BA()
		{
			Set_ConstL_Parnt(Get_NOd_B(),
							 Get_NOd_A());
		}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default void Set_ConstL_Parnt()
			{Set_ConstL_Parnt_AB();}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void ConstL_Unparnt()
	{
		if(Get_NOd_A() instanceof NOd_GN_Typ A)
		{A.ConstL_Unparnt();}
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void Adopt()
	{
		if(Get_NOd_A() instanceof NOd A&&
		   Get_NOd_B() instanceof NOd B)
		{
			NOd_GN_Typ Old_Parnt=(NOd_GN_Typ)B.Get_ConstL_PArnt();
			B.ConstL_Parnt(A);
			B.FrEch_Conectn((Point$<Conectn>)(Conectn)->
							{Conectn.RplAc_NOd(Old_Parnt,A);});
		}
	}

	//<editor-fold desc="GN">
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default boolean Do_SL_New_Object()
	{return false;}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default NOd_GN_Typ New_NOd(NOd_GN_Typ NOd,boolean SL)
	{
		if(SL&&NOd!=null)
		{	SL_NOd_A(NOd);   }

		return NOd;
	}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default NOd_GN_Typ New_NOd(NOd_GN_Typ NOd)
		{	return New_NOd(NOd,Do_SL_New_Object());   }
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void CoP_Conectn(NOd_GN_Typ From_A,NOd_GN_Typ From_B,
							 NOd_GN_Typ To_A,NOd_GN_Typ To_B)
	{
//		out.println("Copy connections");

		Conect(Get_Conectng_AB(From_A,From_B),
								 To_A,  To_B);
		Conect(Get_Conectng_BA(From_A,From_B),
								 To_A,  To_B);
	}
	//</editor-fold desc= "GN">
	// <editor-fold desc="DgN">
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
	default NOd_GN_Typ Rmov(String NAm)
	{
		return null;
	}
	//</editor-fold desc="DgN">
	// <editor-fold desc="Rarang">
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void Ratach_Conectn(NOd A,NOd From,NOd_GN_Typ To)
	{
		FrEch_Conectn((Conectn)->
					  {   Conectn.RplAc_NOd(From,To);   },A,From);
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void Ratach_Lin	   (NOd A,NOd From,NOd To)
	{
		NOd A_Parnt=   A.Get_ConstL_PArnt(),
		 From_Parnt=From.Get_ConstL_PArnt();
		 if(A_Parnt==From)
		{
			A	.ConstL_Parnt  (To);
		}else
		 if(From_Parnt==A)
		{
			From.ConstL_Unparnt();
			To	.ConstL_Parnt  (A);
		}
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void RplAc_RlAtnship(NOd A,NOd From,NOd_GN_Typ To)
	{
		Ratach_Conectn(A,From,To);
		Ratach_Lin	  (A,From,To);
	}
	//</editor-fold desc="Rarang">
	 
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default ConstL_Object<?> Get_SLd_ConstL_Object()
	{
		NOd			A=Get_NOd_A(),
					B=Get_NOd_B();
		boolean Has_A=        A!=null,
				Has_B=        B!=null;

		return Print_IndX(1,"Selected constellation object w/, "+Wethr_$String('A',Has_A)+
																			   Wethr_$String('B',Has_B)+": ",
			(Has_A)?
				(Has_B)?
					(A==B)?
						A:
						Get_Th_Conectn(A,B):
									   A   :
				 B,
			'\n');
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void Rtyp(Object To_SOrc)
	{Rtyp(Get_SLd_ConstL_Object(),To_SOrc);}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Rtyp(Point1$1<String,String> To_SOrc)
		{	Rtyp_Thru(Get_SLd_ConstL_Object(),To_SOrc);   }

		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Mimc(NOd_GN_Typ A,NOd_GN_Typ B)
		{
			if(A!=null&&
			   B!=null)
			{	Rtyp(B,A);   }
		}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default void Mimc_AB()
			{	Mimc(Get_NOd_A(),Get_NOd_B());   }
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default void Mimc_BA()
			{	Mimc(Get_NOd_B(),Get_NOd_A());   }
				@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
				default void Mimc()
				{	Mimc_AB();   }
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Rtyp_BAsd_On_NAm(Point1$1<String,String> To_SOrc)
		{
			if(Get_NOd_A() instanceof NOd NOd)
			{Rtyp_Thru(NOd,To_SOrc,NOd.Get_NAm());}
		}

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void   Init_LOd(String URL)
	{
		if(MAntAn_SL_Thru_LOd())
		{	Rset_SL();}
		else
		{	ClEr_SL();}

		ConstLAtn.super.Init_LOd(URL);
	}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void FInlIz_LOd(String URL)
	{
		if(MAntAn_SL_Thru_LOd())
		{	Rset_SL();}
		else
		{	ClEr_SL();}

		ConstLAtn.super.FInlIz_LOd(URL);
	}
}