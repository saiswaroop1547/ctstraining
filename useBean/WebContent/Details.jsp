<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="u" class="useBean.UserDetails"/>
<!--<jsp:setProperty property="username" name="u" />
<jsp:setProperty property="age" name="u"/>
<jsp:setProperty property="password" name="u"/>
!-->
<jsp:setProperty property="*" name="u" />
<jsp:getProperty property="username" name="u"/>
<jsp:getProperty property="age" name="u"/>
<jsp:getProperty property="password" name="u"/>