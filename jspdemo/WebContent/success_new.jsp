<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlet Form Data</title>
</head>
<body>
First Name: <%= request.getAttribute("firstName") %>
Last Name: <%= request.getAttribute("lastName") %>

</body>
</html>