<%-- 
    Document   : jsp4
    Created on : Sep 28, 2018, 3:05:04 PM
    Author     : KMV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="WEB-INF/tlds/newtag_library.tld" prefix="x" %>  
<x:today></x:today>
<b><c:out value="${param.textbox}"/></b>
