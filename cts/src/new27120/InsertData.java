package new27120;
import java.sql.*;
public class InsertData {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts", "root", "root");
		Statement statement=connection.createStatement();
		String query="insert into customers values"+"(1001,'vinay','platinum',75)";
		//String query ="Update customers set age=35 where id=1001";
		//String query="delete from customers where id=1001";
		//int count=statement.executeUpdate(query);
		//System.out.println(count+"Record(s) inserted..."); 
		boolean flag=statement.execute(query);
		if(flag)
			System.out.println("ResultSet is returned");
		else
			System.out.println("Record(s) inserted...");
		statement.close();
		connection.close();
	
	}

}
