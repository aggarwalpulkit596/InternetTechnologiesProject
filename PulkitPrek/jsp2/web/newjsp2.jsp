<%-- 
    Document   : newjsp2
    Created on : Sep 18, 2018, 10:38:06 AM
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
       
        <%
        String choice=request.getParameter("radio");
        int x1=Integer.parseInt(request.getParameter("num2"));
        int x2=Integer.parseInt(request.getParameter("num1"));
        int c;
        if(choice.equals("add"))
        {
             c=x1+x2;
        }
        else if(choice.equals("sub")){
             c=x1-x2;
        }
        else
        {
             c=x1*x2;
        }
        out.println("result is "+c);
        %>
    </body>
</html>
