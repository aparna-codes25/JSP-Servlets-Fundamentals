<jsp:useBean id="person" class="com.luv2code.jsp.Person"></jsp:useBean>
<jsp:setProperty property="*" name="person"/>

<h3>Received Person details</h3>
<p>Name: <jsp:getProperty property="name" name="person"/></p>
<p>Age: <jsp:getProperty property="age" name="person"/></p>