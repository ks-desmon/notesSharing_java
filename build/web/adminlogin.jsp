<%-- 
    Document   : recoverpassword
    Created on : Jul 30, 2017, 10:28:15 PM
    Author     : Desmon
--%>

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
        <title>recover_Password</title>
        <style>
            .container{
                height: 400px;
                width: 500px;
                margin: 0 auto;
                margin-top: 80px;
                background-color: #e7e7e7;
                border: 1px solid #ccc;
                border-radius: 4px;
                opacity: 0.5;
                filter: alpha(opacity=50); /* For IE8 and earlier */
            }
            .container:hover {
                opacity: 1.0;
                filter: alpha(opacity=100); /* For IE8 and earlier */
            }
            .nav1{
                background-color: #e7e7e7;
            }
            .footer{
                margin-top: 50px;
                padding-bottom: 50px;
            }
            body{
                background-image:url("img.jpg");
            }
            .navbar{
                background-color: #AE94F5;
                }
        </style>
    </head>
    <body>
        <header>
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
        </header>
        <div class="container">
            <form action="NewServlet" method="get">
                <header class="header1">
                    <nav class="navbar navbar-default nav1">
                        <div class="container-fluid">
                            <!-- Brand and toggle get grouped for better mobile display -->
                            <div class="navbar-header">
                                <a class="navbar-brand" href="#">Enter Your Email & Password</a>
                            </div>
                            <!-- Collect the nav links, forms, and other content for toggling -->
                            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            </div><!-- /.navbar-collapse -->
                        </div><!-- /.container-fluid -->
                    </nav>
                </header>
                <table class="table">
                    <tr><td><input class="form-control"  type="email" name="userid" placeholder="email" required></td></tr>
                    <tr><td><input class="form-control"  type="password" name="password" placeholder="password" required></td></tr>
                    <tr><td><input class="btn btn-default" type="submit" name="recover"></td></tr>
                </table>
            </form>
        </div>
        <div class="footer">   
            <ul class="nav nav-pills pull-right">													<!--adding footer of page -->
                <li role="presentation "><a class="b1 edit5" href="# ">About Us</a></li>
                <li role="presentation "><a class="b1 edit5" href="# ">Home</a></li>
                <li role=" presentation "><a class="b1 edit5" href="# ">Privacy</a></li>
                <li role="presentation "><a class="b1 edit5" href="# ">Advertising</a></li>			<!--adding content of footer-->
                <li role="presentation "><a class="b1 edit5" href="# ">Cookies</a></li>
                <li role="presentation "><a class="b1 edit5" href="# ">Ad Choices</a></li>
            </ul>
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