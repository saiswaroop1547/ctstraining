package xam08022020;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCode {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the size of arraylist");
	    int n = Integer.parseInt(sc.nextLine());
	    ArrayList<Integer> ar1 = new ArrayList<Integer>();
	    ArrayList<Integer> ar2 = new ArrayList<Integer>();
	    System.out.println("enter elements in arraylist1");
	    for (int i = 0; i < n; i++)
	      ar1.add(Integer.parseInt(sc.nextLine()));
	    System.out.println("enter elements in ararylist2");
	    for (int i = 0; i < n; i++)
	      ar2.add(Integer.parseInt(sc.nextLine()));
	    char ch = sc.nextLine().charAt(0);
	    System.out.println(UserMainCode.performSetOperations(ar1,ar2,ch));
	}
	
}

	