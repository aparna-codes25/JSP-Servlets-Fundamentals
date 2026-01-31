<!DOCTYPE html>
<html>
<body>
<h3>JSP Built-in server objects</h3>

Request user-agent: <%= request.getHeader("User-Agent") %>
<br/>
Request Locale: <%= request.getLocale() %>
</body>
</html>