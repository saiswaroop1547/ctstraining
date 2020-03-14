package springexamples;

public class Address
{
	String dno,city,street;

	Address(String dno, String city, String street) {
		super();
		this.dno = dno;
		this.city = city;
		this.street = street;
	}
	public String toString() {
		return "Address [dno=" + dno + ", city=" + city + ", street=" + street + "]";
	}
	
}
