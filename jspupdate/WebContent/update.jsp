<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
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
try {
	String id = request.getParameter("empid2");
String name = request.getParameter("ename");
String empid = request.getParameter("empid");
String dept = request.getParameter("department");
String desg = request.getParameter("designation");
String comp = request.getParameter("company");
String email = request.getParameter("emailid");
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection
("jdbc:mysql://localhost:3306/cts","root","root");
PreparedStatement pst = con.prepareStatement
("UPDATE employee SET empname=?, empid=?,department = ?, designation=?, company =?,emailid = ? WHERE empid = ? ");
pst.setString(1, name);
pst.setString(2, empid);
pst.setString(3, dept);
pst.setString(4, desg);
pst.setString(5, comp);
pst.setString(6, email);
pst.setString(7, id);
int count = pst.executeUpdate();
if(count==1) {
out.println("<b> Updated Successfull</b>");
}
else {
out.println("<b> Cannot Update</b>");
}
pst.close();
con.close();
out.close();
}
catch(Exception e) {
}
%>
</body>
</html>
