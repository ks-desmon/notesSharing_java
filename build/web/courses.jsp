<%-- 
    Document   : courses
    Created on : Jul 20, 2017, 9:59:26 PM
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
<%@page import="com.bin.*" %>
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
        <style>
    .navbar{
                background-color: #AE94F5;
    }
    body{
                background-image: url("img4.jpg");
                background-repeat: no-repeat;
                background-size: cover;
            }
        </style>
        <title>Courses</title>
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
        <font size="5" style="margin-left:190px;"><b>Courses Available</b></font>
        <p style="margin-left: 370px; margin-top: 30px;"><font size="5"><u>Bachelor of Technology (B.Tech)</u></font></p>
        <ul>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="csebtech.jsp">Computer Science Engineering (CSE)</a></li>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="mebtech.jsp">Mechanical Engineering (ME)</a></li>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="ecebtech.jsp">Electronics & Communication Engineering (ECE)</a></li>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="cebtech.jsp">Civil Engineering (CE)</a></li>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="eebtech.jsp">Electrical Engineering (EE)</a></li>
        </ul>
        <p style="margin-left: 370px;"><u><font size="5">Master of Technology (M.Tech)</font></u></p>
        <ul>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="csemtech.jsp">Computer Science Engineering (CSE)</a></li>                
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="ecemtech.jsp">Electronics & Communication Engineering (ECE)</a></li>                
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="memtech.jsp">Mechanical Engineering (ME)</a></li>                
        </ul>
        <p style="margin-left: 370px;"><u><font size="5">Business Administration (BBA/MBA)</font></u></p>
        <ul>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="bba.jsp">Bachelor of Business Administration (BBA)</a></li>
            <li style="margin-left: 400px; margin-bottom: 10px;"><a href="mba.jsp">Master of Business Administration (MBA)</a></li>
        </ul>
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