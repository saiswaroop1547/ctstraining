package examples;

public class Employee1 {
String name;
String dept;
String desg;
public void SetDetails(String name, String dept, String desg) {
	this.name = name;
	this.dept = dept;
	this.desg = desg;
}
public void SetDetails(String name) {
	this.name = name;
	this.dept = "";
	this.desg = "";
}
public void SetDetails(String name, String dept) {
	this.name = name;
	this.dept = dept;
	this.desg = "";
}
public void showDetails()
{
	System.out.println(name+" "+dept+" "+desg);
}
public void showData(String ch,float y,int...x)
{
	System.out.println("inside the var args method ");
	for(int i=0;i<x.length;i++)
		System.out.println(x[i]);
}
}
