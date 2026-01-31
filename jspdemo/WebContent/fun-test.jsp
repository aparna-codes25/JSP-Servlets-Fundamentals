<!DOCTYPE html>
<%@page import="com.luv2code.jsp.FunUtils,java.util.*"%>
<html>
<body>
Let's have some fun: <%= FunUtils.makeItLower("FUN FUN FUN ") %>
<br/>Current time on server: <%= new Date() %>
</body>
</html>