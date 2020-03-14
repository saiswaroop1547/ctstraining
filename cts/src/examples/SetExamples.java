package examples;
import java.util.*;
class Employee1154
{
	String eid;
	String name;
	public Employee1154(String eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	
	
}

public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hs=new HashSet();
hs.add("India");
hs.add("Japan");
hs.add("china");
hs.add("moscow");
hs.add(null);
hs.add("Japan");
hs.add("India");
hs.add("china");
System.out.println(hs);

HashSet hs1=new HashSet();
hs1.add(new Employee1154("1456","swaroop"));
	System.out.println(hs1);
	Iterator itr=hs1.iterator();
	
	
	
	}

}
