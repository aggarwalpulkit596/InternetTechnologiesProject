<%-- 
    Document   : ques10_2
    Created on : Oct 30, 2018, 10:22:19 AM
    Author     : KMV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="b" value="${param.product}"/>
         <c:out value="Hello ${a}"/>
        <c:out value="you have ordered ${b}"/>
    </body>
</html>
