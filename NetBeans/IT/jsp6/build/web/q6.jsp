<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="x" uri="/WEB-INF/tlds/custom" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <x:hello name="${param.textbox}"></x:hello>
    </body>
</html>
