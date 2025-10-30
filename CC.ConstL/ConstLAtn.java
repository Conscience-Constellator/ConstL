package CC.ConstL;

import CC.COd.Alias;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q$Q.Point1$1;
import static CC.ConstL.Invalid_X.ThrO_Invalid_SOrc;
import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.QOt;
import static CC.Encycloped.TIm.TIm_Util.At_Crnt_TIm;
import static CC.List.Map_Util.ContAns_Tru;
import static CC.Util.Prim.Point_Havr.Gar_Point1$1;
import static CC.ConstL.NOd.Is_Valid_ID;
import static CC.ConstL.Conectn_Typ.Infr_Conectn_Typ;
import static CC.List.FrEch.FrEch;
import static CC.List.FrEch.Filtr;
import static CC.List.Map_Util.Mov_Ntry;
import java.util.*;
import CC.$.Q$.Point$;
import CC.$.Q$Q.Point$Bool;
import static CC.List.List_X.Get_Th_Item;
import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.Get_ContAnrg;
import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.Get_Hitg;

import static java.lang.System.out;

public interface ConstLAtn<NOd_GN_Typ extends NOd,Conectn_GN_Typ extends Conectn>
		 extends ConstL_PArnt<NOd_GN_Typ>,Conectng_Havr<NOd_GN_Typ,Conectn_GN_Typ>
{
	// <editor-fold desc="DpNdNC">
	/*In order to have A functioning dependency system,
	  constellations must retain dependencies from file, in order to save them.*/
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	List<String        >    Get_DpNdNCg();
	Map <String,Boolean> Get_Is_DpNdNC_LOdd_Flagg();
		@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
		default boolean Is_DpNdNC_LOdd(String DpNdNC)
		{	return ContAns_Tru(Get_Is_DpNdNC_LOdd_Flagg(),DpNdNC);   }
	//</editor-fold desc="DpNdNC">

	//<editor-fold desc="NOd">
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default Map<String,NOd_Typ> Get_NOd_Typg()
	{return NOd_Typ.Registry;}
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	Map<String,NOd_GN_Typ> Get_NOdg();
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default List<NOd_GN_Typ> Get_Childrn()
	{
		List<NOd_GN_Typ> Childrn=new ArrayList<>();
		for( NOd_GN_Typ DsNdnt:Get_NOdg().values())
		{
			if(             DsNdnt.Get_ConstL_PArnt()==null)
			{	Childrn.add(DsNdnt);   }
		}

		return  Childrn;
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default boolean Has_NOd(String ID)
		{return Get_NOd(ID)!=null;}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default NOd_GN_Typ Get_NOd(String ID)
		{return Get_NOdg().get(ID);}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default NOd_GN_Typ Gar_NOd(String ID)
			{
				return (Get_NOdg().get(ID) instanceof NOd NOd)?(NOd_GN_Typ)NOd:
															   ThrO_Invalid_SOrc("node",ID)
				;
			}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default void Find_NOdg(String For,Collection<NOd_GN_Typ> Rsult)
			{
				Map<String,NOd_GN_Typ> NOdg=Get_NOdg();
				NOd_GN_Typ NOd=NOdg.get(For);
				if(NOd!=null)
				{
					Rsult.add(NOd);
				}
				else
				{
					Set	<String> IDg=NOdg.keySet();
					Get_Hitg(NOdg,IDg,For,Rsult);
				}
			}
				@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
				default List<NOd_GN_Typ> Find_NOdg(String For)
				{
					ArrayList<NOd_GN_Typ> Rsult=new ArrayList<>();

					Find_NOdg(For,Rsult);

					return Rsult;
				}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default NOd_GN_Typ SEk_Th_NOd(String ID)
			{return Get_Th_Item(Find_NOdg(ID));}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default boolean Print_Is_Presnt(String ID)
		{
			boolean                     Is=Get_NOdg().containsKey(ID);

			out.println(ID+" present: "+Is);
			return                      Is;
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default boolean Print_Is_Presnt(     Point1$1<String,String> SOrc)
			{	return      Print_Is_Presnt(SOrc.Point1$1(""));   }

			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default NOd_GN_Typ Gar_NOd(Object SOrc)
			{
				if(SOrc instanceof NOd NOd){return (NOd_GN_Typ)NOd;}
				if(SOrc instanceof String)
				{
					NOd_GN_Typ NOd=Get_NOdg().get(SOrc);
					if(NOd!=null)
					{return NOd;}
					else
					{throw new RuntimeException("No node of ID "+QOt(SOrc));}
				}
				throw new RuntimeException("Invalid node source: "+QOt(SOrc));
			}

		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default NOd_GN_Typ RplAc_NOd(Object Old_SOrc,NOd_GN_Typ New)
		{
			NOd_GN_Typ Old=Gar_NOd(Old_SOrc);
			FrEch_Conectn((Conectn)->
						  {Conectn.RplAc_NOd(Old,New);});

			return New;
		}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default boolean Anounc_Reg_NOd()
		{return false;}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default NOd_GN_Typ Reg_NOd(NOd_GN_Typ NOd)
		{
			Map<String,NOd_GN_Typ> NOdg=Get_NOdg();
			String ID=NOd.Get_ID();
			if(Is_Valid_ID(ID))
			{
				if(NOdg.containsKey(ID))
				{RplAc_NOd(ID,NOd);}
				else
				{NOdg.put(ID,NOd);}

				if(Anounc_Reg_NOd())
				{out.println("Registered node: "+NOd);}
			}
			return NOd;
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
			default NOd_GN_Typ Reg_Child(NOd PArnt)
			{	return   Reg_NOd((NOd_GN_Typ)PArnt.MAk_ConstL_Child());   }
				@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
				default NOd_GN_Typ ApNd_Child(NOd PArnt)
				{
					NOd_GN_Typ Child=Reg_Child(PArnt.MAk_ConstL_Child());
					Reg_Conectn("Conectn",PArnt                         ,Child);
					Reg_Conectn("Conectn",PArnt.Get_ConstL_Senior(Child),Child);

					return     Child;
				}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Disconect_NOd(NOd_GN_Typ NOd)
		{
			FrEch_Conectn((Conectn)->
						  {
							  if(               Conectn.Involvs(NOd))
							  {   Unreg_Conectn(Conectn);   }
						  });
		}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Unreg_NOd(NOd_GN_Typ NOd)
		{
			Disconect_NOd(NOd);
			if(NOd.Get_ConstL_PArnt() instanceof NOd Parnt)
			{	Parnt.Rmov_ConstL_Child(NOd);   }
			Get_NOdg().remove(NOd.Get_ID());
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Rtyp_NOd(Object NOd_SOrc,
							  Object  To_SOrc)
		{Gar_NOd(NOd_SOrc).Set_Typ(To_SOrc);}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void Rtyp_NOd(Object				  NOd_SOrc,
								  Point1$1<String,String>  To_SOrc)
			{
					 NOd_GN_Typ NOd=Gar_NOd(NOd_SOrc);
				Rtyp_NOd(NOd,To_SOrc.Point1$1(NOd.Get_Typ().Get_NAm()));
			}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void RnAm_NOd(Object NOd_SOrc,
							  String To)
		{
			NOd_GN_Typ NOd=Gar_NOd(NOd_SOrc);
			String From= NOd.Get_ID();
						 NOd.UpdAt_NAm(To);
			Mov_Ntry(Get_NOdg(),
					From,NOd.Get_ID());
		}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default void RnAm_NOd(Object NOd_SOrc,
								  Point1$1<String,String> To_SOrc)
			{
				NOd_GN_Typ NOd=Gar_NOd(NOd_SOrc);
				RnAm_NOd(NOd,To_SOrc.Point1$1(NOd.Get_NAm()));
			}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Set_NOd_DisplA(Object NOd_SOrc,
									String To)
		{Gar_NOd(NOd_SOrc).Set_DisplAd_NAm(To);}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default void Set_NOd_DisplA(Object NOd_SOrc,
					    Point1$1<String,String> To_SOrc)
			{
					NOd_GN_Typ NOd=Gar_NOd(NOd_SOrc);
				Set_NOd_DisplA(NOd,To_SOrc.Point1$1(NOd.Get_DisplAd_NAm()));
			}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Set_NOd_NAm_Al_DisplA(Object NOd_SOrc,
										   String To)
		{Gar_NOd(NOd_SOrc).Set_NAm_Al_DisplAd(To);}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default void Set_NOd_NAm_Al_DisplA(Object NOd_SOrc,
											   Point1$1<String,String> To_SOrc)
			{
					NOd_GN_Typ NOd=Gar_NOd(NOd_SOrc);
				Set_NOd_NAm_Al_DisplA(NOd_SOrc,To_SOrc.Point1$1(NOd.Get_NAm()));
			}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void FrEch_NOd(Point$<NOd_GN_Typ> Do,Point$Bool<NOd_GN_Typ> Filtr)
		{FrEch(Get_Childrn(),Do,Filtr);}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default void FrEch_NOd(Point$<NOd_GN_Typ> Do)
			{FrEch(Get_Childrn(),Do);}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void FrEch_Orphn(Point$<NOd_GN_Typ> Do,Point$Bool<NOd_GN_Typ> Filtr)
		{	FrEch_Child(                      Do,                 Filtr);   }
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default void FrEch_Orphn(Point$<NOd_GN_Typ> Do)
			{			 FrEch_Child(             Do);}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default List<NOd_GN_Typ> Get_Orphng()
		{	return         Get_Childrn();}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default List<NOd_GN_Typ> Get_Orphng(Point$Bool<NOd_GN_Typ> Filtr)
			{	return         Get_Childrn();}
	//</editor-fold>
	//<editor-fold desc="Conectn">
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default Map<String,Conectn_Typ> Get_Conectn_Typg()
	{return Conectn_Typ.Registry;}
//		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
//		default Conectn Get_Conectn(String ID)
//		{return Get_Conectng().get(ID);}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default Conectn_GN_Typ Get_Th_Conectn(Object A_SOrc,Object B_SOrc)
		{
			return (Gar_NOd(A_SOrc) instanceof NOd_GN_Typ A&&
					Gar_NOd(B_SOrc) instanceof NOd_GN_Typ B)?Get_Th_Conectn(A,B):
													  null;
		}

		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default boolean Anounc_Reg_Conectn()
		{	return false;   }
		@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
		Conectn_GN_Typ MAk_Conectn(Object Typ_SOrc,Object A_SOrc,Object B_SOrc);
			@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
			default Conectn_GN_Typ MAk_Conectn(Object Typ_SOrc,Object A_SOrc,Object B_SOrc,boolean Rvrs)
			{
				return (Rvrs)?MAk_Conectn(Typ_SOrc,B_SOrc,A_SOrc):
							  MAk_Conectn(Typ_SOrc,A_SOrc,B_SOrc);
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default Conectn_GN_Typ Reg_Conectn(Conectn_GN_Typ Conectn)
		{
			Get_Conectng().add(Conectn);

			if(Anounc_Reg_Conectn())
			{	out.println("Registered connection: "+Conectn);   }
			return Conectn;
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default Conectn_GN_Typ Reg_Conectn(Object Typ_SOrc,
										 Object   A_SOrc,Object B_SOrc)
			{return Reg_Conectn(MAk_Conectn(Typ_SOrc,A_SOrc,B_SOrc));}
				@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
				default void Conect(List<?> Conectn_SOrcg,
									NOd_GN_Typ A,NOd_GN_Typ B)
				{
					FrEch(Conectn_SOrcg,(Conectn)->
										{   Reg_Conectn(Conectn,A,B);   });
				}
				@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
				default Conectn_GN_Typ Reg_Conectn(Object A_SOrc,Object B_SOrc)
				{return Reg_Conectn(Infr_Conectn_Typ(A_SOrc,B_SOrc),A_SOrc,B_SOrc);}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default Conectn_GN_Typ Reg_Drd_Conectn(Object Typ_SOrc,
											 Object   A_SOrc,Object B_SOrc,boolean Rvrs)
			{return Reg_Conectn(MAk_Conectn(Typ_SOrc,A_SOrc,B_SOrc,Rvrs));}
				@Lin_DclAr @Alias @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
				default Conectn_GN_Typ Reg_Conectn(Object Typ_SOrc,
											 Object   A_SOrc,Object B_SOrc,boolean Rvrs)
				{return Reg_Drd_Conectn(Typ_SOrc,A_SOrc,B_SOrc,Rvrs);}
					@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
					default void Reg_Drd_Conectng(Object A_SOrc,           Object B_SOrc,
									   List<Conectn_Typ> Typg  ,List<Boolean    > Drg   )
					{
						for(int IndX1 =0;
								IndX1 <Typg.size();
								IndX1+=1)
						{
							Reg_Drd_Conectn(Typg.get(IndX1),A_SOrc,B_SOrc,
											 Drg.get(IndX1));
						}
						Typg.clear();
						 Drg.clear();
					}

				@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
				default void Conect(List<?> Conectn_SOrcg,
									NOd_GN_Typ A,NOd_GN_Typ B,boolean Rvrs)
				{
					FrEch(Conectn_SOrcg,(Conectn)->
										{Reg_Conectn(Conectn,A,B);});
				}
				@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
				default Conectn_GN_Typ Reg_Drd_Conectn(Object A_SOrc,Object B_SOrc,boolean Rvrs)
				{return Reg_Conectn(Infr_Conectn_Typ(A_SOrc,B_SOrc),A_SOrc,B_SOrc,Rvrs);}
					@Lin_DclAr @Alias @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
					default Conectn_GN_Typ Reg_Conectn(Object A_SOrc,Object B_SOrc,boolean Rvrs)
					{return Reg_Drd_Conectn(A_SOrc,B_SOrc,Rvrs);}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Unreg_Conectn(Conectn_GN_Typ Conectn)
		{
			Get_Conectng().remove(Conectn);
								  Conectn.Dtach();
		}
	//</editor-fold>
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
	default void CoP_Branch(NOd_GN_Typ StM,String To)
	{
		;
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
	default void Graft(NOd_GN_Typ StM)
	{
		;
	}

	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default String[] Get_Com_List()
	{	return new String[]{"NOd","Conectn"};   }
//	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
//	public void Get_Com_List(String Typ);

	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default ConstL_Object Gar_ConstL_Object(Object SOrc)
	{
		try
		{return Gar_NOd(SOrc);}
		catch(RuntimeException X)
		{
			try
			{return Gar_Conectn(SOrc);}
			catch(RuntimeException X2)
			{throw new RuntimeException("Invalid constellation object source: "+SOrc,X2);}
		}
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default <Typ_Typ extends Typ>void Rtyp(Object Object_SOrc,
										   Object     To_SOrc)
	{
		ConstL_Object<Typ_Typ> Object=Gar_ConstL_Object(Object_SOrc);
		Object.Set_Typ(Gar_Point1$1(To_SOrc).Point1$1(
		Object.Get_Typ()));
	}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Rtyp_Thru(Object Object_SOrc,
			  Point1$1<String,String>	  To_SOrc,
							   String Init)
		{
			Rtyp(Object_SOrc,(Point1$1<Typ<?>,String>)(Typ)->
							 {return To_SOrc.Point1$1(Init);});
		}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Rtyp_Thru(Object Object_SOrc,
			  Point1$1<String,String>	  To_SOrc)
		{
			Rtyp(Object_SOrc,(Point1$1<Typ<?>,String>)(Typ)->
							 {return To_SOrc.Point1$1(Typ.Get_NAm());});
		}

	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void AlienAt()
	{
		Point$<?>                             AlienAt=(Point$<ConstL_Object>)(Object)->{   Object.Set_Is_NAtv(false);   };
		FrEch_DsNdnt ((Point$<    NOd_GN_Typ>)AlienAt);
		FrEch_Conectn((Point$<Conectn_GN_Typ>)AlienAt);
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void MpT()
	{
		Get_DpNdNCg             ().clear();
		Get_Is_DpNdNC_LOdd_Flagg().clear();
		Get_NOdg                ().clear();
		Get_Conectng            ().clear();
	}

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Stringfy_Graph(StringBuilder Bildr);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default String Stringfy_Graph()
		{
			StringBuilder  Bildr=new StringBuilder();

			Stringfy_Graph(Bildr);

			return Bildr.toString();
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default	   String	 Print_Graph()
		{
			String String=Stringfy_Graph();

			out.println(String);
			return String;
		}

	//<editor-fold desc="FIl">
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	String Get_FIl();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void   Set_FIl  (String URL);
	Map<String,String> Bakup=new HashMap<>();
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default
	String Get_Bakup(String URL)
	{	return Bakup.get(URL);   }
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default
	void   Set_Bakup(String URL,String Bakup_URL)
	{		   Bakup.put(URL,Bakup_URL);   }
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void   Init_SAv(String URL)
	{out.println("Constellation saving to "+QOt(URL)+' '+At_Crnt_TIm()+"...");}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void FInlIz_SAv(String URL)
	{out.println("Constellation saved "+At_Crnt_TIm()+'.');}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void   Init_LOd(String URL)
	{	out.println("Constellation loading from "+QOt(URL)+' '+At_Crnt_TIm()+"...");   }
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void FInlIz_LOd(String URL)
	{	out.println("Constellation loaded "                   +At_Crnt_TIm()+'.'  );   }
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void  SAv_Graph(String URL);
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default
	void RsAv_ConstL()
	{	SAv_Graph(Get_FIl());   }
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default
	void Bakup_ConstL()
	{	SAv_Graph(Get_Bakup(Get_FIl()));   }
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Ad_ConstL(String URL);
	@Lin_DclAr @Neds_Ovrid(NEds=Ok ) @Finishd(Is_Finishd=true)
	default void LOd_Graph(String URL)
	{
		MpT();

		Ad_ConstL(URL);
	}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default ConstLAtn<NOd_GN_Typ,Conectn_GN_Typ> LOd_New_Graph(String URL)
		{
			ConstLAtn<NOd_GN_Typ,Conectn_GN_Typ> New=New_ConstLAtn();
									 New.Set_FIl(
										 Get_FIl());
									 New. LOd_Graph(URL);

			return                   New;
		}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void RlOd_ConstL()
	{	LOd_Graph(Get_FIl());   }
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default ConstLAtn<NOd_GN_Typ,Conectn_GN_Typ> RlOd_New_Graph()
		{
			ConstLAtn<NOd_GN_Typ,Conectn_GN_Typ> New=New_ConstLAtn();
									 New.Set_FIl(
										 Get_FIl());
									 New.RlOd_ConstL();

			return                   New;
		}
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	boolean MAntAn_SL_Thru_LOd();
	//</editor-fold>

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	ConstLAtn<NOd_GN_Typ,Conectn_GN_Typ> New_ConstLAtn();
}