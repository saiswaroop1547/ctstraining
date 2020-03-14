package examples;

public class Employee {
	private String name;
	private String dept;
	private String org;
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
}
