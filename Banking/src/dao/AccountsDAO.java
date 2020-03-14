package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dto.Accounts;

public class AccountsDAO 
{
	 private static String jdbcURL;
	    private static String jdbcUsername;
	    private static String jdbcPassword;
	    private static Connection jdbcConnection;
	     public AccountsDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
	        this.jdbcURL = jdbcURL;
	        this.jdbcUsername = jdbcUsername;
	        this.jdbcPassword = jdbcPassword;
	    }
	    protected static void connect() throws SQLException 
	{
	    	if (jdbcConnection == null || jdbcConnection.isClosed()) {
	            try {
	                Class.forName("com.mysql.cj.jdbc.Driver");
	            } catch (ClassNotFoundException e) {
	                throw new SQLException(e);
	            }
	            jdbcConnection = DriverManager.getConnection(
	                                        jdbcURL, jdbcUsername, jdbcPassword);
	        }
	}
	protected void disconnect() throws SQLException
	{
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
	}
	public static void deposit(String acno,float amount) throws SQLException 
	{
		connect();
		String sql="update accounts set balance=balance+? where acno=?";
		 PreparedStatement pst = jdbcConnection.prepareStatement(sql);
		 pst.setFloat(1, amount);
		 pst.setString(2, acno);
		 int status = pst.executeUpdate();
		 System.out.println("Amount deposited");
	}
	public static void withdraw(String acno,float amount) throws SQLException 
	{connect();
	String sql="update accounts set balance=balance-? where acno=?";
	 PreparedStatement pst = jdbcConnection.prepareStatement(sql);
  pst.setFloat(1, amount);
  pst.setString(2, acno);
  int status = pst.executeUpdate();
	System.out.println("Amount WITHDRAWED");
		
	}
	public static void getBalance(String acno) throws SQLException
	{
		connect();
		String sql="select balance from accounts where acno=?";
		
		PreparedStatement pst = jdbcConnection.prepareStatement(sql);
		pst.setString(1, acno);
		ResultSet rs=pst.executeQuery();
		rs.next();
		System.out.println("the avilable balance is:"+rs.getFloat(1));
	
		
	}
}
