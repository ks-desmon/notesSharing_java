<%-- 
    Document   : view_recoverpassword
    Created on : Jul 30, 2017, 10:39:23 PM
    Author     : Desmon
--%>
<%@page import ="com.bin.*"%>
<%
    int rollno = Integer.parseInt(request.getParameter("rollno"));
    service ser = new service();
    binclass binobj = ser.recover_password(rollno);
    String pass = binobj.getPassword();
    
    if (pass!=null) {
%>
<script>
    alert("Your password is <%=binobj.getPassword()%>");
    window.location.assign("login.jsp");
</script>
<%
} else{
%>
<script>
    alert("Wrong Roll-No is entered.");
    window.location.assign("recoverpassword.jsp");
</script>
<%
    }
%>