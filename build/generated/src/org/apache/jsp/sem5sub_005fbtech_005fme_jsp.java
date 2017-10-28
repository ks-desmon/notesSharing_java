package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sem5sub_005fbtech_005fme_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Subjects</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: navajowhite; margin: 0;\">\n");
      out.write("        <div>\n");
      out.write("            <div style=\"padding-top: 20px; padding-bottom: 20px; padding-left: 60px; background-color: peru; height: 100%\">\n");
      out.write("                <font size=\"8\">Subjects & their study material.</font>\n");
      out.write("                <form action=\"view_edit_info.jsp\" method=\"get\">\n");
      out.write("                        <input  type=\"submit\" value=\"");
      out.print( session.getAttribute("name"));
      out.write("\" name=\"pass\"</input>\n");
      out.write("                        </form>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"padding-top: 60px; padding-left: 120px; padding-right: 120px; background-color: navajowhite; height: 100%\">\n");
      out.write("                <div style=\"background-color: peru; padding: 10px;\" id=\"first\"><font size=\"4\">MATHS - 1</font></div>\n");
      out.write("                <div style=\"background-color: navajowhite; padding: 10px;\" id=\"second\"><font size=\"4\">PHYSICS - 1</font></div>\n");
      out.write("                                <div style=\"background-color: peru; padding: 10px;\"><font size=\"4\">CHEMISTRY - 1</font></div>\n");
      out.write("                                <div style=\"background-color: navajowhite; padding: 10px;\"><font size=\"4\">ET</font></div>\n");
      out.write("                                <div style=\"background-color: peru; padding: 10px;\"><font size=\"4\">EGD</font></div>\n");
      out.write("                                <div style=\"background-color: navajowhite; padding: 10px;\"><font size=\"4\">ENGLISH</font></div>\n");
      out.write("                                <div style=\"background-color: peru; padding: 10px;\"><font size=\"4\">EVS</font></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
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
