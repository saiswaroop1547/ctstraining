package assignments;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=1;
		for(int i=1;i<=n;i++)
		{

			System.out.print(x);
			x=x+2;
			if(i%2!=0&&i!=n)
			System.out.print("+");
			else if(i%2==0 && i!=n)
				System.out.print("-");
		}
	}

}
