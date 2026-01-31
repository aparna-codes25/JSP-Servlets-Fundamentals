<%-- JSP example to show use of contentType attribute of page directive --%>
<%@page contentType="application/json" %>
<!--
 <!DOCTYPE html>
<html>
<body>
<%= "{This is Aparna.}" %>

</body>
</html> 
 -->

<!-- Above code will be treated as a JSON message. JSON message doesn't have any
HTML structure. So the browser treats html tags as JSON ( it doesn't understand the
meaning of the html tags as it is told by the server that the contentType to expect is JSON
)
To output only JSON, no HTML tags should be there -->
