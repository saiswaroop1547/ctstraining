package new27120;
import java.sql.*;
import java.util.Scanner;
public class DeleteData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts", "root", "root");
		Statement statement=connection.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id to delete..");
		int id=sc.nextInt();
		String query="delete from customers where id="+id;
		int count=statement.executeUpdate(query);
		System.out.println("deleted"); 
	}

}
