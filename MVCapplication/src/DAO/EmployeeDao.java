package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mvc.Employee;

public class EmployeeDao 
{
public static Connection getConnection()
{	Connection con=null;
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection
	("jdbc:mysql://localhost:3306/cts1","root","root");

	}
	catch(Exception e)
	{
		
	}
	return con;
}
public int insertEmployees(Employee emp)
{
	int result=0;
	try
	{
		Connection con=getConnection();
		String sql="insert into employee values(?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, emp.getEmpid());
		pst.setString(2, emp.getEname());
		pst.setString(3, emp.getDept());
		pst.setString(4, emp.getDesg());
		pst.setString(5, emp.getEmail());
		result=pst.executeUpdate();
	}
	catch(Exception e)
	{
		
	}
	return result;
	
}
public List<Employee> showEmployees()
{
	List<Employee> list=new ArrayList<Employee>();
	try 
	{
	Connection con=getConnection();
	Statement ps=con.createStatement();
	ResultSet rs=ps.executeQuery("Select * from employee");
	while(rs.next())
	{
		Employee e=new Employee();
		e.setDept(rs.getString(3));
		e.setDesg(rs.getString(4));
		e.setEmail(rs.getString(5));
		e.setEmpid(rs.getString(1));
		e.setEname(rs.getString(2));
		list.add(e);
	}
	}
	catch(Exception e) 
	{
		System.out.println(e);
	}
	return list;
	
}
public Employee searchEmployee(String id)
{
	Employee emp=new Employee();
	try
	{

		String sql="Select * from employee where empid=?";
		Connection con=getConnection();
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, id);
		ResultSet rs=pst.executeQuery();
		rs.next();
		System.out.println(rs.getString(1));
			emp.setDept(rs.getString(3));
			emp.setDesg(rs.getString(4));
			emp.setEmail(rs.getString(5));
			emp.setEmpid(rs.getString(1));
			emp.setEname(rs.getString(2));
			
		}
	catch(Exception e)
	{
		
	}
	return emp;
}
}

