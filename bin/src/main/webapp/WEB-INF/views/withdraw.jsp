<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Withdraw Amount</title>
</head>
<body>
<form:form action="withdraw" method="post" modelAttribute="withdrawDto">
	Enter Account Id:<form:input path="accountId"/><br/>
	Enter amount :<form:input path="amount"/><br/>
	<input type ="submit"/>
</form:form>
</body>
</html>