<%-- 
    Document   : studentrecord
    Created on : Aug 17, 2017, 1:44:58 AM
    Author     : Desmon
--%>
<%
if(session.getAttribute("name")==null)
{
    %><script>
        alert("must have to login first");
        window.location.assign("login.jsp");
        </script><%      
}
%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import ="com.bin.*"%>
<%
    service ser = new service();
    List studentlist = ser.student_lsit();
    binclass objbin;
%>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .navbar{
                background-color: #AE94F5;
            }
        </style>
    </head>
    <body>
        <div class="header"> 
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="courses.jsp">NOTES SHARING</a>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav navbar-right">
<!--                            <li><a  href="#" onclick="return adminlogin()">Administrator</a></li>
                            <li><a  href="signup.jsp">Sign Up page for Students</a><br></li>-->
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="about us.jsp">About us</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="contact us.jsp">Contact us</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>
        </div>
        <table class="table table-striped table table-hover">
            <tr>
                <td>S.No</td>
                <td>First Name</td>
                <td>Last Name</td>
                <td>Roll_No</td>
                <td>E-Mail</td>
                <td>Password</td>
                <td>Gender</td>
                <td>Delete</td>
                <td>Edit</td>
            </tr>
            <%if (studentlist.size() > 0) {
                    for (int a = 0; a < studentlist.size(); a++) {
                        objbin = (binclass) studentlist.get(a);
            %>
            <tr>
                <td><%=a + 1%></td>
                <td><%=objbin.getFname()%></td>
                <td><%=objbin.getLname()%></td>
                <td><%=objbin.getRollno()%></td>
                <td><%=objbin.getUserid()%></td>
                <td><%=objbin.getPassword()%></td>
                <td><%=objbin.getGender()%></td>
                <td><form action="controler_signup.jsp" method="get">
                        <input type="submit" class="btn btn-default" value="<%=objbin.getRollno()%>" name="delete"></input>
                    </form>
                </td>
                <td><form action="adminedit_record.jsp" method="get">
                        <input type="submit" class="btn btn-default" value="<%=objbin.getRollno()%>" name="edit"></input>
                    </form>
                </td>
            </tr>    
            <%
                    }
                }
            %>
        </table>
        <div class="footer">
            <div class="navbar navbar-inverse navbar-fixed-bottom" role="navigation">
                <ul class="nav nav-pills pull-right">													
                    <li role="presentation "><a class="b1 edit5" href="# ">About Us</a></li>
                    <li role="presentation "><a class="b1 edit5" href="# ">Home</a></li>
                    <li role=" presentation "><a class="b1 edit5" href="# ">Privacy</a></li>
                    <li role="presentation "><a class="b1 edit5" href="# ">Advertising</a></li>
                    <li role="presentation "><a class="b1 edit5" href="# ">Cookies</a></li>
                    <li role="presentation "><a class="b1 edit5" href="# ">Ad Choices</a></li>
                </ul>
                </nav>
            </div>
    </body>
</html>
