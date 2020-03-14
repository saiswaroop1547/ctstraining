package examples;
import java.util.Scanner;

public class TestingEvenOdd {

	public TestingEvenOdd() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur Number");
		Number=sc.nextInt();
		EvenOdd Num=new EvenOdd();
		try {
			Num.testNumber(Number);
		}
		catch(Even e)
		{
			System.out.println(e);
			
		}
		catch(Odd e)
		{
			System.out.println(e);
		}

	}

}
