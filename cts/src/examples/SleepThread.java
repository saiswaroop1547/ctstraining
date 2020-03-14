package examples;

public class SleepThread extends Thread {

	public void run() {
	try {	
		System.out.println(this.getState());// TODO Auto-generated constructor stub
	for(int i=101;i<200;i++)
	{
		System.out.println(i);
	this.sleep(2000);
	}
	System.out.println(this.getState());
	}
	catch(InterruptedException e)
	{
	System.out.println(e);
	}}
	public static void main(String Args[]) {
	SleepThread obj=new SleepThread();
	obj.start();
	for(int i=1;i<=100;i++)
	System.out.println(i);
	/*System.out.println(obj.getState());
	System.out.println(obj.getPriority());
	System.out.println(obj.getName());
	System.out.println(obj.getId());*/
	}
}