package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bin.*;

public final class adminedit_005frecord_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    int rollno = Integer.parseInt(request.getParameter("edit"));
    service ser = new service();
    binclass binobj = ser.view_details_admin(rollno);

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign_in_teacher</title>\n");
      out.write("        <style>       \n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                margin-top: 50px;\n");
      out.write("                margin-left: 50px;\n");
      out.write("                height: 100%;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            input\n");
      out.write("            {\n");
      out.write("                margin :5px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("            .navbar{\n");
      out.write("                background-color: #AE94F5;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("<body style=\"margin:0px; background-color: wheat\">\n");
      out.write("    <h1>Student Info</h1>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form action=\"controler_signup.jsp\" method=\"get\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>First Name</b></td>\n");
      out.write("                    <td><input type=\"text\"class=\"form-control\" name=\"fname\" id=\"name\" required=\"enter First name\" value=\"");
      out.print(binobj.getFname());
      out.write("\"></input></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Last Name</b></td>\n");
      out.write("                    <td><input type=\"text\"class=\"form-control\" name=\"lname\"  required= \"enter last name\" value=\"");
      out.print(binobj.getLname());
      out.write("\"></input></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Email</b></td>\n");
      out.write("                    <td><input type=\"email\"class=\"form-control\" name=\"userid\" required=\"enter email\" value=\"");
      out.print(binobj.getUserid());
      out.write("\"></input></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>roll_no</b></td>\n");
      out.write("                    <td><input type=\"number\" class=\"form-control\"name=\"rollno\" required=\" enter address\" value=\"");
      out.print(binobj.getRollno());
      out.write("\"></input></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"submit\" value=\"submit\" class=\"btn btn-default\" name=\"update\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("                <div class=\"footer\">\n");
      out.write("            <div class=\"navbar navbar-inverse navbar-fixed-bottom\" role=\"navigation\">\n");
      out.write("                <ul class=\"nav nav-pills pull-right\">\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">About Us</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Home</a></li>\n");
      out.write("                    <li role=\" presentation \"><a class=\"b1 edit5\" href=\"# \">Privacy</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Advertising</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Cookies</a></li>\n");
      out.write("                    <li role=\"presentation \"><a class=\"b1 edit5\" href=\"# \">Ad Choices</a></li>\n");
      out.write("                </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("</body>\n");
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
