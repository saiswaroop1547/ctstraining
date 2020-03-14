package examples;
import java.util.function.Consumer;

import javax.print.DocFlavor.STRING;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer<String> c=s->System.out.println(s);
c.accept("hello");
c.accept("hi");

Consumer<Integer> i=x->{
	if(x>=20)
		System.out.println("greater than 20");
	else
		System.out.println("less than 20");
	};
	i.accept(20);
	}

}
