package examples;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();
Consumer<Integer> c=x->
{
	if(x%2==0)
		System.out.println("Even : "+x);
	else
		System.out.println("Odd : "+x);
};
a.add(2);
a.add(45);
a.add(63);
a.add(96);
a.add(166);
a.stream().forEach(c);
	}

}
