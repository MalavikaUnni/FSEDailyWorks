<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<hr>

 <table border="1">
 <tr>
<th>Id</th>
<th>Company Name</th>
<th>PricePerSahre</th>
<th>Remarks</th>
<th>StockExchange</th>
<th>TotalStocks</th>
</tr>
<c:forEach var="ipo" items="${ipolist}"> 
<tr>
<td>${ipo.id }</th>
<td>${ipo.companyName }</td>
<td>${ipo.pricePerShare}</td>
<td>${ipo.remarks }</td>
<td>${ipo.stockExchange }</td>
<td>${ipo.totalStocks }</td>
</tr>
</c:forEach>
</table>
 
 
<hr>
<%-- ${message} --%>

</body>
</html>
