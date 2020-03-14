package examples;

import java.util.Scanner;

public class Main5 {
		// TODO Auto-generated method stub
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
			
	System.out.println(UserMainCode5.searchElement(arr,x));
	}

}
