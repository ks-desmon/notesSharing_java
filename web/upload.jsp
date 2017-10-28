<%-- 
    Document   : upload
    Created on : Aug 30, 2017, 7:34:17 PM
    Author     : Desmon
--%>
<%if(session.getAttribute("name")==null)
{
    %><script>
        alert("must have to login first");
        window.location.assign("login.jsp");
        </script><%      
}
%>
<%@page import ="com.bin.*"%>

<%
    
    try{
                if (request.getParameter("btn_upload")!=null&&request.getParameter("subpart1")!=""&&request.getParameter("subpart")!=""&&request.getParameter("getfile")!="")
                {
                    
                String filename = request.getParameter("getfile");
                String branchname = request.getParameter("subpart");
                String samestername = request.getParameter("subpart1");
                service ser = new service();
                String result=ser.addfiles(filename,branchname,samestername);
                if(result.equals("done"))
                {
                %><script>
                        alert("file uploaded");
                        window.location.assign("admin.jsp");
                    </script><%
                }
                }
else{%><script>
                        alert("All required fields are not selected.");
                        window.location.assign("admin.jsp");
                    </script><%}
        }
    catch(Exception ex){
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

