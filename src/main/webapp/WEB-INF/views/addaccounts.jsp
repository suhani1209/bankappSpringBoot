<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create new account</title>
</head>
<body>
<form:form action="accounts" method="post" modelAttribute="accountDto">
	Enter customer name:<form:input path="name"/><br/>
	Enter initial amount :<form:input path="balance"/><br/>
	Enter customer phoneNo:<form:input path="phoneNumber"/><br/>
	Enter customer address:<form:input path="address"/><br/>
	Enter customer email:<form:input path="email"/><br/>
	<input type ="submit"/>
</form:form>

</body>
</html>