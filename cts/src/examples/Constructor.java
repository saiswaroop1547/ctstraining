package examples;

public class Constructor {
	
	
	private String name;
	private String dept;
	private String org;
	Constructor(){
		System.out.println("constructer is executed");
		name="swaroop";
		dept="developer";
		org="HCL";
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
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public void showData()
	{
		System.out.println(name+""+dept+""+org);
	}
	static {
		System.out.println("static block is executed");
	}
	{
		System.out.println("non static block is executed");
	}

}