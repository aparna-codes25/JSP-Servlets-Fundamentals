<%@ page isELIgnored = "false"%>
<%
request.setAttribute("name","Aparna");
%>

Hello ${name}

<%-- 
isElIgnored = false ( evaluates expressions ${...})
isELIgnored = true ( displays ${...} them as plain text)
 --%>