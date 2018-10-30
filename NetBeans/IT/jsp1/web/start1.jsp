
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<c:set var="s" scope="session" value="${param.size}"></c:set>
<c:forEach var="i" begin="1" end="${s}">  
    <c:forEach var="j" begin="1" end="${i}">
        <c:out value="${j}"/>
    </c:forEach>
    <br>
</c:forEach>
