package CC.ConstL;

import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
import		  org.jetbrains.annotations.NotNull;

import		  CC.$.Q$.Point$;
import static CC.List.FrEch.FrEch;
import static CC.ConstL.Util.MpT;
import		  CC.Encycloped.Abs.Scal.Physc.Colr.ShOn_Colr_Havr;
import		  CC.Util.NAm.NAm_Havr;
import		  java.util.List;
import		  java.util.ArrayList;
import		  java.util.Map;

public interface Parntd<Parnt_Typ extends Parntd>
		 extends NAm_Havr,
		   ShOn_Colr_Havr
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	List<Parnt_Typ> Get_Parntg();
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Ad_Parnt(Object SOrc)
		{
			List<Parnt_Typ> Parntg=Get_Parntg();
			Parntg.add(Gar_Parnt(SOrc));
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void Ad_Parntg(Object[] SOrcg)
			{
				for(Object SOrc:SOrcg)
				{Ad_Parnt(SOrc);}
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void FrEch_Parnt(Parnt_Typ Parnt,Point$<Parnt_Typ> Do)
		{FrEch(Get_Parntg(),Do);}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default boolean Is_Inheritd(Parnt_Typ Parnt)
		{
			return //FrEch_Parnt((AncStr)->{AncStr.FrEch_Parnt(,this);});
			false;
		}

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Inherit(@NotNull Parnt_Typ Parnt);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Inherit(Object Parnt)
		{Inherit(Gar_Parnt(Parnt));}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void Inherit(int TAk_Aftr,Object[] Parntg)
			{
				if(TAk_Aftr>-1)
				{Inherit(Parntg[TAk_Aftr]);}
			}

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	Map<String,Parnt_Typ> Get_Registry();
		@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
		Parnt_Typ Gar_Parnt(Object SOrc);
		/**Only noted use is, to shorten, in constructor.*/
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Registr()
		{Get_Registry().put(Get_NAm(),(Parnt_Typ)this);}

	abstract class Parntd_Imp<Parnt_Typ extends Parntd>
		   extends NAm_Havr_ConcrEt
		implements Parntd<Parnt_Typ>
	{
		@Finishd(Is_Finishd=true)
		private List<Parnt_Typ> Parntg=new ArrayList<>();
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final List<Parnt_Typ> Get_Parntg()
			{return Parntg;}

		/*The constructor forms for Parntd implementations:
		 *Requirements:
		 *	Ability for indefinite number of parents.
		 *		Therefore each constructor must have Parnt_Typ[].
		 *		Decided to place at end.
		 *	Ability to specify 1 that child takes after.
		 *		For purpose of engaging an inheritance mechanism,
		 *		which fills out fields, based on that parent.
		 *		Therefore their must be variants, for whether to do that.
		 *		Decided to use index in Parntg, before Parntg.
		 *	Name.
		 *Trivially, TAks_Aftr is always unnecessary where Parntg.length==0, as it must ==-1.*/
		@Finishd(Is_Finishd=true)
		public Parntd_Imp(@NotNull String NAm,
						  Object[] Parntg)
		{
			super(NAm);
			Ad_Parntg(Parntg);

			Registr();
		}
			@Finishd(Is_Finishd=true)
			public Parntd_Imp(String NAm)
			{this(NAm,MpT);}
			@Finishd(Is_Finishd=true)
			public Parntd_Imp(String NAm,
							  int TAk_Aftr,Object[] Parntg)
			{
				this(NAm,Parntg);
				Inherit(TAk_Aftr,Parntg);
			}
	}
}