package CC.ConstL.SOrc;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.Map;
import java.util.HashMap;
import static CC.ConstL.SOrc.Mod.Get_Mod;
import static CC.ConstL.SOrc.Java.Clas_Typ.Get_Clas_Typ;
import static CC.ConstL.SOrc.Java.Prim.Get_Prim;

@Finishd(Is_Finishd=false)
public class KEwrd
	 extends Regbl_Symbl
{
	@Finishd(Is_Finishd=true)
	public KEwrd(String Wrd)
	{	super(				Wrd);}

	@Finishd(Is_Finishd=true)
	public static final Map<String,Regbl_Symbl> Registry=new HashMap<>();
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public Map<String,Regbl_Symbl> Get_Registry()
		{	return Registry;}
			@Finishd(Is_Finishd=true)
			public static KEwrd Get_KEwrd(String TOkn)
			{
				return (Get_Mod		(TOkn) instanceof KEwrd Mod	 )?Mod:
					   (Get_Clas_Typ(TOkn) instanceof KEwrd Typ	 )?Typ:
					   (Get_Prim	(TOkn) instanceof KEwrd Prim )?Prim:
																   null;
			}

	static
	{
		try
		{	Class.forName("CC.ConstL.SOrc.Java.Setup_StAtmnt_Typ");}
		catch(ClassNotFoundException X)
		{	throw new RuntimeException(X);}
	}
}