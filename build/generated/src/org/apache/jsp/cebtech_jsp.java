package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cebtech_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            .navbar{\n");
      out.write("                background-color: #AE94F5;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"img4.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>CE B.Tech</title>\n");
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
      out.write("        <font size=\"10\" style=\"margin-left:210px;\"><b>Civil Engineering (CE)</b></font>\n");
      out.write("        <table style=\"border:0; margin-left: 280px; margin-top: 50px;\">\n");
      out.write("            <tr style=\"background-color: peru\">\n");
      out.write("                <th><font size=\"6\" style=\"padding: 10px;\">S.No.</font></th>\n");
      out.write("                <th><font size=\"6\" style=\"padding: 10px;\">Semesters</font></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>1.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"img.jsp?Id=Semester 1&id2=CE(B.TECH)\"><font color=\"black\">Semester 1</font></a></b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"background-color: peru\">\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>2.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"img.jsp?Id=Semester 2&id2=CE(B.TECH)\"><font color=\"black\">Semester 2</font></a></b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>3.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"img.jsp?Id=Semester 3&id2=CE(B.TECH)\"><font color=\"black\">Semester 3</font></a></b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"background-color: peru\">\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>4.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"img.jsp?Id=Semester 4&id2=CE(B.TECH)\"><font color=\"black\">Semester 4</font></a></b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>5.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"img.jsp?Id=Semester 5&id2=CE(B.TECH)\"><font color=\"black\">Semester 5</font></a></b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"background-color: peru\">\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>6.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"img.jsp?Id=Semester 6&id2=CE(B.TECH)\"><font color=\"black\">Semester 6</font></a></b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>7.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"img.jsp?Id=Semester 7&id2=CE(B.TECH)\"><font color=\"black\">Semester 7</font></a></b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"background-color: peru\">\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b>8.</b></td>\n");
      out.write("                <td align=\"center\" style=\"padding: 10px;\"><b><a href=\"img.jsp?Id=Semester 8&id2=CE(B.TECH)\"><font color=\"black\">Semester 8</font></a></b></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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
      out.write("    </body>\n");
      out.write("</html>\n");
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
