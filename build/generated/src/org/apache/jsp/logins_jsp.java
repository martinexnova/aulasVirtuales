package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logins_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Documento sin t&iacute;tulo</title>\n");
      out.write("<script src=\"js/jquery-2.1.4.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"bootstrap/bootstrap.min.css\" rel=\"stylesheet\"/>    \n");
      out.write("<link href=\"bootstrap/bootstrap-theme.css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"css/normalize.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/estilos.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/paraiconos.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"fonts/OleoScript-Regular.ttf\" rel=\"stylesheet\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/paraicono.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"alertaschidas/sweetalert.css\"/>\n");
      out.write("<script src=\"alertaschidas/sweetalert-dev.js\"></script>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("@font-face{\n");
      out.write("font-family:Fuentechida;\n");
      out.write("src:url(fonts/OleoScript-Regular.ttf);\n");
      out.write("}\n");
      out.write("    body{\n");
      out.write("        background-image: url(images/estudiantes.jpg);\n");
      out.write("        background-size:cover;\n");
      out.write("        background-repeat: no-repeat;\n");
      out.write("        background-attachment:fixed;\n");
      out.write("    }\n");
      out.write("    .formulario{\n");
      out.write("        transition: 2s;\n");
      out.write("        margin-top: 100px;\n");
      out.write("        width: 30%;\n");
      out.write("        box-shadow: 0px 0px 40px rgba(213,0,0 ,1),0px 0px 80px rgba(256,256,256 ,1);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .formulario:hover{\n");
      out.write("        transition: .8s;\n");
      out.write("        background-color: rgba(0,0,0,.5);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write(".logo{\n");
      out.write("        height: 85px;\n");
      out.write("        margin-top: 40px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write(" .espaciado{\n");
      out.write("        margin-top: 40px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    fieldset{\n");
      out.write("        transition: 2s;\n");
      out.write("        margin-bottom: 50px;\n");
      out.write("        border-color: rgba(213,0,0 ,1);\n");
      out.write("        border-style: groove;\n");
      out.write("        border-width: 5px;\n");
      out.write("        border-radius: 20px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("   h3,h4{\n");
      out.write("        \n");
      out.write("        color:white;\n");
      out.write("        text-align: center;\n");
      out.write("        font-family: fuentechida;\n");
      out.write("    }\n");
      out.write("  \n");
      out.write("    .Input{\n");
      out.write("        transition: .8s;\n");
      out.write("        background-color: rgba(0,0,0,.5);\n");
      out.write("        color: white;\n");
      out.write("        border-color:#006;\n");
      out.write("\tborder-bottom-color:white;\n");
      out.write("        border-bottom-style:groove;\n");
      out.write("\tborder-left:none;\n");
      out.write("\tborder-right:none;\n");
      out.write("\tborder-top:none;\n");
      out.write("        border-width: 4px;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .Input:hover{\n");
      out.write("        transition: .8s;\n");
      out.write("\tbackground-color:rgba(55,71,79 ,.5);\n");
      out.write("\tbox-shadow:inset;\n");
      out.write("        border-bottom-color:red;\n");
      out.write("\t}\n");
      out.write("    \n");
      out.write("    .Input:focus{\n");
      out.write("        transition: .8s;\n");
      out.write("\tborder-bottom-color:red;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    @media screen and (max-width:750px) {\n");
      out.write("        \n");
      out.write("        .logo{\n");
      out.write("            height: 50px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .formulario{\n");
      out.write("            transition: 2s;\n");
      out.write("            width: 95%;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container formulario\">\n");
      out.write("         <div class=\"row\">\n");
      out.write("               <div class=\"col-xs-4 col-xs-offset-4  \">\n");
      out.write("                <img src=\"images/virtual.png\" class=\"logo center-block\">\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("         <div class=\" espaciado\">\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <fieldset class=\"col-xs-10 col-xs-offset-1\">\n");
      out.write("            \n");
      out.write("\n");
      out.write("                <legend class=\"hidden-xs\">\n");
      out.write("                    <h3>inicio de sesi&oacute;n</h3>\n");
      out.write("                </legend>\n");
      out.write("                \n");
      out.write("                <form role=\"form\"  action=\"loginc\" method=\"post\"  class=\"form-horizontal\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-xs-12\" for=\"usuario\"><h4>Usuario</h4></label>\n");
      out.write("                 <div class=\"col-xs-10 col-xs-offset-1\">\n");
      out.write("                        \n");
      out.write("                     <input type=\"text\" name=\"usuario\"  id=\"usuario\" class=\"form-control Input\">\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-xs-12\" for=\"password\"><h4>Password</h4></label>\n");
      out.write("                 <div class=\"col-xs-10 col-xs-offset-1\">\n");
      out.write("                     <input type=\"password\" id=\"password\"  name=\"password\" class=\"form-control col-xs-12 Input\">\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-danger center-block\">Aceptar</button>\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("                 \n");
      out.write("                </form>\n");
      out.write("            </fieldset>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("</body>\n");
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
