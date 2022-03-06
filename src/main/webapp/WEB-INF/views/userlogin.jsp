<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User Register</title>
</head>

<body>
<form:form action="adduser" method="post" modelAttribute="userDto">
	Enter username:<form:input path="username"/><br/>
	Enter password :<form:input path="password"/><br/>
	Enter profile:<form:input path="profile"/><br/>
	Enter email:<form:input path="email"/><br/>
	<input type ="submit"/>
</form:form>
<br>
<a href="adduser">add user</a><br>
</body>
</html>