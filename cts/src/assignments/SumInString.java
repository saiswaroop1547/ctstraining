package assignments;

import java.util.Scanner;

public class SumInString {
	public static int sum(String s)
	{
		String temp=" ";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
				temp=temp+ch;
			else
			{
				sum=sum+Integer.parseInt(temp);
				temp="0";
			}
			
		}
		return sum+Integer.parseInt(temp);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

System.out.println(sum(str));
	}

}
