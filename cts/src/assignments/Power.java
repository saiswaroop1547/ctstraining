package assignments;

import java.util.Scanner;

public class Power {

	public static int show(int n,int a[])
	{	int sum=0;
			for(int i=0;i<n;i++)
				{
				sum=(int) (sum+Math.pow(a[i], i));
				}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
System.out.println(show(n,a));
	}

}
