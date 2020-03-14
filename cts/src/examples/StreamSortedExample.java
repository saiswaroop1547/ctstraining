package examples;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamSortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(2);
		a.add(45);
		a.add(63);
		a.add(96);
		a.add(96);
		a.add(45);
		a.add(166);
		a.add(166);
		//a.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	long cnt=a.stream().distinct().count();	
	System.out.println(cnt);
	}

}
