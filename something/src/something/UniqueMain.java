package something;

import java.util.Scanner;

public class UniqueMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		int x = UserMainCode.checkUnique(str);
		if(x==0) {
		System.out.println("-1");
		}
		else {
		System.out.println( UserMainCode.checkUnique(str));
		}
		}
}