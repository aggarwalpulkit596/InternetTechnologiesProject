<%-- 
    Document   : newjsp8
    Created on : 23 Oct, 2018, 12:23:33 AM
    Author     : Pulkit Aggarwal
--%>
<%@taglib prefix="x" uri="/WEB-INF/tlds/reverse.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <x:reverse string="${param.string}"></x:reverse>
    </body>
</html>
