<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>q5</title>
    </head>
    <body>
        <c:set var="string" value="${param.textbox}"/>
        <c:choose>
            <c:when test="${param.radio == \"odd\"}" >
                <c:forEach var="i" begin="1" end="${fn:length(string)}" step="2">
                <c:set var="a" value="${fn:substring(string,i,i+1)}"/>
                 <c:out value="${a}"/>
                 </c:forEach>
            </c:when>
            <c:otherwise>
                <c:forEach var="i" begin="0" end="${fn:length(string)}" step="2">
                <c:set var="a" value="${fn:substring(string,i,i+1)}"/>
                <c:out value="${a}"/>
                </c:forEach>
            </c:otherwise>
        </c:choose>
    </body>
</html>
