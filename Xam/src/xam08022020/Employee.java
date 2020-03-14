package xam08022020;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection
			("jdbc:mysql://localhost:3306/cts","root","root");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter employee name");
			String name=sc.next();
			System.out.println("enter employee id");
			String id=sc.next();
			System.out.println("enter employee department:");
			String dept=sc.next();
			System.out.println("enter employee designation:");
			String desg=sc.next();
			System.out.println("enter employee company:");
			String company=sc.next();
			System.out.println("enter employee emailid:");
			String emailid=sc.next();
			PreparedStatement pst=connection.prepareStatement
					("insert into employee values(?,?,?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, id);
			pst.setString(3, dept);
			pst.setString(4, desg);
			pst.setString(5, company);
			pst.setString(6, emailid);
			pst.executeUpdate();
			System.out.println("Record inserted...");
			
			
			
		}
		catch(Exception e) {

	}



	}

}
