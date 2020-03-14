package assignments;

import java.util.*;

public class Stringcharacters {
public static void Compare(String s,int n)

{
	int m=s.length();
String a=s.substring(0,(n/2)+1);
String b=s.substring((m/2)+1,m);
System.out.println(a+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String str=sc.nextLine();
int n=sc.nextInt();
Compare(str,n);

	}

}
