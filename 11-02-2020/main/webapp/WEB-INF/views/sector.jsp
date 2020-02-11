<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<hr>

 <table border="1">
 <tr>
<th>Id</th>
<th>Brief</th>
<th>Name</th>

</tr>
<c:forEach var="sector" items="${sectorlist}"> 
<tr>
<td>${sector.id }</td>
<td>${ipo.brief}</td>
<td>${sector.name }</td>


</tr>
</c:forEach>
</table>
 
 
<hr>
<%-- ${message} --%>

</body>
</html>
