package examples;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Thread execution starts......");
		for(int i=101;i<200;i++)
			System.out.println(i);
		System.out.println("Thread execution completed...");
	}
}


public class ThreadExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread t=new MyThread();
System.out.println("main method started execution");

	t.start();
	for(int j=1;j<=100;j++)
	System.out.println(j);
	System.out.println("main method execution completed-");
	System.out.println(t.getPriority());
	}

}
