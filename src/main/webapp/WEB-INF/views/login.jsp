<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION }">
<font color="red">
	<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message }"></c:out>
</font>
</c:if>

<form  action='banklogin' method='POST'>
 <table>
    <tr><td>User:</td><td><input type='text' name='uname' value=''></td></tr>
    <tr><td>Password:</td><td><input type='password' name='upass'/></td></tr>
    <tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>
  </table>
</form>
<a href="adduser">add new user</a><br>
</body>
</html>