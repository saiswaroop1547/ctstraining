package examples;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("enter x square value");
int a=scanner.nextInt();
	System.out.println("enter x  value");
	int b=scanner.nextInt();
	System.out.println("enter constant value");
	int c=scanner.nextInt();
	
	System.out.println(UserMainCode2.findRoots(a,b,c));
	}
}
