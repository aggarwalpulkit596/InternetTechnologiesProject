<%-- 
    Document   : newjsp7
    Created on : 22 Oct, 2018, 11:38:40 PM
    Author     : Pulkit Aggarwal
--%>
<%@taglib prefix="x" uri="/WEB-INF/tlds/substring.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <x:substring input="${param.str}" start="${param.start}" end="${param.end}"></x:substring>
    </body>
</html>
