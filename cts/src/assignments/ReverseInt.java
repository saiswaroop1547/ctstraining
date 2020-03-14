package assignments;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0,s;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n!=0)
{
	s=n%10;
	rev=rev*10+s;
	n=n/10;
}

System.out.println(rev);
	}
}
