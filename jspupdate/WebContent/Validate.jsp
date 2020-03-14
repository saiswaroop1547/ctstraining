<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
String a = request.getParameter("uname");
String b = request.getParameter("password");

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection
("jdbc:mysql://localhost:3306/cts2","root","root");

PreparedStatement pst = con.prepareStatement("select type from login where id = ? ");
PreparedStatement pst1 = con.prepareStatement("select pwd from login where id = ?");
PreparedStatement pst2 = con.prepareStatement("select uname from login where id = ? ");
pst.setString(1, a);
pst1.setString(1, a);
pst2.setString(1, a);

ResultSet rs = pst.executeQuery();
ResultSet rs1 = pst1.executeQuery();
ResultSet rs2 = pst2.executeQuery();

rs.next();
rs1.next();
rs2.next();
//float n = rs.getFloat(1);
if(b.equals(rs1.getString(1)) && rs.getString(1).equals("admin") ){
%>
Name: <%=rs2.getString(1)%><br>
Account Type: <%=rs.getString(1)%><br>
<nav>
<a href="home.html">HOME</a>
<a href="add.html">Add</a>
<a href="update.html">Update</a>
<a href="delete.html">Delete</a>
</nav>
<!--<form action="update.servlet">
EmpNO:<input type="text" name="eno"  /><br>
Ename:<input type="text" name="ename"  /><br>
Job:<input type="text" name="job"  /><br>
Manager:<input type="text" name="Manager"  /><br>
HireDate:<input type="date" name="hiredate"  /><br>
Salary:<input type="text" name="salary"  /><br>
Commission:<input type="text" name="commission"  /><br>
Department No:<input type="text" name="deptno"  /><br>
<input type="submit" value="Insert" />
</form>
-->
<%
}
else
{
out.println("Password Error");
}
%>
</body>
</html>