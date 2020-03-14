package examples;
import java.util.Scanner;
public class SumOfOddsAndEvens {
	
	public static int checkSum(int n)
	{
		int n1,n2=0,n3;
		while(n!=0)
		{
			n1=n%10;
			if((n1%2)!=0)
				n2+=n1;
			n/=10;
		}
		if(n2%2==0)
			n3=-1;
		else
			n3=1;
		return n3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
System.out.println(checkSum(n));
	}

}
