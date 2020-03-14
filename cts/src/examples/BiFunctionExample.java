package examples;
import java.util.function.*;


public class BiFunctionExample {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> add=(a,b)->(a+b);
		BiFunction<Integer,Integer,Integer> mul=(a,b)->(a*b);
		BiFunction<Integer,Integer,Integer> sub=(a,b)->(a-b);
	System.out.println(add.apply(10, 20));
	System.out.println(mul.apply(12, 120));
	System.out.println(sub.apply(12, 24));
	}

}
