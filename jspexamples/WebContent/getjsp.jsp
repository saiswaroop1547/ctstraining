<%@page import="java.sql.Statement"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try
{
		int flag=0;
		String id=request.getParameter("id");
	 	Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/cts","root","root");
		Statement st=con.createStatement();
		String query="select * from employee";
		ResultSet rs=st.executeQuery(query);%>
		<table border=1>
		<% 
		while(rs.next()){
			%>
			<tr>
			<td><%out.println(rs.getString(1));%></td>
			<td><%out.println(rs.getString(2));%></td>
			<td><%out.println(rs.getString(3));%></td>
			<td><%out.println(rs.getString(4));%></td>
			<td><%out.println(rs.getString(5));%></td>
			<td><%out.println(rs.getString(6));%></td>
			</tr>

		<%}%>
		</table>
		<%}
		catch(Exception e){

		}
		%>
</body>
</html>