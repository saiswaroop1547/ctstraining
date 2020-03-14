package examples;

class HelloThread extends Thread{
	public void run() {
	for(int i=1;i<=50;i++)
		System.out.println("hello thread");
		try
	
		{
				this.sleep(0);
		}
	
		catch(Exception e)
	
		{
		

		}
	}
}

public class JoinDemo {

	public JoinDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			HelloThread h1=new HelloThread();
			h1.start();
			//h1.yield();
			h1.join();
			for(int i=101;i<=150;i++)
				System.out.println("main thread");
	}

}
