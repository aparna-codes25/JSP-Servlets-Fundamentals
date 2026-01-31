<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<!-- Hello <c:out value="${label}"/> -->
<!--<c:import url="https://www.google.com"></c:import>-->
<!-- ${student} - will print hash code of student object
That is the memory address of the student object -->
${student.name} <!-- calls getName() getter on student object -->
${student.rollno} <!-- calls getRollno() getter on student object -->
<!-- The above EL is possible only if student is an 
object of a bean ( meaning a java class having constructors, getters
and setters) -->

<!-- If we want to print the object in a specific format
override it's toString object because while printing the object
we call it's toString() implementation  -->
${student}
<table border="1">
<tr>
<th>Roll No.</th>
<th>Name</th>
</tr>
<c:forEach items="${students}" var="s">
<tr>
<td>${s.rollno}</td>
<td>${s.name}</td>
</tr>
</c:forEach>
</table>

<c:set var="status" value="SHIT"></c:set>

<c:set var="ifStatus" value="DEPARTED"></c:set>
<c:if test="${ifStatus == 'DEPARTED'}">
	<button>Cancel Shipment</button>
</c:if>

<c:choose>

<c:when test="${status == 'IN_TRANSIT' }">
<span style="color: blue;">In Transit</span>
</c:when>

<c:when test="${status == 'DELAYED' }">
<span style="color: red;">Delayed</span>
</c:when>

<c:when test="${status == 'DELIVERED' }">
<span style="color: green;">Delivered</span>
</c:when>

<c:otherwise>
<span style="color: gray;">Unknown</span>
</c:otherwise>
</c:choose>

<c:set var="username" value="abcd" scope="session"></c:set>
<br/>
Before session: <c:out value="${username}"/>
<br/>
<c:remove var="username" scope="session"/>
After session: <c:out value="${username}"/>
</body>
</html>