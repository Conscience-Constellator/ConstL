package CC.ConstL.SOrc.Java;

/*Ubiq*/
/*Ubiq*/
import CC.COd.Finishd;
import CC.COd.Neds_Ovrid;
import CC.ConstL.SOrc.KEwrd;
import CC.ConstL.SOrc.Regbl_Symbl;

import java.util.HashMap;
import java.util.Map;

import static CC.COd.Neds_Ovrid.Ok;

@Finishd(Is_Finishd=true)
public class Prim
	 extends KEwrd
{
	@Finishd(Is_Finishd=true)
	public Prim(String TXt)
	{super(TXt);}

	@Finishd(Is_Finishd=true)
	public static final Map<String,Regbl_Symbl> Registry=new HashMap<>();
		@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public Map<String,Regbl_Symbl> Get_Registry()
		{return Registry;}
			@Finishd(Is_Finishd=true)
			public static Prim Get_Prim(String TXt)
			{return (Prim)Registry.get(TXt);}

	public static final Prim Void=new Prim("void"),
							 Bool=new Prim("boolean"),ChR=new Prim("char"),FlOt=new Prim("float"),Dubl=new Prim("double"),
							  Byt=new Prim("byte"), Short=new Prim("short"),Int=new Prim("int"),  Long=new Prim("long");
}