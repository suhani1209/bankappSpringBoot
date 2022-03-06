<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="transfer" method="post" modelAttribute="transferDto">
	Enter from Account Id:<form:input path="fromAccountId"/><br/>
	Enter to Account Id:<form:input path="toAccountId"/><br/>
	Enter amount :<form:input path="amount"/><br/>
	<input type ="submit"/>
</form:form>
</body>
</html>