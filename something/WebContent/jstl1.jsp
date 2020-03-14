<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="String" value="JSTL Programming"/>
<c:if test="${fn:contains(String,'programming')}">
<p>Found programming string</p>
</c:if>
<b> After contains tag</b>
<c:if test="${fn:contains(String,'programming')}">
<p>Found programming string</p>
</c:if>
<c:if test="${fn:contains(String,'programming')}">
<p>Found programming string</p>
</c:if>
<c:if test="${fn:endsWith(String,'programming')}">
<p>String ends with programming</p>
</c:if>
<c:set var="String1" value="it is first string "></c:set>
<c:set var="String2" value="IT IS<xy>Second String.</xy>"></c:set>
<p>Index-1 : ${fn:indexOf(String1,"is")}</p>
<p>Index-2 : ${fn:indexOf(String2,"<")}</p>
<c:set var="Str1" value="Welcome to       JSTL      programming"></c:set>
<p>String-1 Length is: ${fn:length(Str1)}</p>
<c:set var="Str2" value="${fn:trim(Str1)}"></c:set>
<p>String2 length is:${fn:length(Str2)}</p>
<p>Final value of the String is:${Str2}</p>
<c:set var="msg" value="the example of jstl fn:startswith() function"></c:set>
the string starts with "the":${fn:startsWith(msg,'the')}
<br>the string starts with "example":${fn:startsWith(msg,'example')}
<p>to upper case :${fn:toUpperCase(String1)}</p>
<p>to lower case :${fn:toLowerCase(String1)}</p>

</body>
</html>