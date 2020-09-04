public class Main{
	public static void main(String[] args){
		Thread t1=new Thread(new MyThread());
		System.out.println("new Thread1 created");
	Thread t2=new Thread(new MyThread());
		System.out.println("new Thread2 created");
	Thread t3=new Thread(new MyThread());
		System.out.println("new Thread3 created");
	t1.start();
	System.out.println("t1 started");
	t2.run();
	System.out.println("t2 runs");
	t3.start();
	System.out.println("t3 started");
	t1.start();
	System.out.println("t1 again started");
	}

}
class MyThread implements Runnable{
	public void run(){
		
		System.out.println("Running.");
	}
}