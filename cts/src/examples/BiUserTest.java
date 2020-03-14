package examples;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Emp
{
	String name;
	double salary;
	public Emp(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}
public class BiUserTest {

	public static void main(String[] args) {
		ArrayList<Emp> ar=new ArrayList<Emp>();
		ar.add(new Emp("sam",20000));
		ar.add(new Emp("sampath",25563));
		ar.add(new Emp("sameer",21233));
		ar.add(new Emp("samuel",20099));
		ar.add(new Emp("samrtha",120000));
		
		BiConsumer<Emp,Double> c=(e,d)->e.salary+=d;
		
		for(Emp e:ar)
		{
			c.accept(e,500.0);
		}
		for(Emp e:ar)
		{
			System.out.println(e.name);
			System.out.println(e.salary);
//			System.out.println();
		}
		


	}

}
