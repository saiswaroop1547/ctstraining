package new27120;

import java.sql.*;

public class TableCreation {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts", "root", "root");
				Statement statement=connection.createStatement();
				String query="CREATE  TABLE air_credit_card_details \r\n" + 
						"( \r\n" + 
						"profile_id VARCHAR(10)  NOT NULL, \r\n" + 
						"card_number BIGINT, \r\n" + 
						"card_type VARCHAR(45), \r\n" + 
						"expiration_month INT, \r\n" + 
						"expiration_year INT \r\n" + 
						");";
				int count=statement.executeUpdate(query);
				System.out.println(count+1 +"Table created..."); 
				statement.close();
				connection.close();
	}

}
