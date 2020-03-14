package examples;

public class EvenOdd {

	public EvenOdd() {
		// TODO Auto-generated constructor stub
	}
	public void testNumber(int Number)throws Even,Odd{
		if(Number%2!=0) {
			System.out.println("given number is odd");
			throw new Even();
		}
		else if(Number%2==0)
		{
			System.out.println("given number is even");
			throw new Odd();
		}
		else
			System.out.println("given number is:"+Number);
	}

}
