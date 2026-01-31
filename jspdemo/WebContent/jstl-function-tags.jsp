<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL function tags</title>
</head>
<body>
<c:set var="str" value="Aparna is a Java Developer"/>
Length: ${fn: length(str)}
<br/>
<c:forEach items="${fn: split(str,' ')}" var="s">
${s}
<br/>
</c:forEach>

index of the word a in the above sentence: ${fn: indexOf(str,'a')}
<br/>
is there word 'Java'?: ${fn:contains(str,'Java')}
<br/>
is there word 'JSP'?: ${fn:contains(str,'JSP')}
<br/>
Does it end with "Trainer": ${fn:endsWith(str,'Trainer')}
<br/>
UpperCase: ${fn: toUpperCase(str)}
<br/>
LowerCase: ${fn: toLowerCase(str)}
</body>
</html>