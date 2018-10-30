<%-- 
    Document   : newjsp5
    Created on : Oct 23, 2018, 9:50:14 AM
    Author     : Pulkit Aggarwal
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="str" value="${param.str}"/>
        <c:forEach items = "Pulkit" var = "name" varStatus="i" step="2">
         <c:out value = "${i}"/>
       
      </c:forEach>
           <c:out value = "Pulkit"/>
    </body>
</html>
