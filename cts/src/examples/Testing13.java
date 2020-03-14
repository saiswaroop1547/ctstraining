package examples;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Testing13 {
	String name;
	int marks;
	public Testing13(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String toString() {
		return "Student3 [name=" + name + ", marks=" + marks + "]";
	}
}
class Test4
{
	public static void main(String args[])
	{
		ArrayList<Testing13> list=new ArrayList<Testing13>();
		Testing13 s1=new Testing13("swaroop", 76);
		Testing13 s2=new Testing13("sampath", 96);
		Testing13 s3=new Testing13("rahul", 66);
		Testing13 s4=new Testing13("ravi", 69);
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	
	Predicate<Testing13> p=s->s.marks>=60;
			
			Function<Testing13,String> f=s->
			{int marks=s.marks;
				if(marks>=80) {
					return "A";}
				else if(marks>=60)
				{
					return "B";
				}
				else if(marks>=50)
				{
					return "C";
				}
				else if(marks>=35)
				{
					return "D";
				}
				else
					return "Failed";
					};
	
			Consumer<Testing13> c=s->
			{
				System.out.println("Student name"+s.name);
				System.out.println("Student marks"+s.marks);
				System.out.println("Student grade"+f.apply(s));
			};
			for(Testing13 s:list) {
				if(p.test(s))
					c.accept(s);
				}
}
}
