package new25120;

import java.io.Serializable;

public class Employee implements Serializable{

	public int empno;
	public String ename;
	public double empsalary;
	public Employee(int empno, String ename, double empsalary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.empsalary = empsalary;
	}
	public void printEmployee()
	{
		System.out.println("format of printing the details is : " +  empno +"name is" + ename +" salary is :"+empsalary);
	}

}