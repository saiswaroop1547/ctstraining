package examples;
import java.util.Scanner;

class test
{
	public static float testMethod()
	{int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first value");
	a=sc.nextInt();
	System.out.println("Enter the second value");
	b=sc.nextInt();
	if(b==0)
		throw new java.lang.ArithmeticException("divide by zero not possible");
		else
			return b/a;
		
	}
}
public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	float k= test.testMethod();
	System.out.println(k);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
	}

}
