package CC.ConstL.SOrc;

/*Ubiq*/
import CC.$.Q$Q.Point1$1;
import		  CC.COd.Finishd;

import java.util.List;
import CC.ConstL.SOrc.Java.Clas_Hedr;
import CC.ConstL.SOrc.Java.Clas_Typ;
import CC.ConstL.SOrc.Java.Method_Hedr;
import CC.List.Sub.Enum_Stikfier;
import CC.List.Sub.List_REdr_To;
import CC.Encycloped.Abs.Org.Syc.TXt.TOkn.PRsd_Object;
import CC.List.Sub.List_SegmNtr.Bound_SegmNt_REdr;
import CC.List.Sub.N$N_REdr;

import static CC.ConstL.SOrc.Java.Clas_Typ.IntrfAc;
import static CC.ConstL.SOrc.Java.Clas_Typ.Rcrd;
import static CC.List.Sub.Enum_Stikfier.*;

public class Abs_StAtmnt<		  Nd_Typ extends Nd>
	 extends	 StAtmnt<Abs_StRt,Nd_Typ>
{
	@Override
	public List_REdr_To<PRsd_Object,PRsd_Object> Get_PRsr()
	{
		return (From,IndX,Nd,To)->
			   {
				   int LNg=From.size();
				   if(LNg<2)
				   {
					   if(LNg==0)
					   {return IndX;}
					   
					   throw new RuntimeException("Requires !<2 items, has "+LNg);
				   }
				   To.add(new Abs_StRt(From.subList(IndX,Nd-1)));
				   To.add(			   From.	get(	 Nd	 ));

				   return IndX;
			   };
	}

	@Finishd(Is_Finishd=true)
	public List<PRsd_Object> MEt;

	public static Bound_SegmNt_REdr<PRsd_Object,PRsd_Object> StAtmNtfier=new Enum_Stikfier<PRsd_Object>((Object)->
																		 {
																			 return (Object instanceof Nd)?Stik_BfOr:
																								   Standrd_Stik;
																		 }).
																		 Clumpr((StRNd)->
																		 {
																			 return new Abs_StAtmnt<>((Abs_StRt)StRNd.get(0),
																											(Nd)StRNd.get(1));
																		 });

	@Finishd(Is_Finishd=true)
	public Abs_StAtmnt(Abs_StRt StRt,Nd_Typ Nd)
	{	super(StRt,Nd);	  }

	public static <StRt_Typ>StRt ConcrEtIz_StRt(Abs_StRt StRt)
	{
		List<PRsd_Object> REgn=StRt.Get_REgn();
			 if(REgn.contains(Clas_Typ.Clas)||
				REgn.contains(IntrfAc)||
				REgn.contains(Clas_Typ.Enum)||
				REgn.contains(Rcrd))
		{	return new Method_Hedr(StRt);	}
		else if(REgn.contains(Clas_Typ.Clas)||
				REgn.contains(IntrfAc)||
				REgn.contains(Clas_Typ.Enum)||
				REgn.contains(Rcrd))
		{	return new Clas_Hedr(StRt);	  }
		else
		{	throw new RuntimeException("Unconcretizable start: "+StRt);	  }
	}
		public static final List_REdr_To<PRsd_Object,PRsd_Object> StAtmNt_ConcrEtIzr=new N$N_REdr<>((Abs)->
																									{	return Abs_StAtmnt.ConcrEtIz_StRt((Abs_StRt)Abs);	  });
}