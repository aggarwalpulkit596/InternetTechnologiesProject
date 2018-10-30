<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="/WEB-INF/tlds/custom"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <c:set var="str" value="${param.textbox}"/>
        Original String: ${str}<br>
        Reverse String: <x:reverse input="${str}"></x:reverse>
    </body>
</html>
