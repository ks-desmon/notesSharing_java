<%-- 
    Document   : controler_signup
    Created on : Jul 31, 2017, 12:18:13 AM
    Author     : Desmon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import ="com.bin.*"%>
<jsp:useBean id="objbin" class="com.bin.binclass">
    <jsp:setProperty name="objbin"  property="*"/>
</jsp:useBean>
<%
    if (request.getParameter("insert") != null) {
        service ser = new service();
        String result = ser.addRecord(objbin);
        if (result == "Roll No is already existing.") {
%>
<script>
    alert("Roll No is already existing.");
    window.location.assign("signup.jsp");
</script>
<%} else if (result == "E-Mail is already existing.") {
%>
<script>
    alert("E-Mail is already existing.");
    window.location.assign("signup.jsp");
</script>
<%} else if (result == "Account is successfully created.") {
%>
<script>
    alert("Account is successfully created.");
    window.location.assign("login.jsp");
</script>
<%}
    }
%>
<%
    if (request.getParameter("update") != null) {
        service ser = new service();
        String result = ser.updateRecord(objbin);
        if(result==null)
        {
        %><script>
                        alert("You can't change your roll no.");
                        window.location.assign("view_edit_info.jsp");
                    </script><%
        }
        else
        {
        %><script>
                        alert("Update done");
                        window.location.assign("courses.jsp");
                    </script><%
        }
    }
%>
<%
    if (request.getParameter("delete") != null) {
        service ser = new service();
        int rollno = Integer.parseInt(request.getParameter("delete"));
        int result = ser.deleteRecord(rollno);
        response.sendRedirect("studentrecord.jsp");
    }
%>