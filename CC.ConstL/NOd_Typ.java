package CC.ConstL;

import CC.COd.*;
import static CC.COd.Neds_Ovrid.*;

import static CC.Encycloped.Abs.Org.Syc.TXt.ContXt.Is_QOtd;
import static CC.Encycloped.Abs.Org.Syc.TXt.ContXt.PRs_LIn;
import static CC.Util.Fun.V.V;
import static CC.List.FrEch.FrEch;
import static CC.ConstL.Invalid_X.ThrO_Invalid_SOrc;
import CC.$.Q$.Point$;
import java.util.Map;
import java.util.HashMap;
import static CC.ConstL.Util.Hand_Me_Down;
import static CC.Encycloped.Abs.Org.Syc.TXt.Ling.Inherit;

public class	 NOd_Typ
	 extends Typ<NOd_Typ>
{
	//<editor-fold desc="Construct">
	@Inheritd_Constructr(VRgfId=false) @Finishd(Is_Finishd=true)
	public NOd_Typ(String	NAm,
				   Object	Material_SOrc,
				   String	ShAp,
				   Object[] PArntg)
	{super(NAm,Material_SOrc,ShAp,PArntg);}
		@Inheritd_Constructr(VRgfId=false) @Finishd(Is_Finishd=true)
		public NOd_Typ(String NAm,
					   Object Material_SOrc,
					   String ShAp)
		{super(NAm,Material_SOrc,ShAp);}

		//<editor-fold desc="Infr NAm↔Material">
		@Inheritd_Constructr(VRgfId=false) @Finishd(Is_Finishd=true)
		protected NOd_Typ(String   NAm,
						  String   ShAp,
						  Object[] PArntg)
		{super(NAm,ShAp);}
			@Inheritd_Constructr(VRgfId=false) @Nd_ArAls_Cuz_No_VRg @Finishd(Is_Finishd=true)
			protected NOd_Typ(String NAm,
							  String ShAp)
			{super(NAm,ShAp);}
		@Inheritd_Constructr(VRgfId=false) @Finishd(Is_Finishd=true)
		public NOd_Typ(Object	Material_SOrc,
					   String	ShAp,
					   Object[] PArntg)
		{super(Material_SOrc,ShAp,PArntg);}
			@Inheritd_Constructr(VRgfId=false) @Nd_ArAls_Cuz_No_VRg @Finishd(Is_Finishd=true)
			public NOd_Typ(Object Material_SOrc,
						   String ShAp)
			{super(Material_SOrc,ShAp);}
		//</editor-fold>

		@Inheritd_Constructr(VRgfId=false) @Finishd(Is_Finishd=true)
		public NOd_Typ(String NAm,
			int TAk_Aftr,Object[] PArntg)
		{super(NAm,TAk_Aftr,PArntg);}
	//</editor-fold>

	//<editor-fold desc="Gar">
	@Finishd(Is_Finishd=true)
	public static final Map<String,NOd_Typ> Registry=new HashMap<>();
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public Map<String,NOd_Typ> Get_Registry()
		{return Registry;}
		public static NOd_Typ Reg_NOd_Typ(NOd_Typ Typ)
		{
			Registry.put(Typ.Get_NAm(),Typ);
			return Typ;
		}
		public static NOd_Typ Reg_NOd_Typ(String NAm,
			Material Material,String ShAp)
		{return Reg_NOd_Typ(new NOd_Typ(NAm,Material,ShAp));}
			public static NOd_Typ Reg_NOd_Typ(Object[] MEt,String ShAp)
			{return Reg_NOd_Typ((String)MEt[0],(Material)MEt[1],ShAp);}
				public static NOd_Typ Reg_NOd_Typ(Object MEt,String ShAp)
				{return Reg_NOd_Typ(Get_MEt(MEt),ShAp);}
		@Finishd(Is_Finishd=true)
		public static NOd_Typ Get_Typ(String NAm)
		{
			NOd_Typ Typ=Registry.get(NAm);

			return (Typ!=null)?Typ:
							   ThrO_Invalid_SOrc("NOd_Typ",NAm);
		}
			@Alias @Finishd(Is_Finishd=true)
			public static NOd_Typ Get_NOd_Typ(String ID)
			{return Get_Typ(ID);}
		@Finishd(Is_Finishd=true)
		public static NOd_Typ Get_Typ_QOtd(String NAm)
		{	return            Get_NOd_Typ(PRs_LIn(NAm));   }
			@Alias @Finishd(Is_Finishd=true)
			public static NOd_Typ Get_NOd_Typ_QOtd(String ID)
			{	return Get_Typ_QOtd(ID);   }
		@Finishd(Is_Finishd=true)
		public static NOd_Typ Get_Typ(String ID,NOd DOnr)
		{
			return (ID.equals(Inherit))?(NOd_Typ)DOnr.Get_Typ(  ):
										 Gar_NOd_Typ(ID);
		}
			@Alias @Finishd(Is_Finishd=true)
			public static NOd_Typ Get_NOd_Typ(String NAm,NOd DOnr)
			{	return Get_Typ(NAm,DOnr);	}
		@Finishd(Is_Finishd=true)
		public static NOd_Typ Get_Typ(String ID,NOd Parnt,NOd Old_Sibling)
		{
			return (ID.equals(Hand_Me_Down))?(NOd_Typ)Old_Sibling.Get_Typ(		 ):
														 Get_Typ(ID,Parnt);
		}
			@Alias @Finishd(Is_Finishd=true)
			public static NOd_Typ Get_NOd_Typ(String ID,NOd Parnt,NOd Old_Sibling)
			{	return Get_Typ(ID,Parnt,Old_Sibling);	}
		@Alias @Finishd(Is_Finishd=true)
		public static NOd_Typ Get_Typ_PRsd(String ID,NOd Parnt,NOd Old_Sibling)
		{
			return (Is_QOtd(ID))?Get_Typ_QOtd(ID):
								 Get_Typ	 (ID,Parnt,Old_Sibling);
		}
			public static NOd_Typ Get_NOd_Typ_PRsd(String ID,NOd Parnt,NOd Old_Sibling)
			{	return Get_Typ_PRsd(ID,Parnt,Old_Sibling);	 }
		@Finishd(Is_Finishd=true)
		public static NOd_Typ Gar_Typ(Object SOrc)
		{
			return (SOrc instanceof NOd_Typ Typ)?		 Typ	:
				   (SOrc instanceof String  ID )?Get_NOd_Typ(ID):
				   (SOrc instanceof NOd		NOd)?(NOd_Typ)NOd.Get_Typ():
						 ThrO_Invalid_SOrc("NOd_Typ",SOrc);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public NOd_Typ Gar_Parnt(Object SOrc)
		{return Gar_Typ(SOrc);}
			@Alias @Finishd(Is_Finishd=true)
			public static final NOd_Typ Gar_NOd_Typ(Object SOrc)
			{return Gar_Typ(SOrc);}
		static
		{
			new NOd_Typ("NOd","NOd","Crcl");
				new NOd_Typ(  "Web_NOd",0,V("NOd"));
				new NOd_Typ("Bi_NOd",0,V("NOd"));
				new NOd_Typ("Bilat_NOd",0,V("NOd"));
					new NOd_Typ(  "Lin_NOd",0,V("Bilat_NOd"));
					new NOd_Typ(  "TrE_NOd",0,V("Bilat_NOd"));
					new NOd_Typ("Rootd_NOd",0,V("Bilat_NOd"));

			new NOd_Typ("Philosophy","Philosophy","Crcl");

			new NOd_Typ("Thout","Thout","Crcl");
				new NOd_Typ("TXt_BoD","TXt_BoD","Crcl",V("Thout"));
				new NOd_Typ("Abreviatn","Abreviatn","Crcl",V("TXt_BoD"));

			new NOd_Typ("Typ","Typ","Crcl");

			new NOd_Typ("DOF","DOF","Crcl");
				new NOd_Typ("PODOF","PODOF","Crcl");
				new NOd_Typ("Mul_PODOF","Mul_PODOF","Crcl");
				new NOd_Typ("SpAc","SpAc","Crcl");

			new NOd_Typ("FEld","FEld","Crcl");

			new NOd_Typ("IntrfAc","IntrfAc","Crcl");
				new NOd_Typ("Rsult_Tabl","Rsult_Tabl","Crcl");
				new NOd_Typ("!_PAr","!_PAr","Crcl");

			new NOd_Typ("Ncycloped","Ncycloped","Crcl");

			new NOd_Typ("RAtng","RAtng","Crcl");

			//<editor-fold desc="COd">
			new NOd_Typ("COd_ComNt","COd_ComNt","Crcl");
			new NOd_Typ("COd_Functn","COd_Functn","Crcl");
				new NOd_Typ("COd_StAtmnt","COd_StAtmnt","Crcl",V("COd_Functn"));
				new NOd_Typ("COd_Blok","COd_Blok","Crcl",V("COd_Functn"));
				new NOd_Typ("Modul_Functn","Modul_Functn","Crcl",V("COd_Functn"));
				new NOd_Typ("Method","Method","Crcl",V("COd_Functn"));
					new NOd_Typ("Inst_Method","Inst_Method","Crcl",V("Method"));
						new NOd_Typ("Method_Abs","Method_Abs","Crcl",V("Inst_Method"));
					new NOd_Typ("Stat_Method","Stat_Method","Crcl",V("Method"));
				new NOd_Typ("Constructr","Constructr","Crcl",V("COd_Functn"));

			new NOd_Typ("COd_Pakg","COd_Pakg","Crcl");

			new NOd_Typ("COd_Modul","COd_Modul","Crcl");

			new NOd_Typ("Program","Program","Crcl");
			new NOd_Typ("Programng_Lang","Programng_Lang","Crcl");
			new NOd_Typ("XtNsn","XtNsn","Crcl");
			new NOd_Typ("Mod","Mod","Crcl");
				new NOd_Typ("Mod_Lin","Mod_Lin","Crcl");

			new NOd_Typ("COd_Typ","COd_Typ","Crcl");
				new NOd_Typ("Prim_Typ","Prim_Typ","Crcl");
				new NOd_Typ("COd_Clas","COd_Clas","Crcl");
				new NOd_Typ("GNerc","GNerc","Crcl");
					new NOd_Typ("GNerc_StRt","GNerc_StRt","Crcl");
					new NOd_Typ("GNerc_Nd","GNerc_Nd","Crcl");

			new NOd_Typ("Java_Clas","Java_Clas","Crcl");
				new NOd_Typ("Java_Clas_Abs","Java_Clas_Abs","Crcl");
				new NOd_Typ("Java_Clas_FInl","Java_Clas_FInl","Crcl");
				new NOd_Typ("Java_Xeptn","Java_Xeptn","Crcl");
				new NOd_Typ("Java_IntrfAc","Java_IntrfAc","Crcl");
					new NOd_Typ("Java_AnOt","Java_AnOt","Crcl");
				new NOd_Typ("Java_Enum","Java_Enum","Crcl");
				new NOd_Typ("Java_Rcrd","Java_Rcrd","Crcl");
			new NOd_Typ("Python_Clas",0,V("COd_Clas"));
			new NOd_Typ("JS_Clas",0,V("COd_Clas"));
			new NOd_Typ("JS_Modul","JS_Modul","Crcl");

			new NOd_Typ("HTML_Tag","HTML_Tag","Crcl");
			new NOd_Typ("HTML_Doc","HTML_Doc","Crcl");
			//</editor-fold>

			new NOd_Typ("FIl_NOd","FIl_Structr","Crcl");
				new NOd_Typ("FIl","FIl","Crcl",V("FIl_NOd"));
					new NOd_Typ("FIl_Pakd","FIl_Pakd","Crcl",V("FIl"));
				new NOd_Typ("FOl","FOl","Crcl",V("FIl_NOd"));
					new NOd_Typ("StOrg_DvIc","StOrg_DvIc","Crcl",V("FOl"));
					new NOd_Typ("Map_FIl","Map_FIl","Crcl",V("FIl"));
					new NOd_Typ("TXt_FIl","TXt_FIl","Crcl",V("FIl"));

			new NOd_Typ("AI_GN","AI_GN","Crcl");
				new NOd_Typ("Img_GN+Prompt","Img_GN+Prompt","Crcl",V("AI_GN"));
				new NOd_Typ("Img_GN+URL","Img_GN+URL","Crcl",V("AI_GN"));
				new NOd_Typ("Img_GN+Data","Img_GN+Data","Crcl",V("AI_GN"));

			new NOd_Typ("WebsIt","WebsIt","Crcl");
				new NOd_Typ("Auxilry_SIt","Auxilry_SIt","Crcl",V("WebsIt"));

			new NOd_Typ("Son","Son","Crcl");
				new NOd_Typ("PhonEm","PhonEm","Crcl",V("Son"));

			new NOd_Typ("Todo","Todo","Crcl");
			new NOd_Typ("Don","Don","Crcl");
			new NOd_Typ("Ongong","Ongong","Crcl");
			new NOd_Typ("Do_Upon","Do_Upon","Crcl");
			new NOd_Typ("Plan","Plan","Crcl");

			new NOd_Typ("TSt0","TSt0","Crcl");
			new NOd_Typ("TSt1","TSt1","Crcl");
			new NOd_Typ("TSt2","TSt2","Crcl");
			new NOd_Typ("TSt3","TSt3","Crcl");
			new NOd_Typ("Shufl","Shufl","Crcl");
		}
		@Finishd(Is_Finishd=true)
		public static void FrEch_NOd_Typ(Point$<NOd_Typ> Do)
		{FrEch(Registry.values(),Do);}
	//</editor-fold>
}