<%-- 
    Document   : login
    Created on : Jul 18, 2017, 1:01:58 PM
    Author     : vinet
--%>
<%@page import="com.bin.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login</title>
        <style>
            .form-control
            {
                width: 380px;
            }
            .slide{
                margin-top: 100px;
                margin-bottom: 100px;
            }
            .container{
                margin-top: 100px;
                height: 50%;
            }
            body{
                background-image: url("img5.jpg");
                background-repeat: no-repeat;
                background-size: cover;
            }
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
                        <a class="navbar-brand" href="login.jsp">NOTES SHARING</a>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav navbar-right">
                            <li><a  href="adminlogin.jsp">Administrator</a></li>
                            <li><a  href="signup.jsp">Sign Up page for Students</a><br></li>
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
        <div class="container">
            <form action="login" method="get">
                <label><b>User ID</b></label>
                <input type="email" class="form-control" name="userid" required><br>
                <label ><b>Password</b></label>
                <input type="password" class="form-control" name="password" required><br>
                <input type="submit" class="btn btn-default" value="log_in" style="margin-bottom:15px; margin-left:100px;"><br>
                <a  href="recoverpassword.jsp" style="margin-left:40px;">Forgot Password</a>
            </form>   
        </div>
        <div class="footer">
            <div class="navbar navbar-inverse navbar-fixed-bottom" role="navigation">
                <ul class="nav nav-pills pull-right">													
                    <li role="presentation "><a class="b1 edit5" href="about us.jsp">About Us</a></li>
                    <li role="presentation "><a class="b1 edit5" href="courses.jsp">Home</a></li>
                    <li role=" presentation "><a class="b1 edit5" href="#">Privacy</a></li>
                    <li role="presentation "><a class="b1 edit5" href="#">Advertising</a></li>
                    <li role="presentation "><a class="b1 edit5" href="#">Cookies</a></li>
                    <li role="presentation "><a class="b1 edit5" href="#">Ad Choices</a></li>
                </ul>
                </nav>
            </div>
        </div>
    </body>
    <script>
        function adminlogin()
        {
            var pass = 1234;
            var message = prompt("plesae enter correct id");
            if (pass == message)
            {
                window.location.assign("admin.jsp");
                return true;
            } else
            {
                return false;
            }
        }
    window.history.forward();
    function noBack() { window.history.forward(); }
    </script>
</html>
