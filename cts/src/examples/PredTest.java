package examples;
import java.util.function.Predicate;
public class PredTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {0,7,4,5,10,15,16,18,13};
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		System.out.println("print Numbers greater than 10");
		m(p1,x);
		System.out.println("print even numbers");
		m(p2,x);
		System.out.println("the numbers not greater tha 10");
		m(p1.negate(),x);
		System.out.println("the numbers greater than 10 and even");
		m(p1.and(p2),x);
		System.out.println("the numbers greater than 10 or even ");
		m(p1.or(p2),x);
	}
	public static void m(Predicate<Integer> p,int[] x)
	{
		for(int x1:x)
		{
			if(p.test(x1))
				System.out.println(x1);
				
		}
	}

}
