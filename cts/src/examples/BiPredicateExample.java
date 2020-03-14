package examples;
import java.util.function.*;
public class BiPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BiPredicate<Integer,Integer> bi=(a,b)->((a+b)%2==0);
	System.out.println(bi.test(10, 1));
	System.out.println(bi.test(2, 1));
	System.out.println(bi.test(4, 2));
	System.out.println(bi.test(6, 1));
	System.out.println(bi.test(12, 1));
	}

}
