package examples;
import java.util.Scanner;

public class ArrayIndex{

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of int array:");
		
		
		int size = sc.nextInt();
		try {
		int Array[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter int value at index " + i + ":");
			Array[i] = sc.nextInt();
		}
		System.out.println("Enter array index to get the value:");
		int index = sc.nextInt();
		System.out.println("Value at index " + index + " = "+ Array[index]);
	}
	catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}
}
