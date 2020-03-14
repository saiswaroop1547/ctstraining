package examples;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee2 {
	@Override
	public String toString() {
		return "[name=" + name + ", desg=" + desg + ", salary=" + salary + ", city=" + city + "]";
	}
	String name;
	String desg;
	float salary;
	String city;
	public Employee2(String name, String desg, float salary, String city) {
		super();
		this.name = name;
		this.desg = desg;
		this.salary = salary;
		this.city = city;
	}
	public boolean equals(Object obj)
	{
		Employee2 e=(Employee2)obj;
		if(name.equals("name") && desg.equals("desg"))
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		Employee2 emp1=new Employee2("swaroop","ceo",100000,"hyderabad");
		Employee2 emp2=new Employee2("rohit","Pat",98000,"Hyderabad");
		Employee2 emp3=new Employee2("vinay","DEveloper",67000,"chennai");
		Employee2 emp4=new Employee2("kumar","Tester",45000,"pune");
		Employee2 emp5=new Employee2("hulash","Coder",25000,"kolkata");
		Employee2 emp6=new Employee2("gagandeep","Designer",40000,"delhi");
		Employee2 emp7=new Employee2("praveen","tech support",30000,"hyderabad");
		Employee2 emp8=new Employee2("nahveen","analyst",30000,"hyderabad");
	
		Predicate<Employee2> p1=emp->emp.desg.equals("Tester");
		Predicate<Employee2> p2=emp->emp.city.equals("hyderabad");
		Predicate<Employee2> p3=emp->emp.salary>20000;
		//System.out.println(emp1);
		ArrayList<Employee2> list=new ArrayList<Employee2>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);
		display(p3,list);		
	}
	public static void display(Predicate<Employee2> p,ArrayList<Employee2> list)
	{
	for(Employee2 e:list)
	{
		if(p.test(e))
		{
			System.out.println(e);
		}
	}
	}

}