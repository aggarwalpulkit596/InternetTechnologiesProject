<%-- 
    Document   : ques10
    Created on : Oct 30, 2018, 10:00:16 AM
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
        <c:set var="a" scope="session" value="${param.name}"/>
        <c:out value="Hello ${a}"/>
        <form action="ques10_2.jsp">
            Enter Product : <input type="text" name="product">
            <input type ="submit" name="submit">
        </form>
    </body>
</html>
