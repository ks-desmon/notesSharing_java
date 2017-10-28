<%-- 
    Document   : adminedit_record
    Created on : Aug 17, 2017, 4:25:53 AM
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
<%@page import ="com.bin.*"%>
<%
    int rollno = Integer.parseInt(request.getParameter("edit"));
    service ser = new service();
    binclass binobj = ser.view_details_admin(rollno);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign_in_teacher</title>
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
            .navbar{
                background-color: #AE94F5;
            }
            body{
                background-image: url("img.jpg");
                background-repeat: no-repeat;
                background-size: cover;
            }
        </style>
</head>
<body style="margin:0px; background-color: wheat">
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
        </div>
    <h1>Student Info</h1>
    <div class="container">
        <form action="controler_signup.jsp" method="get">
            <table>
                <tr>
                    <td><b>First Name</b></td>
                    <td><input type="text"class="form-control" name="fname" id="name" required="enter First name" value="<%=binobj.getFname()%>"></input></td>
                </tr>
                <tr>
                    <td><b>Last Name</b></td>
                    <td><input type="text"class="form-control" name="lname"  required= "enter last name" value="<%=binobj.getLname()%>"></input></td>
                </tr>
                <tr>
                    <td><b>Email</b></td>
                    <td><input type="email"class="form-control" name="userid" required="enter email" value="<%=binobj.getUserid()%>"></input></td>
                </tr>
                <tr>
                    <td><b>roll_no</b></td>
                    <td><input type="number" class="form-control"name="rollno" required=" enter address" value="<%=binobj.getRollno()%>"></input></td>
                </tr>
            </table>
            <input type="submit" value="submit" class="btn btn-default" name="update">
        </form>
    </div>
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