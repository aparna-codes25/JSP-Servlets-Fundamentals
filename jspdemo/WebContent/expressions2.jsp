<!DOCTYPE html>
<html>
<body>
	<h3>Expressions in JSP</h3>
	<p>(6*4) = <%= (6*4) %></p>
	<p>Never terminate an expression within the expression element with semicolon
	<% int rollNum = 2; %>
	<!-- This is a scripting element -->
	<p> Current rollNum is <%= rollNum %> </p>
	<p> Next rollNum = <%= ++rollNum %> </p>
	<% out.print(6*4); %>
</body>
</html>