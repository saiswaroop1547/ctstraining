package springexamples;

public class Student 
{
private String htno,name;

public String getHtno() {
	return htno;
}

public void setHtno(String htno) {
	this.htno = htno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public void init()
{
	System.out.println("hi init");
}
public void getMsg()
{
	System.out.println(htno+" "+name);
}
}
