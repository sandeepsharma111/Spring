<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
<form:form action="/springmvc/saveUser" commandName="currentUser">
    
    <form:input path="firstName"/>
	<form:input path="lastName"/>
	<form:input path="contactNo"/>
	
	<form:button value="Submit">Submit</form:button>
</form:form>

</h1>
</body>
</html>