package something;

import java.util.Scanner;

public class Kaprur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=sc.nextInt();
		int s=n*n;
	int len=String.valueOf(s).length();
	String s1=Integer.toString(s);
	int n1=Integer.parseInt(s1.substring(0,len/2));
	int n2=Integer.parseInt(s1.substring(len/2,len));
	System.out.println(n1+"    "+n2);
	int n3=n1+n2;
	System.out.println(n3);
	if(n3==n)
	{
		System.out.println("kaprur number");
		
	}
	else
	{
		System.out.println("not a kaprur number");
	}
	}

}
