package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

if(session.getAttribute("name")==null)
{
    
      out.write("<script>\n");
      out.write("        alert(\"must have to login first\");\n");
      out.write("        window.location.assign(\"login.jsp\");\n");
      out.write("        </script>");
      
}

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.0.min.js\"></script>\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .bt1{\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("            .btn-file {\n");
      out.write("                position: relative;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            .btn-file input[type=file] {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                right: 0;\n");
      out.write("                min-width: 100%;\n");
      out.write("                min-height: 100%;\n");
      out.write("                font-size: 100px;\n");
      out.write("                text-align: right;\n");
      out.write("                filter: alpha(opacity=0);\n");
      out.write("                opacity: 0;\n");
      out.write("                outline: none;\n");
      out.write("                background: white;\n");
      out.write("                cursor: inherit;\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("            .navbar{\n");
      out.write("                background-color: #AE94F5;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"img4.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            .navbar{\n");
      out.write("                background-color: #AE94F5;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <div class=\"header\"> \n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-default\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"courses.jsp\">NOTES SHARING</a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li><a  href=\"logout.jsp\">Logout</a></li>\n");
      out.write("                            <li><a  href=\"signup.jsp\">Sign Up page for Students</a><br></li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a href=\"about us.jsp\">About us</a></li>\n");
      out.write("                                    <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                                    <li><a href=\"contact us.jsp\">Contact us</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div><!-- /.navbar-collapse -->\n");
      out.write("                </div><!-- /.container-fluid -->\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"upload.jsp\" method=\"get\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <label class=\"input-group-btn\">\n");
      out.write("                        <span class=\"btn btn-primary\">\n");
      out.write("                            Browse&hellip; <input type=\"file\" style=\"display: none;\" multiple>\n");
      out.write("                        </span>\n");
      out.write("                    </label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"getfile\" readonly>\n");
      out.write("                </div><br><br>\n");
      out.write("                <select id=\"course\" name=\"subpart\" onchange=\"myFunction()\">\n");
      out.write("                    <option value=\"\">--Select streams--</option>\n");
      out.write("                    <option value=\"CSE(B.TECH)\">CSE(B.TECH)</option>\n");
      out.write("                    <option value=\"ME(B.TECH)\">ME(B.TECH)</option>\n");
      out.write("                    <option value=\"ECE(B.TECH)\">ECE(B.TECH)</option>\n");
      out.write("                    <option value=\"CE(B.TECH)\">CE(B.TECH)</option>\n");
      out.write("                    <option value=\"EE(B.TECH)\">EE(B.TECH)</option>\n");
      out.write("                    <option value=\"CSE(M.TECH)\">CSE(M.TECH)</option>\n");
      out.write("                    <option value=\"ME(M.TECH)\">ME(M.TECH)</option>\n");
      out.write("                    <option value=\"ECE(M.TECH)\">ECE(M.TECH)</option>\n");
      out.write("                    <option value=\"BBA\">BBA</option>\n");
      out.write("                    <option value=\"MBA\">MBA</option>\n");
      out.write("                </select>\n");
      out.write("                <select id=\"subparts\" name=\"subpart1\">\n");
      out.write("                    <option value=\"\">--Select semester--</option>\n");
      out.write("                </select>\n");
      out.write("                <input type=\"submit\" name=\"btn_upload\" class=\"btn btn-default\" value=\"Upload file\"><br><br>\n");
      out.write("                <a href=\"studentrecord.jsp\"><button type=\"button\" class=\"btn btn-info\">Student Info</button></a><br><br><br>\n");
      out.write("                <a href=\"subjectrecord.jsp\"><button type=\"button\" class=\"btn btn-info\">Subjects Info</button></a><br><br><br>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            function myFunction()\n");
      out.write("            {\n");
      out.write("                var s1 = [\"1\", \"2\", \"3\", \"4\", \"5\", \"6\", \"7\", \"8\"];\n");
      out.write("                var ab = document.getElementById(\"course\").value;\n");
      out.write("                if (ab == \"CSE(B.TECH)\" || ab == \"ME(B.TECH)\" || ab == \"ECE(B.TECH)\" || ab == \"CE(B.TECH)\" || ab == \"EE(B.TECH)\")\n");
      out.write("                {\n");
      out.write("                    var i = 7;\n");
      out.write("                    var save = document.getElementById(\"subparts\").options.length;\n");
      out.write("                    for (save; save > 0; save--)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"subparts\").options.remove(save);\n");
      out.write("                    }\n");
      out.write("                    for (j = 0; j <= i; j++)\n");
      out.write("                    {\n");
      out.write("                        var ba = document.createElement(\"option\");\n");
      out.write("                        ba.innerHTML = \"Semester \" + s1[j];\n");
      out.write("                        document.getElementById(\"subparts\").add(ba);\n");
      out.write("                    }\n");
      out.write("                } else if (ab == \"CSE(M.TECH)\" || ab == \"ME(M.TECH)\" || ab == \"ECE(M.TECH)\" || ab == \"MBA\")\n");
      out.write("                {\n");
      out.write("                    var i = 3;\n");
      out.write("                    var save = document.getElementById(\"subparts\").options.length;\n");
      out.write("                    for (save; save > 0; save--)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"subparts\").options.remove(save);\n");
      out.write("                    }\n");
      out.write("                    for (j = 0; j <= i; j++)\n");
      out.write("                    {\n");
      out.write("                        var ba = document.createElement(\"option\");\n");
      out.write("                        ba.innerHTML = \"Semester \" + s1[j];\n");
      out.write("                        document.getElementById(\"subparts\").add(ba);\n");
      out.write("                    }\n");
      out.write("                } else if (ab == \"BBA\")\n");
      out.write("                {\n");
      out.write("                    var i = 5;\n");
      out.write("                    var save = document.getElementById(\"subparts\").options.length;\n");
      out.write("                    for (save; save > 0; save--)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"subparts\").options.remove(save);\n");
      out.write("                    }\n");
      out.write("                    for (j = 0; j <= i; j++)\n");
      out.write("                    {\n");
      out.write("                        var ba = document.createElement(\"option\");\n");
      out.write("                        ba.innerHTML = \"Semester \" + s1[j];\n");
      out.write("                        document.getElementById(\"subparts\").add(ba);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            $(function () {\n");
      out.write("\n");
      out.write("                // We can attach the `fileselect` event to all file inputs on the page\n");
      out.write("                $(document).on('change', ':file', function () {\n");
      out.write("                    var input = $(this),\n");
      out.write("                            numFiles = input.get(0).files ? input.get(0).files.length : 1,\n");
      out.write("                            label = input.val().replace(/\\\\/g, '/').replace(/.*\\//, '');\n");
      out.write("                    input.trigger('fileselect', [numFiles, label]);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                // We can watch for our custom `fileselect` event like this\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    $(':file').on('fileselect', function (event, numFiles, label) {\n");
      out.write("\n");
      out.write("                        var input = $(this).parents('.input-group').find(':text'),\n");
      out.write("                                log = numFiles > 1 ? numFiles + ' files selected' : label;\n");
      out.write("\n");
      out.write("                        if (input.length) {\n");
      out.write("                            input.val(log);\n");
      out.write("                        } else {\n");
      out.write("                            if (log)\n");
      out.write("                                alert(log);\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"navbar navbar-inverse navbar-fixed-bottom\" role=\"navigation\">\n");
      out.write("                <ul class=\"nav nav-pills pull-right\">\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"about us.jsp\">About Us</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"contact us.jsp\">Home</a></li>\n");
      out.write("                    <li role=\" presentation \"><a class=\"b1 edit5\" href=\"# \">Privacy</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Advertising</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Cookies</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Ad Choices</a></li>\n");
      out.write("                </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
