package springexamples;

public class Persons 
{
private String name;
int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void showData()
{
	System.out.println("name is : "  +name+  "age is :" +age);
}
public void startMethod()
{
	System.out.println("started");
}
public void destroyMethod()
{
	System.out.println("destroyed");
}
}
