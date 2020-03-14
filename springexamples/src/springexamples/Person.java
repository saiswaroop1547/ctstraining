package springexamples;

public class Person 
{
	String name;
	Address address;
	int age;
	public Person(String name, Address address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public void showData()
	{
		System.out.println(name+" "+age);
		System.out.println(address);
	}
}
