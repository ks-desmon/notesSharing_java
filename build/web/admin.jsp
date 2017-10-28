<%-- 
    Document   : admin
    Created on : Aug 11, 2017, 4:30:27 PM
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
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .bt1{
                margin-top: 10px;
            }
            .btn-file {
                position: relative;
                overflow: hidden;
            }
            .btn-file input[type=file] {
                position: absolute;
                top: 0;
                right: 0;
                min-width: 100%;
                min-height: 100%;
                font-size: 100px;
                text-align: right;
                filter: alpha(opacity=0);
                opacity: 0;
                outline: none;
                background: white;
                cursor: inherit;
                display: block;
            }
            .navbar{
                background-color: #AE94F5;
            }
            body{
                background-image: url("img4.jpg");
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
                        <a class="navbar-brand" href="courses.jsp">NOTES SHARING</a>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav navbar-right">
                            <li><a  href="logout.jsp">Logout</a></li>
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
            <form action="upload.jsp" method="get">
                <div class="input-group">
                    <label class="input-group-btn">
                        <span class="btn btn-primary">
                            Browse&hellip; <input type="file" style="display: none;" multiple>
                        </span>
                    </label>
                    <input type="text" class="form-control" name="getfile" value="" readonly>
                </div><br><br>
                <select id="course" name="subpart" onchange="myFunction()">
                    <option value="">--Select streams--</option>
                    <option value="CSE(B.TECH)">CSE(B.TECH)</option>
                    <option value="ME(B.TECH)">ME(B.TECH)</option>
                    <option value="ECE(B.TECH)">ECE(B.TECH)</option>
                    <option value="CE(B.TECH)">CE(B.TECH)</option>
                    <option value="EE(B.TECH)">EE(B.TECH)</option>
                    <option value="CSE(M.TECH)">CSE(M.TECH)</option>
                    <option value="ME(M.TECH)">ME(M.TECH)</option>
                    <option value="ECE(M.TECH)">ECE(M.TECH)</option>
                    <option value="BBA">BBA</option>
                    <option value="MBA">MBA</option>
                </select>
                <select id="subparts" name="subpart1">
                    <option value="">--Select semester--</option>
                </select>
                <input type="submit" name="btn_upload" class="btn btn-default" value="Upload file"><br><br>
                <a href="studentrecord.jsp"><button type="button" class="btn btn-info">Student Info</button></a><br><br><br>
                <a href="subjectrecord.jsp"><button type="button" class="btn btn-info">Subjects Info</button></a><br><br><br>
            </form>
        </div>
        <script>
            function myFunction()
            {
                var s1 = ["1", "2", "3", "4", "5", "6", "7", "8"];
                var ab = document.getElementById("course").value;
                if (ab == "CSE(B.TECH)" || ab == "ME(B.TECH)" || ab == "ECE(B.TECH)" || ab == "CE(B.TECH)" || ab == "EE(B.TECH)")
                {
                    var i = 7;
                    var save = document.getElementById("subparts").options.length;
                    for (save; save > 0; save--)
                    {
                        document.getElementById("subparts").options.remove(save);
                    }
                    for (j = 0; j <= i; j++)
                    {
                        var ba = document.createElement("option");
                        ba.innerHTML = "Semester " + s1[j];
                        document.getElementById("subparts").add(ba);
                    }
                } else if (ab == "CSE(M.TECH)" || ab == "ME(M.TECH)" || ab == "ECE(M.TECH)" || ab == "MBA")
                {
                    var i = 3;
                    var save = document.getElementById("subparts").options.length;
                    for (save; save > 0; save--)
                    {
                        document.getElementById("subparts").options.remove(save);
                    }
                    for (j = 0; j <= i; j++)
                    {
                        var ba = document.createElement("option");
                        ba.innerHTML = "Semester " + s1[j];
                        document.getElementById("subparts").add(ba);
                    }
                } else if (ab == "BBA")
                {
                    var i = 5;
                    var save = document.getElementById("subparts").options.length;
                    for (save; save > 0; save--)
                    {
                        document.getElementById("subparts").options.remove(save);
                    }
                    for (j = 0; j <= i; j++)
                    {
                        var ba = document.createElement("option");
                        ba.innerHTML = "Semester " + s1[j];
                        document.getElementById("subparts").add(ba);
                    }
                }
            }
            $(function () {

                // We can attach the `fileselect` event to all file inputs on the page
                $(document).on('change', ':file', function () {
                    var input = $(this),
                            numFiles = input.get(0).files ? input.get(0).files.length : 1,
                            label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
                    input.trigger('fileselect', [numFiles, label]);
                });

                // We can watch for our custom `fileselect` event like this
                $(document).ready(function () {
                    $(':file').on('fileselect', function (event, numFiles, label) {

                        var input = $(this).parents('.input-group').find(':text'),
                                log = numFiles > 1 ? numFiles + ' files selected' : label;

                        if (input.length) {
                            input.val(log);
                        } else {
                            if (log)
                                alert(log);
                        }
                    });
                });

            });
        </script>
        <div class="footer">
            <div class="navbar navbar-inverse navbar-fixed-bottom" role="navigation">
                <ul class="nav nav-pills pull-right">													
                    <li role="presentation "><a class="b1 edit5" href="about us.jsp">About Us</a></li>
                    <li role="presentation "><a class="b1 edit5" href="contact us.jsp">Home</a></li>
                    <li role=" presentation "><a class="b1 edit5" href="# ">Privacy</a></li>
                    <li role="presentation "><a class="b1 edit5" href="# ">Advertising</a></li>
                    <li role="presentation "><a class="b1 edit5" href="# ">Cookies</a></li>
                    <li role="presentation "><a class="b1 edit5" href="# ">Ad Choices</a></li>
                </ul>
                </nav>
            </div>
    </body>
</html>

