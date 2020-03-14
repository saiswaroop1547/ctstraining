package assignments;

import java.util.Scanner;

public class Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
int max=-10000,min=457572;
if(n==1)
	System.out.println(a[0]);
	
	else
	{
		for(int i=0;i<n;i++)
		{
			if(a[i]<=min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max-min);
	}
}

}
