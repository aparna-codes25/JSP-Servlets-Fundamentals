<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Implicit Objects in JSP</title>
</head>
<body>
	<%
		pageContext.setAttribute("name", "Aparna",PageContext.REQUEST_SCOPE);
		String name = request.getAttribute("name").toString();
		out.println(name);
	%>
</body>
</html>