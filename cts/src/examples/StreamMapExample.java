package examples;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class StreamMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		Function<Integer,Integer> f=x->x*2;
		a.add(0);
		a.add(2);
		a.add(10);
		a.add(15);
		a.add(20);
		a.stream().map(x->x*2).forEach(System.out::println);
		List list=a.stream().map(x->x*3).collect(Collectors.toList());
		System.out.println(list);
	}

}
