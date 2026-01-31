<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
</head>
<body>
	
	<form  method="post" action="register">
	<label>First Name</label>
	<input name="firstName" type="text">
	<br/>
	<label>Last Name</label>
	<input name="lastName" type="text">
	<br/>
	<label>Employee Id</label>
	<input name="employeeId" type="text">
	<br/>
	<label>Age</label>
	<input name="age" type="number">
	<br/>
	<label>Salary</label>
	<input name="salary" type="number">
	<br/>
	<input type="submit" value="Register">
	</form>
</body>
</html>