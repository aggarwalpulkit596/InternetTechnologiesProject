<%-- 
    Document   : newjsp1
    Created on : Sep 18, 2018, 10:26:23 AM
    Author     : KMV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% int x=Integer.parseInt(request.getParameter("num1"));
            for(int y=1;y<=x;y++){
                for(int z=1;z<=y;z++){
                    out.println(z);
                }
                out.println("<br>");
            }
            %>
    </body>
</html>
