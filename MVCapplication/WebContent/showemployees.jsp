<%@page import="mvc.Employee"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<th>desg</th><th>email</th>
<%
List<Employee> list=(List<Employee>)request.getAttribute("list");
%>
<c:set var="list1" value="${list}" ></c:set>
<c:forEach items="${list1}" var="u">
<tr><td>${u.getEmpid()}</td><td>${u.getEname()}</td><td>${u.getDept()}</td><td>${u.getDesg()}</td><td>${u.getEmail()}</td>
</tr>
</c:forEach>
</table>
</body>
</html>