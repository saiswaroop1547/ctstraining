package examples;
import java.util.function.Predicate;

public class PredicateExamples {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[] names= {"Sam","Kishore","Raj"};
		Predicate<String> test=i->i.charAt(0)=='K';
		for(String n:names)
		{
			if(test.test(n))
			{
				System.out.println(n);
			}
		}
	}

}
