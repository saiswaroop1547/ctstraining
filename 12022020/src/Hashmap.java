import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
public static void main(String args[])
{
	
	HashMap<Integer, String> h1=new HashMap<Integer,String>();
	HashMap<Integer,Integer> h2=new HashMap<Integer,Integer>();
	HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of elements");
	int n=sc.nextInt();
for(int i=0;i<n;i++)
{
	System.out.println("enter the integer");
	int id=sc.nextInt();	
	h1.put(id,sc.next());
	h2.put(id, sc.nextInt());
}
hm=(HashMap<Integer,Integer>)UserMainCode.increaseSalaries(n,h1,h2);
System.out.println(hm);
}
}
