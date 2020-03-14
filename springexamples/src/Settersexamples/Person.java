package Settersexamples;

public class Person 
{
	String age;
	String name;
	Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showData()
	{
		System.out.println("Age is:"+age+"Name is :"+name);
		System.out.println("dno id:"+address.Dno+"Street is"+address.Street+"City is:"+address.City);
	}
	
}
