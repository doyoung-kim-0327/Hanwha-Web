/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.24
 * Generated at: 2019-09-03 02:13:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/workspace-sts-3.9.8.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/studyBoard/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1566965615224L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Home</title>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<link\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("/* BASIC */\n");
      out.write("\n");
      out.write("html {\n");
      out.write("  background-color: #56baed;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  font-family: \"Poppins\", sans-serif;\n");
      out.write("  height: 100vh;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("  color: #92badd;\n");
      out.write("  display:inline-block;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-weight: 400;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("  text-align: center;\n");
      out.write("  font-size: 16px;\n");
      out.write("  font-weight: 600;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  display:inline-block;\n");
      out.write("  margin: 40px 8px 10px 8px; \n");
      out.write("  color: #cccccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* STRUCTURE */\n");
      out.write("\n");
      out.write(".wrapper {\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  flex-direction: column; \n");
      out.write("  justify-content: center;\n");
      out.write("  width: 100%;\n");
      out.write("  min-height: 100%;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#formContent {\n");
      out.write("  -webkit-border-radius: 10px 10px 10px 10px;\n");
      out.write("  border-radius: 10px 10px 10px 10px;\n");
      out.write("  background: #fff;\n");
      out.write("  padding: 30px;\n");
      out.write("  width: 90%;\n");
      out.write("  max-width: 450px;\n");
      out.write("  position: relative;\n");
      out.write("  padding: 0px;\n");
      out.write("  -webkit-box-shadow: 0 30px 60px 0 rgba(0,0,0,0.3);\n");
      out.write("  box-shadow: 0 30px 60px 0 rgba(0,0,0,0.3);\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#formFooter {\n");
      out.write("  background-color: #f6f6f6;\n");
      out.write("  border-top: 1px solid #dce8f1;\n");
      out.write("  padding: 25px;\n");
      out.write("  text-align: center;\n");
      out.write("  -webkit-border-radius: 0 0 10px 10px;\n");
      out.write("  border-radius: 0 0 10px 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* TABS */\n");
      out.write("\n");
      out.write("h2.inactive {\n");
      out.write("  color: #cccccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2.active {\n");
      out.write("  color: #0d0d0d;\n");
      out.write("  border-bottom: 2px solid #5fbae9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* FORM TYPOGRAPHY*/\n");
      out.write("\n");
      out.write("input[type=button], input[type=submit], input[type=reset]  {\n");
      out.write("  background-color: #56baed;\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 15px 80px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  font-size: 13px;\n");
      out.write("  -webkit-box-shadow: 0 10px 30px 0 rgba(95,186,233,0.4);\n");
      out.write("  box-shadow: 0 10px 30px 0 rgba(95,186,233,0.4);\n");
      out.write("  -webkit-border-radius: 5px 5px 5px 5px;\n");
      out.write("  border-radius: 5px 5px 5px 5px;\n");
      out.write("  margin: 5px 20px 40px 20px;\n");
      out.write("  -webkit-transition: all 0.3s ease-in-out;\n");
      out.write("  -moz-transition: all 0.3s ease-in-out;\n");
      out.write("  -ms-transition: all 0.3s ease-in-out;\n");
      out.write("  -o-transition: all 0.3s ease-in-out;\n");
      out.write("  transition: all 0.3s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=button]:hover, input[type=submit]:hover, input[type=reset]:hover  {\n");
      out.write("  background-color: #39ace7;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=button]:active, input[type=submit]:active, input[type=reset]:active  {\n");
      out.write("  -moz-transform: scale(0.95);\n");
      out.write("  -webkit-transform: scale(0.95);\n");
      out.write("  -o-transform: scale(0.95);\n");
      out.write("  -ms-transform: scale(0.95);\n");
      out.write("  transform: scale(0.95);\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("  background-color: #f6f6f6;\n");
      out.write("  border: none;\n");
      out.write("  color: #0d0d0d;\n");
      out.write("  padding: 15px 32px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 5px;\n");
      out.write("  width: 85%;\n");
      out.write("  border: 2px solid #f6f6f6;\n");
      out.write("  -webkit-transition: all 0.5s ease-in-out;\n");
      out.write("  -moz-transition: all 0.5s ease-in-out;\n");
      out.write("  -ms-transition: all 0.5s ease-in-out;\n");
      out.write("  -o-transition: all 0.5s ease-in-out;\n");
      out.write("  transition: all 0.5s ease-in-out;\n");
      out.write("  -webkit-border-radius: 5px 5px 5px 5px;\n");
      out.write("  border-radius: 5px 5px 5px 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text]:focus {\n");
      out.write("  background-color: #fff;\n");
      out.write("  border-bottom: 2px solid #5fbae9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text]:placeholder {\n");
      out.write("  color: #cccccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* ANIMATIONS */\n");
      out.write("\n");
      out.write("/* Simple CSS3 Fade-in-down Animation */\n");
      out.write(".fadeInDown {\n");
      out.write("  -webkit-animation-name: fadeInDown;\n");
      out.write("  animation-name: fadeInDown;\n");
      out.write("  -webkit-animation-duration: 1s;\n");
      out.write("  animation-duration: 1s;\n");
      out.write("  -webkit-animation-fill-mode: both;\n");
      out.write("  animation-fill-mode: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes fadeInDown {\n");
      out.write("  0% {\n");
      out.write("    opacity: 0;\n");
      out.write("    -webkit-transform: translate3d(0, -100%, 0);\n");
      out.write("    transform: translate3d(0, -100%, 0);\n");
      out.write("  }\n");
      out.write("  100% {\n");
      out.write("    opacity: 1;\n");
      out.write("    -webkit-transform: none;\n");
      out.write("    transform: none;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes fadeInDown {\n");
      out.write("  0% {\n");
      out.write("    opacity: 0;\n");
      out.write("    -webkit-transform: translate3d(0, -100%, 0);\n");
      out.write("    transform: translate3d(0, -100%, 0);\n");
      out.write("  }\n");
      out.write("  100% {\n");
      out.write("    opacity: 1;\n");
      out.write("    -webkit-transform: none;\n");
      out.write("    transform: none;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Simple CSS3 Fade-in Animation */\n");
      out.write("@-webkit-keyframes fadeIn { from { opacity:0; } to { opacity:1; } }\n");
      out.write("@-moz-keyframes fadeIn { from { opacity:0; } to { opacity:1; } }\n");
      out.write("@keyframes fadeIn { from { opacity:0; } to { opacity:1; } }\n");
      out.write("\n");
      out.write(".fadeIn {\n");
      out.write("  opacity:0;\n");
      out.write("  -webkit-animation:fadeIn ease-in 1;\n");
      out.write("  -moz-animation:fadeIn ease-in 1;\n");
      out.write("  animation:fadeIn ease-in 1;\n");
      out.write("\n");
      out.write("  -webkit-animation-fill-mode:forwards;\n");
      out.write("  -moz-animation-fill-mode:forwards;\n");
      out.write("  animation-fill-mode:forwards;\n");
      out.write("\n");
      out.write("  -webkit-animation-duration:1s;\n");
      out.write("  -moz-animation-duration:1s;\n");
      out.write("  animation-duration:1s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fadeIn.first {\n");
      out.write("  -webkit-animation-delay: 0.4s;\n");
      out.write("  -moz-animation-delay: 0.4s;\n");
      out.write("  animation-delay: 0.4s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fadeIn.second {\n");
      out.write("  -webkit-animation-delay: 0.6s;\n");
      out.write("  -moz-animation-delay: 0.6s;\n");
      out.write("  animation-delay: 0.6s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fadeIn.third {\n");
      out.write("  -webkit-animation-delay: 0.8s;\n");
      out.write("  -moz-animation-delay: 0.8s;\n");
      out.write("  animation-delay: 0.8s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fadeIn.fourth {\n");
      out.write("  -webkit-animation-delay: 1s;\n");
      out.write("  -moz-animation-delay: 1s;\n");
      out.write("  animation-delay: 1s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Simple CSS3 Fade-in Animation */\n");
      out.write(".underlineHover:after {\n");
      out.write("  display: block;\n");
      out.write("  left: 0;\n");
      out.write("  bottom: -10px;\n");
      out.write("  width: 0;\n");
      out.write("  height: 2px;\n");
      out.write("  background-color: #56baed;\n");
      out.write("  content: \"\";\n");
      out.write("  transition: width 0.2s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".underlineHover:hover {\n");
      out.write("  color: #0d0d0d;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".underlineHover:hover:after{\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* OTHERS */\n");
      out.write("\n");
      out.write("*:focus {\n");
      out.write("    outline: none;\n");
      out.write("} \n");
      out.write("\n");
      out.write("#icon {\n");
      out.write("  width:60%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*my css*/\n");
      out.write(".errmsg {\n");
      out.write("\tdisplay: none;\n");
      out.write("\tcolor: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"wrapper fadeInDown\">\n");
      out.write("\t<div id=\"formContent\">\n");
      out.write("\n");
      out.write("\t\t<!-- Login Form -->\n");
      out.write("\t\t<form action=\"login\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t<input type=\"text\" id=\"mid\" class=\"fadeIn second\" name=\"mid\" placeholder=\"ID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mem.mid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("\t\t\t<input type=\"password\" id=\"password\" class=\"fadeIn third\" name=\"pw\" placeholder=\"Password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mem.pw }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("\t\t\t<p class=\"errmsg\" id=\"noaccount\">계정을 찾을 수 없습니다. ID와 Password를 확인해주세요.</p>\n");
      out.write("\t\t\t<p class=\"errmsg\" id=\"wrongpw\">Password가 잘못되었습니다.</p>\n");
      out.write("\t\t\t<input type=\"submit\" class=\"fadeIn fourth\" value=\"LogIn\">\n");
      out.write("\t\t</form>\n");
      out.write("\n");
      out.write("\t\t<div id=\"formFooter\">\n");
      out.write("\t\t\t<a class=\"underlineHover\" href=\"join\">Join</a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
