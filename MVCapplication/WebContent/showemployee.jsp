<%@page import="mvc.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hi how r u

<table border="1" width="100%">
<tr><th>empid</th><th>ename</th><th>dept</th>
<th>desg</th><th>email</th><%
Employee emp=(Employee)request.getAttribute("emp");
%>
<c:set var="list1" value="${emp}" ></c:set>
<tr><td>${emp.getEmpid()}</td><td>${emp.getEname()}</td><td>${emp.getDept()}</td><td>${emp.getDesg()}</td><td>${emp.getEmail()}</td>
</tr>
</table>





</body>
</html>