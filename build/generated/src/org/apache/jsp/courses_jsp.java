package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bin.*;

public final class courses_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <style>\n");
      out.write("    .navbar{\n");
      out.write("                background-color: #AE94F5;\n");
      out.write("    }\n");
      out.write("    body{\n");
      out.write("                background-image: url(\"img.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>Courses</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: navajowhite\">\n");
      out.write("        <div class=\"header\"> \n");
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
      out.write("                            <li><a  href=\"view_edit_info.jsp\" ><button name=\"btn_upload\" class=\"btn btn-default\">Edit</button></a></li>\n");
      out.write("                            <li><a href=\"logout.jsp\"><button name=\"btn_upload\" class=\"btn btn-default\">LogOut</button></a><br></li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a href=\"#\">About us</a></li>\n");
      out.write("                                    <li><a href=\"#\">Contact us</a></li>\n");
      out.write("                                    <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                                    <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div><!-- /.navbar-collapse -->\n");
      out.write("                </div><!-- /.container-fluid -->\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <font size=\"5\" style=\"margin-left:190px;\"><b>Courses Available</b></font>\n");
      out.write("        <p style=\"margin-left: 370px; margin-top: 30px;\"><font size=\"5\"><u>Bachelor of Technology (B.Tech)</u></font></p>\n");
      out.write("        <ul>\n");
      out.write("            <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"csebtech.jsp\">Computer Science Engineering (CSE)</a></li>\n");
      out.write("            <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"mebtech.jsp\">Mechanical Engineering (ME)</a></li>\n");
      out.write("            <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"ecebtech.jsp\">Electronics & Communication Engineering (ECE)</a></li>\n");
      out.write("            <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"cebtech.jsp\">Civil Engineering (CE)</a></li>\n");
      out.write("            <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"eebtech.jsp\">Electrical Engineering (EE)</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <p style=\"margin-left: 370px;\"><u><font size=\"5\">Master of Technology (M.Tech)</font></u></p>\n");
      out.write("        <ul>\n");
      out.write("            <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"csemtech.jsp\">Computer Science Engineering (CSE)</a></li>                \n");
      out.write("            <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"ecemtech.jsp\">Electronics & Communication Engineering (ECE)</a></li>                \n");
      out.write("            <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"memtech.jsp\">Mechanical Engineering (ME)</a></li>                \n");
      out.write("        </ul>\n");
      out.write("        <p style=\"margin-left: 370px;\"><u><font size=\"5\">Business Administration (BBA/MBA)</font></u></p>\n");
      out.write("        <ul>\n");
      out.write("            <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"bba.jsp\">Bachelor of Business Administration (BBA)</a></li>\n");
      out.write("            <li style=\"margin-left: 400px; margin-bottom: 10px;\"><a href=\"mba.jsp\">Master of Business Administration (MBA)</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("                    <div class=\"navbar navbar-inverse navbar-fixed-bottom\" role=\"navigation\">\n");
      out.write("                    <ul class=\"nav nav-pills pull-right\">\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">About Us</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Home</a></li>\n");
      out.write("                    <li role=\" presentation \"><a class=\"b1 edit5\" href=\"# \">Privacy</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Advertising</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Cookies</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Ad Choices</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </body>\n");
      out.write("</html>");
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
