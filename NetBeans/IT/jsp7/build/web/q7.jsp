<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="x" uri="/WEB-INF/tlds/custom" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        Original String: ${param.textbox}<br>
        Substring: <x:substring input="${param.textbox}" start="${param.start}" end="${param.end}"></x:substring>
    </body>
</html>
