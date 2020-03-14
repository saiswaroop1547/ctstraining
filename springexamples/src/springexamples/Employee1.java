package springexamples;

public class Employee1 
{
	private String fullName;
	private DepartmentBean departmentBean;
	
	public Employee1(DepartmentBean departmentBean)
	{
		this.departmentBean =departmentBean;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
}
