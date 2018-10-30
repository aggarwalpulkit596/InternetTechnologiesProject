<%-- 
    Document   : newjsp3
    Created on : Sep 28, 2018, 2:09:05 PM
    Author     : KMV
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="r1" value="${param.radio}"/>
        <c:set var="num1" value="${param.num1}"/>
        <c:set var="num2" value="${param.num2}"/>
       
        <c:choose>
            
            <c:when test="${r1.equals('add')}">
            the addition of two number is <c:out value="${num1+num2}"/>
            </c:when>
            
             <c:when test="${r1.equals('sub')}">
                the subtraction of two number is <c:out value="${num1-num2}"/>
            </c:when>
            
            <c:otherwise>
               the multiplication of two number is  <c:out value="${num1*num2}"/>
            </c:otherwise>
        </c:choose>
        
     
              
    </body>
</html>
