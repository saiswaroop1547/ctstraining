<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page import="java.util.*,java.sql.*,java.io.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" 
driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://Localhost/cts"
user="root" password="root"/>
<!--<sql:update dataSource="${db}" var="count">
insert into students values("15471A05K8","Swetha","cse","47");
</sql:update>-->
<!--<sql:update dataSource="${db}" var="ct"> 
Delete from students where htno=? 
<sql:param value="${StudentId}"/>
</sql:update>-->
<c:set var="StudentId" value="<%=request.getParameter(\"id\")%>"/>
<c:set var="StudentNAME" value="<%=request.getParameter(\"NAME\")%>"/>
<c:set var="StudentBRANCH" value="<%=request.getParameter(\"BRANCH\")%>"/>
<c:set var="StudentCOLLEGECODE" value="<%=request.getParameter(\"CID\")%>"/>
<sql:update dataSource="${db}" var="ct">
insert into students values(?,?,?,?)
<sql:param value="${StudentId}"/>
<sql:param value="${StudentNAME}"/>
<sql:param value="${StudentBRANCH}"/>
<sql:param value="${StudentCOLLEGECODE}"/>
</sql:update>

<sql:query dataSource="${db}" var="rs">
SELECT * from students;
</sql:query>
<table border="1" width="100%">
<tr>
<th>HallTkt</th>
<th>Name</th>
<th>Branch</th>
<th>cLgcode</th>
</tr>
<c:forEach var="table" items="${rs.rows}">
<tr>
<td><c:out value="${table.htno}"></c:out></td>
<td><c:out value="${table.name}"></c:out></td>
<td><c:out value="${table.branch}"></c:out></td>
<td><c:out value="${table.collegecode}"></c:out></td>
</tr>
</c:forEach>

</table>


</body>
</html>