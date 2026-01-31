<!DOCTYPE html>
<html>
<body>
<h3>Scriptlets in JSP</h3>
<table border="1">
<% for(int i = 0;i<=5;i++) { %>
<tr>
<td>Number</td>
<td><%= i+1 %></td>
</tr>
<%} %>
</table>
</body>
</html>