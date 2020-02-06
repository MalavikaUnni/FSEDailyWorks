
<%@ include file="header.jsp" %>

<%   
String name=request.getParameter("uname");  
out.print("welcome "+name);  

response.sendRedirect("register.jsp");
%>  



</body>
</html>