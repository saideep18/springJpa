<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align= "center">
	
	<form:form action="registerProduct.do" method="post" modelAttribute="product">
	
	<table>
	<tr>
	<td><form:label path="name">Enter Name:</form:label></td>
	<td><form:input path="name"/></td>
	</tr>
	<tr>
	<td>Enter Cost:</td>
	<td><form:input path="cost"/></td>
	</tr>
	
	<tr>
	<td><form:label path="location">Select Location</form:label></td>
	<td><form:select path="location" items="${cities}"/></td>
	</tr>
	<tr>
	<td>Enter PinCode:</td>
	<td><form:input path="pinCode"/></td>
	</tr>
	
	<tr>
	<td></td>
	<td><input type="submit" value="Add Product"></td>
	</tr>
	
	
	
	
	</table>
	</form:form>
	
	
	</div>

</body>
</html>