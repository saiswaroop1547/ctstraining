package examples;
import java.util.Scanner;
public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of array1");
		int n1=scanner.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
			arr1[i]=scanner.nextInt();
		
		
		
		
		System.out.println("enter the size of array2");
		
		int n2=scanner.nextInt();
		int arr2[]=new int[n2];
		for(int j=0;j<n2;j++)
			arr2[j]=scanner.nextInt();
		
System.out.println(UserMainCode6.Arrays(arr1, arr2));
	}

}
