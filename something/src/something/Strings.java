package something;

import java.util.Scanner;

public class Strings 
{
public static String display(String str)
{
	StringBuffer sb=new StringBuffer();
	if(str.charAt(0)!='j'&&str.charAt(1)!='b')
	{
		sb.append(str.substring(2));
	}
	else if(str.charAt(0)=='j'&&str.charAt(1)!='b')
	{
		sb.append('j').append(str.substring(2));
	}
	else if(str.charAt(0)!='j'&&str.charAt(1)=='b')
	{
		sb.append(str.substring(1));
	}
	else
	{
		sb.append(str.substring(0));
	}
	
	return sb.toString();
	
}

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		System.out.println(display(str));

	}

}
