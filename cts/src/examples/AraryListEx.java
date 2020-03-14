package examples;
import java.util.*;

public class AraryListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList<>();
		int[] a= {10,20,30,40};
		ar.add("JAVA");
		ar.add(".NET");
		ar.add("SELENIUM");
		ar.add("ORACLE");
		ArrayList ar1=new ArrayList<>();
		ar1.add("DS");
		ar1.add("STACK");
		ar1.add("TESTING");
		ar1.add("PYTHON");
		ar.add(null);
		ar.add(true);
		ar.add(10);
		ar.addAll(ar1);
		ar1.add("ruby");
		for(int x:a)
 		System.out.println(a);
		System.out.println(ar);	
		if (ar.contains("JAVA"))
		System.out.println("Element found");
		else
		System.out.println("Element not found");
		if (ar.containsAll(ar1))
			System.out.println("Element found");
			else
			System.out.println("Element not found");
		System.out.println(ar.retainAll(ar));
		System.out.println("after removal");
		System.out.println(ar);	
	}

}
