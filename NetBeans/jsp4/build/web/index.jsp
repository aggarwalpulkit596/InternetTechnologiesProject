<%-- 
    Document   : 
    Created on : Oct 2, 2018, 9:43:29 AM
    Author     :
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "ex" uri = "WEB-INF/timeTag.tld"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP-4</title>
    </head>
    <body>
        <!--<h1>Hello World!</h1>-->
        
        
    <ex:uname></ex:uname>
    <c:out value="${param.name}"/>
    </body>
</html>
