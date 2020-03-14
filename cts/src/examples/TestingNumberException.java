package examples;

import java.util.Scanner;

public class TestingNumberException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		NumException num=new NumException();
		try {
			num.testString(str);
		}
		catch(NumberException e)
		{
			System.out.println(e);
		}
	}
	

}
