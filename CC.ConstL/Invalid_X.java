package CC.ConstL;

import CC.COd.Finishd;
import CC.COd.Inheritd_Constructr;

@Finishd(Is_Finishd=true)
public class Invalid_X extends RuntimeException
{
	@Inheritd_Constructr(VRgfId=false)
	public Invalid_X(String MSg,Throwable Caus)
	{super(						 MSg,		   Caus);}
	@Inheritd_Constructr(VRgfId=false)
	public Invalid_X(String MSg)
	{super(						 MSg);}
	@Inheritd_Constructr(VRgfId=false)
	public Invalid_X(			 Throwable Caus)
	{super(									   Caus);}
	@Inheritd_Constructr(VRgfId=false)
	public Invalid_X(						   )
	{super(										   );}

	@Finishd(Is_Finishd=true)
	public static <Typ>Typ ThrO_Invalid(String Typ,Object Point)throws Invalid_X
	{	throw new Invalid_X("Invalid "+Typ+": "+Point);}
		@Finishd(Is_Finishd=true)
		public static <Typ>Typ ThrO_Invalid_SOrc(String Typ,Object SOrc)throws Invalid_X
		{	return ThrO_Invalid(Typ+" source",SOrc);}
}