package examples;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>(4);
		ar.add("JAVA");
		ar.add(".NET");
		ar.add("SELENIUM");
		ar.add("ORACLE");
		System.out.println("original order is");
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println("sorted order is");
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println("elements in reverse order");
		System.out.println(ar);
		ArrayList<String> ar1=new ArrayList<String>(4);
		ar.add("HALWA");
		ar.add("JABARDASTH");
		ar.add("TERMINUS");
		ar.add("PLATINA");
		Collections.copy(ar1, ar);
		System.out.println("after copying");
		System.out.println(ar1);
		Collections.fill(ar, "language");
		System.out.println("after filling in ar list");
		System.out.println(ar);
		boolean flag=Collections.disjoint(ar, ar1);
		System.out.println(flag);
	}

}
