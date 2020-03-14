package examples;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArraylistStringprgm {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String c=sc.nextLine();
		//System.out.println(c);
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(c," ");
		while (st.hasMoreTokens())
		{
		String str1 = st.nextToken();
		String str2 = str1.substring(str1.length() - 1);
		String str3 = str2.toUpperCase();
		sb.append(str3).append("$");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
		}
	}
	
