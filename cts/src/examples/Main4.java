package examples;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int arr[]=new int[10];
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter array size less than 10");
		int n=scanner.nextInt();
		for(int x=0;x<n;x++) {
			arr[x]=scanner.nextInt();
		}
		System.out.println("enter search element");
		int x=scanner.nextInt();
		
System.out.println(UseMainCode4.findELement(arr,x));
	}

}
