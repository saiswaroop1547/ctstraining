package examples;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		Predicate<Integer> p=x->x%5==0;
		a.add(0);
		a.add(2);
		a.add(10);
		a.add(15);
		a.add(20);
		System.out.println(a);
		Stream s=a.stream();
		List<Integer> list=(List<Integer>) s.filter(p).collect(Collectors.toList());
	System.out.println(list);
		//List<Integer> list=a.stream().filter(x->x%2==0).collect(Collectors.toList());
	//System.out.println(list);
	//a.stream().filter(x->x%2==0).forEach(System.out::println);
	} 

}
