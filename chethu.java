public class chethu implements TestInetrface{
	
	public void samplingProbeProcedure(){
	TestInetrface.super.samplingProbeProcedure();
	TestInetrface.super.exlosionProbeProcedure();
	}
	public static void main(String args[]){
		System.out.println("helo  darloo");
		chethu c=new chethu();
		c.samplingProbeProcedure();
	TestInetrface.probeProcedure();
	}
	
}