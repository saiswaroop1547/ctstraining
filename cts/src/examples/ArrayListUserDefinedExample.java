package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Student112 implements Comparable<Student112>
{
	String htno;
	String name;
	public Student112(String htno, String name) {
		super();
		this.htno = htno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + "]";
	}
	public int compareTo(Student112 student)
	{
		if(name.compareTo(student.name)<0)
			return -1;
		else if(name.compareTo(student.name)>0)
			return 1;
		else
			return 0;
			
	}
}
class Employee115
{
	String eid;
	String name;
	public Employee115(String eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	
	
}
public class ArrayListUserDefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student112 s1=new Student112("1547", "swaroop");
			Student112 s2=new Student112("1A05", "sam");
			Student112 s3=new Student112("1443", "vinay");
			LinkedList<Student112> list=new LinkedList<Student112>(); 
			//ArrayList<Student112> list=new ArrayList<Student112>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		for(Student112 s:list)
			System.out.println(s.htno+" "+s.name);
		list.forEach(System.out::println);
		Collections.sort(list);
		list.forEach(System.out::println);
		Collections.reverse(list);
		System.out.println("after reverse is");
		list.forEach(System.out::println);
		/*Employee115 e1=new Employee115("2444","rafi");
		Employee115 e2=new Employee115("2663","rizwana");
		Employee115 e3=new Employee115("4556","safi");
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);*/
		
			
			
	
	}

}
