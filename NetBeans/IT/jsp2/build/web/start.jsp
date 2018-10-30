
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="num1" scope="session" value="${param.num1}"></c:set>
<c:set var="num2" scope="session" value="${param.num2}"></c:set>
<c:set var="op" scope="session" value="${param.op}"></c:set>
<c:if test="${op==1}">
    <c:out value="${num1+num2}"></c:out>
</c:if>
<c:if test="${op==2}">
    <c:out value="${num1-num2}"></c:out>
</c:if>
<c:if test="${op==3}">
    <c:out value="${num1*num2}"></c:out>
</c:if>