<!DOCTYPE html>
<html>
<body>
<h3>Declarations in JSP</h3>
<%!
String makeItLower(String data){
	return data.toLowerCase();
}
%>
<%-- Another declaration --%>
<%! int val = 1000;%>
<p>Lower case "HELLO WORLD" : <%= makeItLower("HELLO WORLD") %>
<br/> Val is <%= val %>
</body>
</html>