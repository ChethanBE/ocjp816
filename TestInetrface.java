import java.io.*;
 public interface TestInetrface {
	default void samplingProbeProcedure(){
		probeProcedure();
		System.out.println("Collect sample");
		System.out.println("Leave Asteroid");
		System.out.println("Dock with Main craft");
	}
	default void exlosionProbeProcedure(){
		probeProcedure();
		System.out.println("Explode");
	}
	static void probeProcedure(){
		System.out.println("Launch Probe");
		System.out.println("Land on Asteroid");
	}

 }