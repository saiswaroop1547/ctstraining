package examples;
class MyRunnable implements Runnable
{
	public void run() {
		// TODO Auto-generated method stub
		for(int i=201;i<=300;i++)
		{
	System.out.println(i);
	}
	}
}

public class RunnableTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable r=()->{
	for(int i=101;i<=200;i++)
		System.out.println(i);
};
MyRunnable mr=new MyRunnable();
Thread t1=new Thread(mr);
Thread t=new Thread(r);
t.start();
t1.start();
	}

}
