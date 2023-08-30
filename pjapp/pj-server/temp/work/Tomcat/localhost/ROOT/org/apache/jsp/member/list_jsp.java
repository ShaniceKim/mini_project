/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-08-28 01:35:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import bitcamp.myapp.vo.Member;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("bitcamp.myapp.vo.Member");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      bitcamp.myapp.dao.MemberDao memberDao = null;
      synchronized (application) {
        memberDao = (bitcamp.myapp.dao.MemberDao) _jspx_page_context.getAttribute("memberDao", javax.servlet.jsp.PageContext.APPLICATION_SCOPE);
        if (memberDao == null){
          throw new java.lang.InstantiationException("bean memberDao not found within scope");
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset='UTF-8'>\n");
      out.write("<title>회원</title>\n");
      out.write("<style>\n");
      out.write("  /* 추가된 스타일 */\n");
      out.write("  table {\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    overflow: hidden;\n");
      out.write("    width: 100%;\n");
      out.write("    margin: auto;\n");
      out.write("  }\n");
      out.write("  th, td {\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    text-align: left;\n");
      out.write("    border-bottom: 1px solid #ddd;\n");
      out.write("    font-size: 14px; /* 글씨 크기 조정 */\n");
      out.write("    font-weight: normal; /* 글씨 굵기 조정 */\n");
      out.write("  }\n");
      out.write("  th {\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("  }\n");
      out.write("  tr:hover {\n");
      out.write("    background-color: #f5f5f5;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"display: flex; justify-content: center; align-items: center; height: calc(100vh - 100px); margin-bottom: 50px;\">\n");
      out.write("  <div style=\"border: 4px solid #01BF86; padding: 20px; border-radius: 20px;\">\n");
      out.write("    <h2 style=\"text-align: center;\">회원 목록</h2>\n");
      out.write("    <table>\n");
      out.write("      <thead>\n");
      out.write("        <!-- 글씨 크기와 굵기를 조정한 부분 -->\n");
      out.write("        <tr><th style=\"font-size: 12px; font-weight: normal;\">번호</th> <th style=\"font-size: 12px; font-weight: normal;\">이름</th> <th style=\"font-size: 12px; font-weight: normal;\">이메일</th></tr>\n");
      out.write("      </thead>\n");
      out.write("\n");
      out.write("      ");

          List<Member> list = memberDao.findAll();
          for (Member member : list) {
            pageContext.setAttribute("member", member);
      
      out.write("\n");
      out.write("          <tr>\n");
      out.write("              <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("              <td>\n");
      out.write("                  <img src='http://mvsenqskbqzl19010704.cdn.ntruss.com/member/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.photo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("?type=f&w=30&h=40&faceopt=true&ttype=jpg'>\n");
      out.write("                  <a href='/member/detail.jsp?no=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('\'');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a></td>\n");
      out.write("              <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("\n");
      out.write("      ");

          }
      
      out.write("\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, false);
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
