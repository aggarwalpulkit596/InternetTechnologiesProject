<%-- 
    Document   : newjsp6
    Created on : 23 Oct, 2018, 1:08:31 AM
    Author     : Pulkit Aggarwal
--%>
<%@taglib prefix="x" uri="/WEB-INF/tlds/jsp6.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <x:hello name="${param.name}"></x:hello>
        <x:choco texture="${param.texture}"></x:choco>
        
    </body>
</html>

