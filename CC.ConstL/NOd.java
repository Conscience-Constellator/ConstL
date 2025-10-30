package CC.ConstL;

import CC.$.Q$.Point$;
import CC.$.Q$Q.Point$Bool;
import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
import		  CC.COd.Alias;

import static CC.Encycloped.Abs.Org.Syc.TXt.SEk.Last_IndX_If;
import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.*;
import CC.Encycloped.Abs.Org.Syc.TXt.Path;
import CC.RL.Cyclcl_PArntng_X;
import CC.Util.NAm.DisplAd_NAm_Havr;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.System.out;

public interface NOd<NOd_GN_Typ extends NOd,Conectn_GNerc_Typ extends Conectn>
		 extends ConstL_Object<NOd_Typ>,NOdl_Structr<NOd_Typ>,DisplAd_NAm_Havr,
				 Childrn_Havr<NOd_GN_Typ>,Conectng_Havr<NOd,Conectn_GNerc_Typ>
{
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default NOd_Typ Gar_Typ(Object SOrc)
	{return NOd_Typ.Gar_Typ(	   SOrc);}

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
	default void ThrO_If_This(NOd Parnt)
	{
		while(Parnt!=null)
		{
			if(Parnt==this)
			{	throw new Cyclcl_PArntng_X("Parnt=this");   }
			Parnt=Parnt.Get_ConstL_PArnt();
		}
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	NOd_GN_Typ Get_ConstL_PArnt();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Set_ConstL_Parnt(NOd_GN_Typ Parnt);
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void ConstL_Unparnt_No_Nul(NOd_GN_Typ Parnt)
		{
			Parnt.Rmov_ConstL_Child(this);
			Set_ConstL_Parnt(null);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void ConstL_Unparnt()
		{
			if(Get_ConstL_PArnt() instanceof NOd_GN_Typ Parnt)
			{	ConstL_Unparnt_No_Nul(Parnt);   }
			UpdAt_ID(Get_NAm());
		}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void ConstL_Parnt(NOd_GN_Typ New)
		{
			ThrO_If_This(New);

			Set_StM(New);
			if(Get_ConstL_PArnt() instanceof NOd Old)
			{	Old.Rmov_ConstL_Child(this);   }
			if(New!=null)
			{	New.Ad_ConstL_Child(  this);   }

			Set_ConstL_Parnt(New);
		}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void Get_ConstL_Lin(List<NOd> List)
	{
		List.add(this);
		if(Get_ConstL_PArnt() instanceof NOd PArnt)
		{	PArnt.Get_ConstL_Lin(List);   }
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default List<NOd> Get_ConstL_Lin()
		{
			List<NOd> List=new ArrayList<>();
			Get_ConstL_Lin(List);

			return List;
		}

		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default NOd_GN_Typ Get_Frst_NOd_In(List<NOd_GN_Typ> Lin)
		{
			return (Lin.contains(this))?(NOd_GN_Typ)this:
			 (NOd_GN_Typ)Get_ConstL_PArnt().Get_Frst_NOd_In(Lin);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default NOd_GN_Typ Get_LCA(NOd_GN_Typ B)
		{	return (NOd_GN_Typ)Get_Frst_NOd_In(B.Get_ConstL_Lin());   }
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default boolean Is_In_ConstL_Lin_RL_W(NOd_GN_Typ PotNtl_RL)
	{
		return        Get_ConstL_PArnt()           ==PotNtl_RL||
			PotNtl_RL.Get_ConstL_PArnt()           ==this     ;
	}

	@Alias @Finishd(Is_Finishd=false)
	default ConstL_PArnt<NOd_GN_Typ> Is_ConstL_Sibling(NOd_GN_Typ PotNtl_Sibling)
	{
		return (		Get_ConstL_PArnt() instanceof ConstL_PArnt  Mutual_PArnt&&
		 PotNtl_Sibling.Get_ConstL_PArnt() ==         Mutual_PArnt)?Mutual_PArnt:
																	null;
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default NOd_GN_Typ Get_Th_Sibling()
	{
		return (Get_ConstL_PArnt() instanceof NOd Parnt)?(NOd_GN_Typ)Parnt.Get_Th_Sibling(this):
														 null;
	}

	//<editor-fold desc="ID">
	String Dlimitr=".";
		char Dlimitr_ChR='.';
	static String AsMbl_ID(String StM,String NAm)
	{return Togethr(StM,Dlimitr)+NAm;}
	@Finishd(Is_Finishd=true)
	static String AsMbl_BfOr_NAm(String StM)
	{
		return Togethr(StM,Dlimitr);
	}
	@Finishd(Is_Finishd=true)
	static String AsMbl_BfOr_NAm(NOd Parnt)
	{
		return ((Parnt!=null)?Togethr(Parnt.Get_ID(),Dlimitr):
							  MpT);
	}
	@Finishd(Is_Finishd=true)
	static String AsMbl_Aftr_StM(String StM,String NAm)
	{	return Togethr(Dlimitr,NAm,Truthy(StM));   }
	@Finishd(Is_Finishd=true)
	static String AsMbl_ID(NOd Parnt,String NAm)
	{
		return AsMbl_BfOr_NAm(Parnt)+
			   NAm;
	}
	static int Get_NAm_Dlimitr(String ID)
	{return Last_IndX_If(ID,Dlimitr);}
	@Finishd(Is_Finishd=false)
	static boolean Is_Valid_ID(String ID)
	{
		return Truthy(ID)//&&
//		  !(ID.charAt(ID.length()-1)==Dlimitr_ChR)
			;
	}
	//<editor-fold desc="RL_ID">
	char   StMwrd_ChR='/';
	String StMwrd    ="/";
	static boolean Looks_LIk_StMwrd(String String)
	{	return String.charAt(0)==StMwrd_ChR;   }
	@Finishd(Is_Finishd=true)
	static String   RIt_RL_ID(String From,
							  String  To)
	{	return Path.RIt_RL_ID(From,   To,".",StMwrd);}
		@Finishd(Is_Finishd=true)
		static String   RIt_RL_ID(NOd From,
							   String  To)
		{	return      RIt_RL_ID(From.Get_ID(),To);   }
	@Finishd(Is_Finishd=true)
	static String REd_RL_ID(String From,
							String  To)
	{	return Path.REd_RL_ID(From,To,".",StMwrd);	 }
		@Finishd(Is_Finishd=true)
		static String REd_RL_ID(NOd From,
							 String  To)
		{	return    REd_RL_ID(From.Get_ID(),To);   }
	//</editor-fold>
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	String Get_ID();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void   Set_ID(String ID);
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void UpdAt_ID(String ID)
		{
			Set_ID(		ID);
			UpdAt_Child_IDg();
		}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default void UpdAt_ID(String StM,String NAm)
			{UpdAt_ID(AsMbl_ID(StM,NAm));}
				@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
				default void UpdAt_ID(NOd Parnt,String NAm)
				{UpdAt_ID(AsMbl_ID(Parnt,NAm));}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default void UpdAt_ID()
			{UpdAt_ID(Get_ConstL_PArnt(),Get_NAm());}

		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default String Get_BfOr_NAm()
		{
			return (Get_ConstL_PArnt() instanceof NOd Parnt)?Togethr(Parnt.Get_ID(),Dlimitr):
															 MpT;
		}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Set_StM(String StM)
		{UpdAt_ID(StM,Get_NAm());}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default void Set_StM(NOd StM)
			{Set_StM((StM instanceof NOd Parnt)?Parnt.Get_ID():null);}
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	String Get_NAm();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void   Set_NAm(String NAm);
		@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
		default void UpdAt_NAm(String NAm)
		{
			Set_NAm(NAm);
			UpdAt_ID();
		}
	//</editor-fold>

	@Override @Neds_Ovrid(NEds=Ok/*Conceivably an extension of NOd may add composition by sub-nodes.*/) @Finishd(Is_Finishd=true)
	default boolean Involvs(NOd NOd)
	{return NOd==this;}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default Point$Bool<Conectn_GNerc_Typ> A_Chekr()
	{
		return (          Conectn)->
			   {   return Conectn.Get_NOd_A()==this;   };
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default Point$Bool<Conectn_GNerc_Typ> B_Chekr()
	{
		return (          Conectn)->
			   {   return Conectn.Get_NOd_B()==this;   };
	}

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	List<NOd_GN_Typ> Get_Childrn();
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default NOd_GN_Typ Get_ConstL_Old_Sibling(NOd_GN_Typ Child)
		{
			List<NOd_GN_Typ> Childrn=Get_Childrn();
			int IndX=Childrn.indexOf(Child);

			return (IndX>-1)?Childrn.get(IndX-1):
							 null;
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default NOd_GN_Typ Get_ConstL_Senior(NOd_GN_Typ Child)
		{
			List<NOd_GN_Typ> Childrn=Get_Childrn();
			int IndX=Childrn.indexOf(Child);

			return (IndX>-1)?Childrn.get(IndX-1):
							 (NOd_GN_Typ)this;
		}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Ad_ConstL_Child(NOd_GN_Typ Child)
		{
			AtomicBoolean Do_Ad=new AtomicBoolean(true);
			FrEch_Child((NOd)->
			{
				String ID=Child.Get_ID();
				if(NOd.Get_ID().equals(ID))
				{
					String MSg="Already parented node of ID "+QOt(ID);
//						throw new RuntimeException(MSg);
					out.println(MSg+"... Ignoring.");
					Do_Ad.set(false);
				}
			});
			if(Do_Ad.get())
			{	Get_Childrn().add(Child);   }
		}
			@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
			NOd_GN_Typ MAk_ConstL_Child();
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void  Rmov_ConstL_Child(NOd_GN_Typ Child)
		{Get_Childrn().remove(Child);}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void RplAc_ConstL_Child(NOd_GN_Typ Old,
										NOd_GN_Typ New)
		{
			Rmov_ConstL_Child(Old);
			  Ad_ConstL_Child(New);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void UpdAt_Child_IDg()
		{
			String ID=Get_ID();
			FrEch_Child((Child)->
						{   Child.Set_StM(ID);   });
		}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default String Get_AvAlbl_Child_NAm()
		{
			String ID=Get_ID();
			AtomicInteger IndX=new AtomicInteger();
			FrEch_Child((Child)->
						{
//							if((Child.Get_NAm()))
						});

			return String.valueOf(Get_Childrn().size());
		}

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void FrEch_Conectn_From(Point$<Conectn_GNerc_Typ> Do)
	{			 FrEch_Conectn(Do,A_Chekr());   }
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Get_Conectng_From(List<Conectn_GNerc_Typ> List)
		{		   FrEch_Conectn_From (List::add);   }
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default List<Conectn_GNerc_Typ> Get_Conectng_From()
			{	return                      Get_Conectng(A_Chekr());   }
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default boolean Is_LOclIzbl(Conectn_GNerc_Typ Conectn)
	{
		return Conectn.Get_NOd_A()==this&&
			 (!Conectn.RpresNts_ConstL_Lin_RL_W(this))&&
			   Conectn.Is_NAtv();
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void FrEch_LOclIzbl_Conectn_From(Point$<Conectn_GNerc_Typ> Do)
	{	FrEch_Conectn(Do,this::Is_LOclIzbl);   }
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Get_LOclIzbl_Conectng_From(List<Conectn_GNerc_Typ> List)
		{		   FrEch_Conectn_From (List::add);   }
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default List<Conectn_GNerc_Typ> Get_LOclIzbl_Conectng_From()
			{	return                      Get_Conectng(this::Is_LOclIzbl);   }
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void FrEch_Conectn_To  (Point$<Conectn_GNerc_Typ> Do)
	{			 FrEch_Conectn(Do,B_Chekr());   }
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void   Get_Conectn_To(List<Conectn_GNerc_Typ> List)
		{			 FrEch_Conectn_To(List::add);   }
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default List<Conectn_GNerc_Typ> Get_Conectn_To()
			{	return                      Get_Conectng(B_Chekr());   }
}