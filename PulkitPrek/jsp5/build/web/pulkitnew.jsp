
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="radio" value="${param.r1}"/>
        
        <c:if test="${radio=='even'}">
             
             <c:set var="check" value="you win"/>
            <c:forEach var="x" begin="1" end="${fn:length(n)}" step="2">
            <c:set value="${n.charAt(x).toString()}" var="y"/>     
            <c:if test="${!(y=='a'|| y=='e' || y=='i' || y=='o' || y=='u')}">
                     <c:set value="you lose" var="check"/>
            </c:if>
        </c:forEach>
         </c:if>
        
        <c:if test="${radio=='odd'}">
            
              <c:set var="check" value="you win"/>
            <c:forEach var="x" begin="0" end="${fn:length(n)}" step="2">
            <c:set value="${n.charAt(x).toString()}" var="y"/>     
            <c:if test="${!(y=='a'|| y=='e' || y=='i' || y=='o' || y=='u')}">
                     <c:set value="you lose" var="check"/>
            </c:if>
        </c:forEach>
         </c:if>
        
        <c:set var="n" value="${param.str}"/>
        
       
        
        <c:out value="the string is ${n}"/>
        <br>
        <br>
        <c:out value="the option selected is ${radio}"/>
        <br>
        <br>
        <c:out value="${check}"/>
      
    </body>
</html>
