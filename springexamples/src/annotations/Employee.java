package annotations;

public class Employee 
{
String name;
String dept;
public Employee(String name, String dept) {
	super();
	this.name = name;
	this.dept = dept;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public void getData()
{
	System.out.println("hi how r u"); 
	System.out.println("name is:"+name+"department is:"+dept);
}
}
