package examples;
import java.util.ArrayList;
import java.util.function.Function;

public class Student {
String name;
int marks;

	public Student(String name, int marks) {
	super();
	this.name = name;
	this.marks = marks;
}
	public String toString() {
	return "Student [name=" + name + ", marks=" + marks + "]";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("swaroop",45);
		Student s2=new Student("sam",69);
		Student s3=new Student("vinay",95);
		Student s4=new Student("lakshmi",99);
		Student s5=new Student("ramarao",70);
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		Function<Student,String> s=i->
		{
			if(i.marks>75)
				//return "distinctiion";
				System.out.println("distinction");
			else if(i.marks>65)
				System.out.println("pass");
				//return "pass";
			else if(i.marks>45)
				System.out.println("average");
				//return "average";
			else 
				System.out.println("fail");
				//return "fail";
			return i.name;
		};
		display(s,list);
	}
	public static void display(Function<Student,String> p,ArrayList<Student> list)
	{
	for(Student e:list)
	{
		if(p.apply(e)!=null)
		{
			System.out.println(e);
		}
	}
	}
}
