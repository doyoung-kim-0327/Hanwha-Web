/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.24
 * Generated at: 2019-09-05 05:15:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editpost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/navbar.jsp", Long.valueOf(1567660310163L));
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
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Edit post</title>\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>Resume - Start Bootstrap Theme</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link href=\"resources/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom fonts for this template -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Saira+Extra+Condensed:500,700\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Muli:400,400i,800,800i\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"resources/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"resources/css/resume.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.ckeditor.com/ckeditor5/12.4.0/classic/ckeditor.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".head-div {\r\n");
      out.write("\tpadding-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".heading {\r\n");
      out.write("\tpadding-top: 30px;\r\n");
      out.write("\tpadding-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".word-box {\r\n");
      out.write("\twidth: 80% !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".edit-btn{\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn {\r\n");
      out.write("\tbackground-color: rgb(189, 93, 56) !important;\r\n");
      out.write("\tborder-color: rgb(189, 93, 56) !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link href=\"resources/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom fonts for this template -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Saira+Extra+Condensed:500,700\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Muli:400,400i,800,800i\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"resources/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"resources/css/resume.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary fixed-top\" id=\"sideNav\">\r\n");
      out.write("    <a class=\"navbar-brand js-scroll-trigger\" href=\"\">\r\n");
      out.write("      <span class=\"d-block d-lg-none\">Clarence Taylor</span>\r\n");
      out.write("      <span class=\"d-none d-lg-block\">\r\n");
      out.write("        <img class=\"img-fluid img-profile rounded-circle mx-auto mb-2\" src=\"resources/img/profile-.jpg\" alt=\"\">\r\n");
      out.write("      </span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("      <ul class=\"navbar-nav\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a id=\"greetings\" class=\"nav-link js-scroll-trigger\" href=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mem.mname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("님의 공부방</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link js-scroll-trigger\" href=\"mypage\">글 목록</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link js-scroll-trigger\" href=\"qnaboard\">Q&A 게시판</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link js-scroll-trigger\" href=\"logout\">LogOut</a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid p-0\">\r\n");
      out.write("\r\n");
      out.write("\t\t<section class=\"resume-section p-3 p-lg-5 d-flex justify-content-center\" id=\"experience\">\r\n");
      out.write("\t\t\t<div class=\"word-box\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"heading\">\r\n");
      out.write("\t\t\t\t<h3>게시물 수정</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form action=\"editpost\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"pid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.pid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"pdate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.pdate }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<label for=\"title\">제목</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"ptitle\" id=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.ptitle }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t<label for=\"content\">내용</label>\r\n");
      out.write("\t\t\t\t\t<textarea class=\"form-control\" rows=\"10\" name=\"pcontent\" id=\"pcontent\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.pcontent }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"poster\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.poster }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"edit-btn\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"수정\"  class=\"btn btn-info\">\r\n");
      out.write("\t\t\t\t\t<a href=\"mypage\" class=\"btn btn-info\" role=\"button\">취소</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<hr class=\"m-0\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/ckeditor.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
