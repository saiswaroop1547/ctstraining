package examples;
import java.util.function.Predicate;
/*interface TestNumber{
	public boolean testNum(int x);
}*/

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TestNumber tn=i->{
			if(i>10)
				return true;
			else
				return false;
		};*/
		Predicate<Integer> p=I->(I>10);
		Predicate<Integer> p1=i->(i%2==0);
		Predicate<String> p2=str->(str.length()>=3);
		Predicate<Integer> p3=i->
		{
			boolean flag=true;
		for(int x=2;x<i;x++)
		{
			if(i%x==0)
			flag=false;
			break;
		
		}
		return flag;
		};
		Predicate<Integer> p4=I->(I>=20);
		Predicate<Integer> p5=I->(I%2==0);
		System.out.println(p.test(24));
		System.out.println(p1.test(2));
		System.out.println(p2.test("hi"));
		System.out.println(p3.test(50));
		System.out.println(p4.or(p5).test(1));
	}
}
