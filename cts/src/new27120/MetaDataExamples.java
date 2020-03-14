package new27120;
import java.sql.*;
public class MetaDataExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("DRIVERS LOADED");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts", "root", "root");
			System.out.println("CONNECTION ESTABLISHED");
			DatabaseMetaData dmd=connection.getMetaData();
			System.out.println("database name:"+dmd.getDatabaseProductName());
			System.out.println(dmd.getDatabaseProductVersion());
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery("select * from emp");
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
