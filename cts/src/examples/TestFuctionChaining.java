package examples;
import java.util.function.Function;
public class TestFuctionChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<String,String> f1=s->s.toUpperCase();
Function<String,String> f2=s->s.substring(0,9);
System.out.println("f1 is:" +f1.apply("omsaiswaroop"));
System.out.println("f1 is:" +f2.apply("omsaiswaroop"));
System.out.println("f1 and f2 is:" +f1.andThen(f2).apply("omsaiswaroop"));
System.out.println("f2 and f1 is:" +f1.compose(f2).apply("omsaiswaroop"));
	}

}
