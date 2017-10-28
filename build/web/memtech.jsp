<%-- 
    Document   : memtech
    Created on : Jul 22, 2017, 6:07:00 PM
    Author     : vinet
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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .navbar{
                background-color: #AE94F5;
            }
            body{
                background-image: url("img1.jpg");
                background-repeat: no-repeat;
                background-size: cover;
            }
        </style>
    </head>
    <body style="background-color: navajowhite">
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
                            <li><a  href="view_edit_info.jsp" ><button name="btn_upload" class="btn btn-default">Edit</button></a></li>
                            <li><a href="logout.jsp"><button name="btn_upload" class="btn btn-default">LogOut</button></a><br></li>
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
        <font size="10" style="margin-left:130px;"><b>Mechanical Engineering (ME)</b></font>
        <table style="border:0; margin-left: 280px; margin-top: 50px;">
            <tr style="background-color: peru">
                <th><font size="6" style="padding: 10px;">S.No.</font></th>
                <th><font size="6" style="padding: 10px;">Semesters</font></th>
            </tr>
            <tr>
                <td align="center" style="padding: 10px;"><b>1.</b></td>
                <td align="center" style="padding: 10px;"><b><a href="img.jsp?Id=Semester 1&id2=ME(M.TECH)"><font color="black">Semester 1</font></a></b></td>
            </tr>
            <tr style="background-color: peru">
                <td align="center" style="padding: 10px;"><b>2.</b></td>
                <td align="center" style="padding: 10px;"><b><a href="img.jsp?Id=Semester 2&id2=ME(M.TECH)"><font color="black">Semester 2</font></a></b></td>
            </tr>
            <tr>
                <td align="center" style="padding: 10px;"><b>3.</b></td>
                <td align="center" style="padding: 10px;"><b><a href="img.jsp?Id=Semester 3&id2=ME(M.TECH)"><font color="black">Semester 3</font></a></b></td>
            </tr>
            <tr style="background-color: peru">
                <td align="center" style="padding: 10px;"><b>4.</b></td>
                <td align="center" style="padding: 10px;"><b><a href="img.jsp?Id=Semester 4&id2=ME(M.TECH)"><font color="black">Semester 4</font></a></b></td>
            </tr>
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
                    </div>
                </div>
    </body>
</html>
