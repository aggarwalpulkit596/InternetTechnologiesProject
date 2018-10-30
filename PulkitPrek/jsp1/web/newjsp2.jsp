<%-- 
    Document   : newjsp2
    Created on : Sep 28, 2018, 1:51:45 PM
    Author     : KMV
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        
        <c:set var="x" value="${param.num1}"/>
        <c:forEach begin="1" end="${x}" var="i">
        <c:forEach begin="1" end="${i}" var="j">
            <c:out value="${j}"/>
        </c:forEach>
        <br>
        </c:forEach>
        
                  
</html>
 <c:set var="boole" value="true"/>
            <c:set var="x" value="fn:substring(str,0,1)"/>
