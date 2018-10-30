<%-- 
    Document   : newjsp
    Created on : Oct 9, 2018, 9:25:05 AM
    Author     : KMV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User info form</title>
    </head>
    <body>
    <form  action="newjsp.jsp" >
        <c:if test="${param.name=='' ||param.name=='NULL'&&param.submitted}">please enter name<br</c:if>
            Name<input type="text" name ="name"><br><br>
            <input type="hidden" name="submitted"value="true"/><br>
            <input type="radio" name ="gender" value ="male" checked>Male
            <input type="radio" name ="gender" value ="female" checked>Female<br>
            <br><input type="submit" value="submit"><br>
        <%--<c:if test="${empty param.name && param.submitted}">please enter name</c:if>--%>
        <%--<c:out value="${param.name}"></c:out>--%>
        <c:if test="${param.gender=='checked'}">
            <c:choose>
                <c:when test="${param.gender=='Male'}">
                    you choose male
                </c:when>
                <c:otherwise>you choose female</c:otherwise>
            </c:choose>
        </c:if>
    </form>
        
            <br>
        Name:<c:out value="${param.name}"/><br>
        Gender:<c:out value="${param.gender}"/><br>
    </body>
    
  
</html>
