
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int s= Integer.parseInt(request.getParameter("size"));
    for(int i=1;i<=s;i++){
        for(int j =1; j <= i; j++){
           out.print(j+" ");
        }
        out.print("<br>");
    }
%>