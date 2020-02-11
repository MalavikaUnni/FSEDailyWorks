<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<hr>

 <table border="1">
 <tr>
<th>Id</th>
<th>Name</th>
<th>Sector</th>
<th>CEOName</th>
<th>TurnOver</th>

</tr>
<c:forEach var="company" items="${companylist}"> 
<tr>
<td>${company.id }</th>
<td>${company.name}</td>
<td>${company.sector }</td>
<td>${company.ceoName }</td>
<td>${company.turnOver }</td>

</tr>
</c:forEach>
</table>
 
 
<hr>
<%-- ${message} --%>

</body>
</html>
