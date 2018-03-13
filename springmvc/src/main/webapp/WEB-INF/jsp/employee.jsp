<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Add Employee</h1><br>
<form:form action="/springmvc/employee" method="post" commandName="employee">
    ID:<form:input path="empId"/>
   Name: <form:input path="name"/>
	Company:<form:input path="company"/>
	Salary:<form:input path="salary"/>
	City:<form:input path="city"/>
	<form:button value="Submit">Submit</form:button>
</form:form>
<br>


<h3>All Employees</h3>

<table>
   <tr>
   <th>ID</th>
   <th>Name</th>
   <th>company</th>
   <th>Salary</th>
   <th>City</th>
   ]<th>Action</th>
   </tr>
   
 <c:if test="${empList.size()>0 }">  
<c:forEach items="${empList}" var="emp" >
    <tr>
        <td>${emp.empId}</td>
	   <td>${emp.name}</td>
	   <td>${emp.company}</td>
	   <td>${emp.salary}</td>
	   <td>${emp.city}</td> 
	   <td><a href="employee?id=${emp.empId }">Edit</a><a href="employee/${emp.empId }">Delete</a></td> 
    </tr>

</c:forEach>
</c:if>
</table>

</body>
</html>