<%-- 
    Document   : img
    Created on : Sep 28, 2017, 5:26:50 PM
    Author     : Desmon
--%>

<%@page import="com.bin.fetchpdf"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
if(session.getAttribute("name")==null)
{
    %><script>
        alert("must have to login first");
        window.location.assign("login.jsp");
        </script><%      
}
else
{
String ss =request.getParameter("Id");
String ss1 =request.getParameter("id2");
fetchpdf obj=new fetchpdf();
obj.download(ss,ss1);

%>
<script>
alert("Your pdf is downloaded at D:\pdf");
window.location.assign("courses.jsp");
</script>
<%}%>
