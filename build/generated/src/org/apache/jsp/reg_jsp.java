package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <center><body background = \"pic1.jpg\">\n");
      out.write("        \n");
      out.write("        <form action=\"/Pract/regser.jsp\" method=\"post\">\n");
      out.write("            <h1>Welcome to Registration</h1><br/><br/><br/><br/><br/><br/><br/><br/>\n");
      out.write("            \n");
      out.write("            UserName :  <input type=\"text\" name=\"username\" required/> <br/> <br/>\n");
      out.write("        Password : <input type=\"password\" name=\"password\" /><br/><br/>\n");
      out.write("        Name     : <input type=\"text\" name=\"name\" required/><br/><br/>\n");
      out.write("        Phone    : <input type=\"number\" name=\"phone\" ><br/><br/> \n");
      out.write("        Age    : <input type=\"number\" name=\"age\" ><br/><br/>\n");
      out.write("        Sex:    \n");
      out.write("        <input type=\"radio\" name=\"gender\" value=\"male\" required> Male\n");
      out.write("        <input type=\"radio\" name=\"gender\" value=\"female\" required> Female\n");
      out.write("        <input type=\"radio\" name=\"gender\" value=\"other\" required> Other<br/><br/>\n");
      out.write("        \n");
      out.write("               \n");
      out.write("       \n");
      out.write("\n");
      out.write("            \n");
      out.write("         \n");
      out.write("             \n");
      out.write("                <input type='Submit' value='Submit'/>\n");
      out.write("        </form>\n");
      out.write("   \n");
      out.write("   </center> </body>\n");
      out.write("     </html> ");
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
