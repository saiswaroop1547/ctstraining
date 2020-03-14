package examples;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class OfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stream s=Stream.of(1,2,3,4,65,7,9,6,6,3,2,31,1330463);
Predicate<Integer> p=x->x%2==0;
s.filter(p).forEach(System.out::println);
	}

}
