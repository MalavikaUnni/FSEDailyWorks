
<%@ include file="header.jsp" %>

<%-- <c:out value="Hello World" />
<br>
<c:set var="name" value="Aneena" />
<c:out value="${name}" />
 --%>
<%-- Loop: <br/>
<c:forEach var="i" begin="1" end ="10" step="1">
<h2> ${i }</h2>
</c:forEach> --%>

<%-- Loop With Array: <br/>
<c:forEach var="i" items="1,2,656,74,64,67,23">
<h2> ${i }</h2>
</c:forEach> --%>

<%-- <c:set var="income" scope="session" value="${4000*4}"/>  
<c:if test="${income > 8000}">  
   <p>My income is: <c:out value="${income}"/><p>  
</c:if> 
 --%>
<%-- <c:set var="income" scope="session" value="${4000*4}"/>  
<p>Your income is : <c:out value="${income}"/></p>  
<c:choose>  
    <c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>  
    <c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>  
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>  --%>

<%--   <c:set var="url" value="0" scope="request"/>  
  <c:if test="${url<1}">  
     <c:redirect url="http://javatpoint.com"/>  
  </c:if>  
  <c:if test="${url>1}">  
     <c:redirect url="http://facebook.com"/>  
  </c:if> --%>  
  
  <c:url value="/login.jsp"/>  

</body>
</html>