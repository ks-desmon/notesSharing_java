<%-- 
    Document   : sign_in_as_teacher
    Created on : Jul 18, 2017, 5:39:23 PM
    Author     : vinet
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
        <title></title>
        <!--		<link rel="stylesheet" type="text/css" href="Sign_in_style.css">-->
        <style>       
            .container
            {
                margin-top: 50px;
                margin-left: 50px;
                height: 100%;
                width: 100%;
            }
            input
            {
                margin :5px;
                border-radius: 4px;
            }
            .btn,table{
                margin-left: 450px;
            }
            body{
                background-image: url("img2.jpg");
                background-size: 100%;
            }
            .footer{
                margin-top: 160px;
            }
            form{
                margin-top: 50px;
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
                            <li><a  href="#" onclick="return adminlogin()">Administrator</a></li>
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
        <form action="controler_signup.jsp" method="get">
            <table>
                <tr>
                    <td><b>First Name</b></td>
                    <td><input type="text"class="form-control" name="fname" id="fname" required></input></td>
                </tr>
                <tr>
                    <td><b>Last Name</b></td>
                    <td><input type="text"class="form-control" name="lname"  id="lname" required></input></td>
                </tr>
                <tr>
                    <td><b>Roll No</b></td>
                    <td><input type="text" class="form-control" name="rollno" id="rollno" required></input></td>
                </tr>
                <tr>
                    <td><b>Email</b></td>
                    <td><input type="email"class="form-control" name="userid" id="email" required></input></td>
                </tr>
                <tr>
                    <td><b>Password</b></td>
                    <td><input type="password"class="form-control"  name="password" id="pass" required></input></td>
                </tr>
                <tr>
                    <td><b>Confirm Password</b></td>
                    <td><input type="password"class="form-control" name="confirmpassword" id="pass1" required></input></td>
                    <td><span id="message"></span></td>
                </tr>
                <tr>
                    <td><input type="radio" name="gender" value="male" required><b>Male</b></input></td>
                    <td><input type="radio" name="gender" value="female" required><b>Female</b></input></td>
                </tr>
            </table>
            <input type="submit" value="submit" class="btn btn-default" name="insert" onclick="return aa()">
        </form>
        <script>
            function aa()
            {
                var pas = document.getElementById("pass").value;
                var cpas = document.getElementById("pass1").value;
                var rol = document.getElementById("rollno").value;
                var name1 = document.getElementById("fname").value;
                var name2 = document.getElementById("lname").value;
                var email = document.getElementById("email").value;
                var com = /^[A-Za-z]+$/;
                var num = /^[0-9]+$/;
                if (name1.match(com)) {
                } else
                {
                    alert("Only alphabets are allowed in first name.")
                    document.getElementById("fname").focus();
                    return false;
                }
                if (name2.match(com)) {
                } else
                {
                    alert("Only alphabets are allowed in last name.")
                    document.getElementById("lname").focus();
                    return false;
                }if (rol.length != 7)
                {
                    alert("Roll no should be of 7 digits.")
                    document.getElementById("rollno").focus();
                    return false;
                }
                if (rol.match(num)) {
                } else
                {
                    alert("Only numbers are allowed.")
                    document.getElementById("rollno").focus();
                    return false;
                }
                if (pas.length >= 6 && pas.length <= 10) {
                } else
                {
                    alert("Password length in between 6 to 10 characters.")
                    document.getElementById("pass").focus();
                    return false;
                }
                if (cpas.length >= 6 && cpas.length <= 10) {
                } else
                {
                    alert("Password length in between 6 to 10 characters.")
                    document.getElementById("pass1").focus();
                    return false;
                }
                if (pas != cpas)
                {
                    alert("Password doesn't match.")
                    document.getElementById("pass").focus();
                    return false;
                }
                return true;
            }
        </script>
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
        </div>
    </body>
</html>