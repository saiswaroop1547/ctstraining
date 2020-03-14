package examples;

import java.util.TreeSet;

class Employee11 implements Comparable<Employee11>
{
	String eid;
	String name;
	public Employee11(String eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	
	public int compareTo(Employee11 emp)
	{
		if(name.compareTo(emp.name)<0)
			return -1;
		else if(name.compareTo(emp.name)>0)
			return 1;
		else
			return 0;
			
	}
	
}

public class SetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet ts=new TreeSet();
ts.add("India");
ts.add("Bangala");
ts.add("China");
ts.add("Japan");
System.out.println(ts);

TreeSet ts1=new TreeSet();
ts1.add(new Employee11("1239","rafi"));
ts1.add(new Employee11("1238","ajay"));
ts1.add(new Employee11("1237","jagan"));
ts1.add(new Employee11("1236","razinaa"));
	ts1.forEach(System.out::println);
	}

}
