import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Employee implements java.io.Serializable
{ Connection con;
	private int empno;
	private String name;
	private float salary;
	public String job;
	public String getJob()
	{
	return job;	
	}
	public void setJob()
	{
	this.job=job;	
	}
	public Employee()
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
					"system","tiger");
			System.out.println("connection established");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public Employee(int empno) {
		this.empno=empno;
		
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary()
	{
		this.salary=salary;
	}
public void results()
{
	try 
	{
		ArrayList list=new ArrayList();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select ename,empno,job from emp where empno=?"+getEmpno());
		while(rs.next())
		{
			name=rs.getString(1);
			empno=rs.getInt(2);
			job=rs.getString(3);
			list.add(name);
			list.add(String.valueOf((empno)));
			list.add(String.valueOf((job)));
			System.out.println(list);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	public void deleteOne()
	{
		try 
		{
			int i;
			String str="delete from emp where empno=" +getEmpno();
			ArrayList list=new ArrayList<>();
			Statement s=con.createStatement();
			s.executeUpdate(str);
			i=s.getUpdateCount();
			System.out.println(i);
		}
		catch(Exception e)
		{
			
		}
}
	public void updateOne()
	{
		PreparedStatement stm=null;
		try
		{
			stm=con.prepareStatement("update emp set empno=? where empno=?");
			stm.setString(1, getName());
			stm.setInt(2, getEmpno());
			int r=stm.executeUpdate();
			System.out.println(r);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		Employee e=new Employee();	
		e.setEmpno(2);
		e.results();
	}
}
