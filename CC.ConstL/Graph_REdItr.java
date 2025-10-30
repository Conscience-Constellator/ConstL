package CC.ConstL;

/*Ubiq*/
import CC.COd.Alias;
import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import static CC.Util.Fun.V.V;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public interface Graph_REdItr<ConstLAtn_Typ extends ConstLAtn<NOd_,Conectn_>,
							  NOd_ extends NOd,Conectn_ extends Conectn>
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	String Stringfy_Graph(ConstLAtn_Typ Editr,StringBuilder To);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default String Stringfy_Graph(ConstLAtn_Typ Editr)
		{
			StringBuilder To=new StringBuilder();

			Stringfy_Graph(Editr,To);

			return To.toString();
		}
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void SAv_Graph(ConstLAtn_Typ Editr,String URL);
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void LOd_Graph(ConstLAtn_Typ Editr,String URL);

	class REdIt_ContXt<ConstLAtn_Typ extends ConstLAtn<NOd_GN_Typ,Conectn_GN_Typ>,
					   NOd_GN_Typ extends NOd,Conectn_GN_Typ extends Conectn>
	{
		@Finishd(Is_Finishd=true)
		public ConstLAtn_Typ ConstL;
			public void Set_ConstL(ConstLAtn_Typ Editr)
			{
				this.ConstL=Editr;
				Set_Conectng1(Editr.Get_Conectng());
			}

		public NOd_GN_Typ ConstL_PArnt,
					   Gom_PArnt,
					 Old_Sibling;
		public List<Conectn_GN_Typ> ConstL_GPArnt$PArnt,
								 Gom_GPArnt$PArnt,
							   ConstL_PArnt$Old_Sibling,
								  Gom_PArnt$Old_Sibling,
							  Conectng1,
							  Conectng2;
			public List<Conectn_GN_Typ> Get_Conectng1()
			{return Conectng1;}
			public List<Conectn_GN_Typ> Get_Conectng2()
			{return Conectng2;}
			public void Set_Conectng1(List<Conectn_GN_Typ> Conectng)
			{this.Conectng1=new ArrayList<>(Conectng);}
			public void Set_Conectng2(List<Conectn_GN_Typ> Conectng)
			{this.Conectng2=new ArrayList<>(Conectng);}
		public List<Conectn_Typ> ConstL_Conectn_Typg=new ArrayList<>(),
									Gom_Conectn_Typg=new ArrayList<>();
		public List<Boolean    > ConstL_Conectn_Drg =new ArrayList<>(),
									Gom_Conectn_Drg =new ArrayList<>();
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			public void Conectng()
			{
				ConstL_Conectn_Typg.clear();
				ConstL_Conectn_Drg .clear();
			}
		public Map<String,String>   Gom_TrE=new HashMap<>();
		public List<Object[]> Post_Conectng=new ArrayList<>();
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			public void Ad_Post_Conectn(Object[] Conectn)
			{	Post_Conectng.add(Conectn);   }
				@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
				public void Ad_Post_Conectn(Object Typ_SOrc,Object A_SOrc,Object B_SOrc)
				{	Ad_Post_Conectn(V(Typ_SOrc,A_SOrc,B_SOrc));   }
					@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
					public void Ad_Post_Drd_Conectn(Object Typ_SOrc,Object A_SOrc,Object B_SOrc,boolean Rvrs)
					{
						Post_Conectng.add((Rvrs)?V(Typ_SOrc,B_SOrc,A_SOrc):
												 V(Typ_SOrc,A_SOrc,B_SOrc));
					}
						@Lin_DclAr @Alias @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
						public void Reg_Post_Conectn(Object Typ_SOrc,Object A_SOrc,Object B_SOrc,boolean Rvrs)
						{Ad_Post_Drd_Conectn(Typ_SOrc,A_SOrc,B_SOrc,Rvrs);}
							@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
							public void Reg_Drd_Conectng(Object A_SOrc,           Object B_SOrc,
											  List<Conectn_Typ> Typg  ,List<Boolean    > Drg   )
							{
								for(int IndX1 =0;
										IndX1 <Typg.size();
										IndX1+=1)
								{
									Ad_Post_Drd_Conectn(Typg.get(IndX1),A_SOrc,B_SOrc,
														 Drg.get(IndX1));
								}
								Typg.clear();
								 Drg.clear();
							}


		public REdIt_ContXt(ConstLAtn_Typ ConstL)
		{Set_ConstL(ConstL);}
	}
}