<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL SQL tags</title>
</head>
<body>
<sql:setDataSource var="db" 
driver="org.postgresql.Driver"
url="jdbc:postgresql://localhost:5432/jspDemo"
user="postgres"
password="admin"></sql:setDataSource>

<sql:query var="rs" dataSource="${db}"> select * from gadgets</sql:query>
<p>Successfully connected to DB!</p>

<c:forEach items="${rs.rows}" var="g">
<c:out value="${g.gname}"/> : <c:out value="${g.price}"/>
<br/>
</c:forEach>
</body>
</html>