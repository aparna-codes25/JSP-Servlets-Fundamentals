<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Operations on cookies</title>
</head>
<body>

<%-- Cookie[] cookies = request.getCookies();
Cookie sessionCookie;

for(Cookie cookie: cookies){
	String sessionName = cookie.getName();
	if(sessionName.equalsIgnoreCase("JSESSIONID")){
		out.println(sessionName + ":" +  cookie.getValue());
		break;
	}
}
--%>
<form method="GET" action="cookieFormServlet">
	<label>First Name</label>
	<input type="text" name="firstName">
	<br/>
	<label>Last Name</label>
	<input type="text" name="lastName">
	<br/>
	<button type="submit">Submit</button>
</form>

</body>
</html>