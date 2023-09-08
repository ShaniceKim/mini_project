/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-09-07 11:21:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("<link rel=\"icon\" href=\" \">\n");
      out.write("<title>BitSalon</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap core CSS -->\n");
      out.write("<link href=\"/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom styles for this template -->\n");
      out.write("<link href=\"/css/custom.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Page Loader -->\n");
      out.write("<link href=\"/css/loaders.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Font Awesome Style -->\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("<body style=\" background-image: url('/images/salon.png'); background-size: cover;\">\n");
      out.write("<div class=\"loader loader-bg\">\n");
      out.write("  <div class=\"loader-inner line-scale\">\n");
      out.write("    <div></div>\n");
      out.write("    <div></div>\n");
      out.write("    <div></div>\n");
      out.write("    <div></div>\n");
      out.write("    <div></div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Top Navigation\n");
      out.write("    ================================================== -->\n");
      out.write("<nav class=\"navbar top-bar navbar-static-top sps sps--abv\">\n");
      out.write("  <div class=\"container relative-box \"> <a class=\"navbar-brand\" href=\"#\">BitSalon</a>\n");
      out.write("    <button class=\"navbar-toggler hidden-lg-up collapsed\" type=\"button\" data-toggle=\"collapse\" data-target=\"#exCollapsingNavbar2\" aria-controls=\"exCollapsingNavbar2\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> ☰ </button>\n");
      out.write("    <div class=\"navbar-toggleable-md collapse\" id=\"exCollapsingNavbar2\" >\n");
      out.write("      <ul class=\"nav navbar-nav pull-xs-right\">\n");
      out.write("        <li class=\"nav-item\"> <a class=\"nav-link\" href='/admin/member/form'>회원가입</a></li>\n");
      out.write("\n");
      out.write("        ");
      bitcamp.myapp.vo.Member loginUser = null;
      synchronized (session) {
        loginUser = (bitcamp.myapp.vo.Member) _jspx_page_context.getAttribute("loginUser", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (loginUser == null){
          loginUser = new bitcamp.myapp.vo.Member();
          _jspx_page_context.setAttribute("loginUser", loginUser, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
 if (loginUser.getNo() == 0) { 
      out.write("\n");
      out.write("             <li class=\"nav-item\"> <a class=\"nav-link\" href='/app/auth/form'>로그인</a></li>\n");
      out.write("        ");
 } else {
             if (loginUser.getPhoto() == null) { 
      out.write("\n");
      out.write("               <img style='height:40px' src='/images/avatar.png'>\n");
      out.write("          ");
 } else { 
      out.write("\n");
      out.write("               <img src='http://mvsenqskbqzl19010704.cdn.ntruss.com/member/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.photo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("?type=f&w=30&h=40&faceopt=true&ttype=jpg'>\n");
      out.write("          ");
 } 
      out.write("\n");
      out.write("               ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" <a href='/app/auth/logout'>로그아웃</a>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("        <li class=\"nav-item\"> <a class=\"nav-link\" href='/admin/member/list'>회원</a></li>\n");
      out.write("        <li class=\"nav-item\"> <a class=\"nav-link\" href='/app/board/list?category=1'>후기</a></li>\n");
      out.write("        <li class=\"nav-item\"> <a class=\"nav-link\" href='/app/reserve/add'>예약</a></li>\n");
      out.write("        <li class=\"nav-item\"> <a class=\"nav-link\" href='/board/list?category=2'>Contact Us</a> </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<!-- Carousel\n");
      out.write("    ================================================== -->\n");
      out.write("<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("  <!-- Indicators -->\n");
      out.write("\n");
      out.write("  <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <div class=\"container d-flex h-100 align-items-center\"> <!-- Added container and flex classes -->\n");
      out.write("        <div class=\"carousel-caption bg-dark\"> <!-- Modified this line -->\n");
      out.write("          <h1>There Are No Secrets to Success</h1>\n");
      out.write("          <p>The man who will use his skill and constructive imagination to see how much he can give for a dollar, instead of how little he can give for a dollar, is bound to succeed.</p>\n");
      out.write("          <a class=\"btn btn-aqua btn-capsul\" href=\"#\" role=\"button\">Sign up today</a> </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"carousel-caption bg-dark\"> <!-- Modified this line -->\n");
      out.write("          <h1>Another example headline.</h1>\n");
      out.write("          <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("          <a class=\"btn btn-capsul btn-aqua\" href=\"#\" role=\"button\">Learn more</a> </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"carousel-caption bg-dark\"> <!-- Modified this line -->\n");
      out.write("          <h1>One more for good measure.</h1>\n");
      out.write("          <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("          <a class=\"btn btn-capsul btn-aqua\" href=\"#\" role=\"button\">Browse gallery</a> </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\"> <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span> <span class=\"sr-only\">Previous</span> </a> <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\"> <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span> <span class=\"sr-only\">Next</span> </a> </div>\n");
      out.write("<!-- /.carousel -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Marketing messaging and featurettes\n");
      out.write("    ================================================== -->\n");
      out.write("<!-- Wrap the rest of the page in another container to center all the content. -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("<!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js\" integrity=\"sha384-THPy051/pYDQGanwU6poAc/hOdQxjnOEXzbT+OuUAFqNqFjL+4IGLBgCJC3ZOShY\" crossorigin=\"anonymous\"></script> \n");
      out.write("<script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery.min.js\"><\\/script>')</script> \n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/tether/1.2.0/js/tether.min.js\" integrity=\"sha384-Plbmg8JY28KFelvJVai01l8WyZzrYWG825m+cZ0eDDS1f7d/js6ikvy1+X+guPIB\" crossorigin=\"anonymous\"></script> \n");
      out.write("<script src=\"/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"/js/scrollPosStyler.js\"></script>\n");
      out.write("<script src=\"/js/core.js\"></script>\n");
      out.write("<!-- IE10 viewport hack for Surface/desktop Windows 8 bug --> \n");
      out.write("<script src=\"../../assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
