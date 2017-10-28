<%-- 
    Document   : logout
    Created on : Oct 19, 2017, 8:45:42 AM
    Author     : Desmon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  session.invalidate();
  response.sendRedirect("login.jsp");
%>