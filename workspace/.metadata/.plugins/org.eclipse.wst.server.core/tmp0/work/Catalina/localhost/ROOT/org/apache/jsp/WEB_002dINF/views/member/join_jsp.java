/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-09-25 07:59:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/임베디드웹/project/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MovieProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/member/../includes/admin/header.jsp", Long.valueOf(1695623624559L));
    _jspx_dependants.put("/WEB-INF/views/member/../includes/admin/footer.jsp", Long.valueOf(1695623727426L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1690855704120L));
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>JOIN</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/resources/css/default.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/resources/css/header.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/resources/css/footer.css\" />\n");
      out.write("<script\n");
      out.write("  src=\"https://code.jquery.com/jquery-3.4.1.js\"\n");
      out.write("  integrity=\"sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=\"\n");
      out.write("  crossorigin=\"anonymous\"></script>\n");
      out.write("<style>\n");
      out.write(".first {\n");
      out.write("	margin-top: 50px;\n");
      out.write("	margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".con {\n");
      out.write("	display: inline-block;\n");
      out.write("	width: 100px;\n");
      out.write("}\n");
      out.write(".id{\n");
      out.write("	maggin: auto;\n");
      out.write("	\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    	<header>\r\n");
      out.write("		<div id=\"header_section\" class=\"header\">\r\n");
      out.write("			<h1 class=\"logo\">\r\n");
      out.write("				<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/main.do\"></a>\r\n");
      out.write("			</h1>\r\n");
      out.write("			<div class=\"gnb\">\r\n");
      out.write("				<ul class=\"menu1\">\r\n");
      out.write("					<li><a href=\"\"><img src=\"/resources/image/페이스북.png\"\r\n");
      out.write("							alt=\"페이스북로고\"></a></li>\r\n");
      out.write("					<li><a href=\"\" style=\"width: 35px\"><img\r\n");
      out.write("							src=\"/resources/image/유튜브-removebg-preview.png\" alt=\"유튜브로고\"></a></li>\r\n");
      out.write("					<li><a href=\"\"><img src=\"/resources/image/인스타그램.png\"\r\n");
      out.write("							alt=\"인스타그램로고\"></a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<ul class=\"menu2\">\r\n");
      out.write("					<li><a href=\"\">멤버십</a></li>\r\n");
      out.write("					<li><a href=\"\">고객센터</a></li>\r\n");
      out.write("					<li><a href=\"\">단체관람/대관문의</a></li>\r\n");
      out.write("					<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login.do\">로그인</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<ul class=\"menu3\">\r\n");
      out.write("					<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/join.do\">회원가입</a></li>\r\n");
      out.write("					<li><a href=\"\">바로예매</a></li>\r\n");
      out.write("					<li><a href=\"\"><img src=\"/resources/image/햄버거버튼.png\"></a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<div class=\"nav\">\r\n");
      out.write("					<ul class=\"submenu\">\r\n");
      out.write("						<li><a href=\"\">예매</a>\r\n");
      out.write("							<ul class=\"submenu1\">\r\n");
      out.write("								<li><a href=\"\">예매하기</a></li>\r\n");
      out.write("								<li><a href=\"\">상영시간표</a></li>\r\n");
      out.write("								<li><a href=\"\">할인안내</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li><a href=\"\">영화</a>\r\n");
      out.write("							<ul class=\"submenu2\">\r\n");
      out.write("								<li><a href=\"\">홈</a></li>\r\n");
      out.write("								<li><a href=\"\">현재상영작</a></li>\r\n");
      out.write("								<li><a href=\"\">상영예정작</a></li>\r\n");
      out.write("								<li><a href=\"\">아르떼</a></li>\r\n");
      out.write("								<li><a href=\"\">국립극장</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li><a href=\"\">영화관</a>\r\n");
      out.write("							<ul class=submenu3>\r\n");
      out.write("								<li><a href=\"\">스페셜관</a></li>\r\n");
      out.write("								<li><a href=\"\">서울</a></li>\r\n");
      out.write("								<li><a href=\"\">경기/인천</a></li>\r\n");
      out.write("								<li><a href=\"\">충청/대전</a></li>\r\n");
      out.write("								<li><a href=\"\">전라/광주</a></li>\r\n");
      out.write("								<li><a href=\"\">경상/대구</a></li>\r\n");
      out.write("								<li><a href=\"\">경상/부산/울산</a></li>\r\n");
      out.write("								<li><a href=\"\">강원</a></li>\r\n");
      out.write("								<li><a href=\"\">제주</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li><a href=\"\">이벤트</a>\r\n");
      out.write("							<ul class=\"submenu4\">\r\n");
      out.write("								<li><a href=\"\">홈</a></li>\r\n");
      out.write("								<li><a href=\"\">영화</a></li>\r\n");
      out.write("								<li><a href=\"\">시사회/무대인사</a></li>\r\n");
      out.write("								<li><a href=\"\">HOT</a></li>\r\n");
      out.write("								<li><a href=\"\">제휴할인</a></li>\r\n");
      out.write("								<li><a href=\"\">우리동네영화관</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li><a href=\"\">스토어</a>\r\n");
      out.write("							<ul class=\"submenu5\">\r\n");
      out.write("								<li><a href=\"\">베스트</a></li>\r\n");
      out.write("								<li><a href=\"\">관람권</a></li>\r\n");
      out.write("								<li><a href=\"\">스낵음료</a></li>\r\n");
      out.write("								<li><a href=\"\">포토카드</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li><a href=\"\"></a>\r\n");
      out.write("							<ul></ul></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("    ");
      out.write("\n");
      out.write("<form id=\"joinfrm\" name=\"joinfrm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/join.do\" method=\"post\">\n");
      out.write("    <div style=\"width: 900px; margin-left: 550px; margin-top: -40px;\">\n");
      out.write("        <h2 style=\"margin-top: 50px;\">회원가입</h2>\n");
      out.write("        <hr>\n");
      out.write("        <h1>회원가입을 위해 휴대폰 본인 인증해주세요.</h1>\n");
      out.write("\n");
      out.write("        <div class=\"first\">\n");
      out.write("            <strong>회원정보입력</strong>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <div class=\"id\">\n");
      out.write("            <label for=\"id\"><span class=\"con\">ID : </span></label>\n");
      out.write("            <input type=\"text\" name=\"id\">\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <label for=\"pw\"><span class=\"con\">PASSWORD : </span></label>\n");
      out.write("            <input type=\"password\" placeholder=\"********\" name=\"pw\">\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <div>\n");
      out.write("            <label for=\"pwck\"><span class=\"con\">PASSWORD 확인 : </span></label>\n");
      out.write("            <input type=\"password\" placeholder=\"********\" name=\"pw\">\n");
      out.write("        </div>\n");
      out.write("		<hr>\n");
      out.write("        <div>\n");
      out.write("            <label for=\"name\"><span class=\"con\">이름 : </span></label>\n");
      out.write("            <input type=\"text\" placeholder=\"한글 또는 영문\">\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <label for=\"birth\"><span class=\"con\">생년월일 : </span></label>\n");
      out.write("            <input type=\"text\" placeholder=\"생년월일 입력\">\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <label for=\"\"><span class=\"con\">성별 : </span></label>\n");
      out.write("            <input type=\"radio\" name=\"gender\" value=\"man\"> 남\n");
      out.write("            <input type=\"radio\" name=\"gender\" value=\"woman\"> 여\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <label for=\"phone\"><span class=\"con\">휴대폰번호 : </span></label>\n");
      out.write("            <div>\n");
      out.write("                <select name=\"통신사\">\n");
      out.write("                    <option value=\"SKT\">SKT</option>\n");
      out.write("                    <option value=\"KT\" selected>KT</option>\n");
      out.write("                    <option value=\"LG\">LG</option>\n");
      out.write("                </select>\n");
      out.write("                <select name=\"ph--ln\">\n");
      out.write("                    <option value=\"010\" selected>010</option>\n");
      out.write("                    <option value=\"011\">011</option>\n");
      out.write("                    <option value=\"018\">018</option>\n");
      out.write("                </select>\n");
      out.write("                <span> - </span>\n");
      out.write("                <input type=\"text\" pattern=\"[0-9]{3,4}\" required />\n");
      out.write("                <span> - </span>\n");
      out.write("                <input type=\"text\" pattern=\"[0-9]{4}\" required />\n");
      out.write("                <input type=\"button\" value=\"인증\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <div class=\"col\">\n");
      out.write("            <span class=\"con\">주소 : </span>\n");
      out.write("            <input type=\"text\" name=\"zipcode\" placeholder=\"우편번호를 입력하세요\">\n");
      out.write("            <button class=\"btn btn-secondary w-100\" onclick=\"searchZip()\">우편번호검색</button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <input type=\"text\" name=\"addr1\" placeholder=\"기본주소 입력\" class=\"form-control\" style=\"width:300px;\"/>\n");
      out.write("        <input type=\"text\" name=\"addr2\" placeholder=\"상세주소 입력\" class=\"form-control\" style=\"width:200px;\"/>\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <div style=\"display: flex; justify-content: center; margin-top: 40px;\">\n");
      out.write("            <input type=\"button\" style=\"background-color: red;\" value=\"취소\">\n");
      out.write("            <input type=\"submit\" value=\"회원가입\" style=\"margin-left: 5px;\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    	<footer>\r\n");
      out.write("		<div class=\"footer\">\r\n");
      out.write("			<div class=\"inner\">\r\n");
      out.write("				<span class=\"footerlogo\"> <img\r\n");
      out.write("					src=\"/resources/image/logo3.png\" alt=\"\">\r\n");
      out.write("				</span>\r\n");
      out.write("				<ul class=\"footermenu\">\r\n");
      out.write("					<li><a href=\"#\">이용약관</a></li>\r\n");
      out.write("					<li><a href=\"#\">개인정보처리방침</a></li>\r\n");
      out.write("					<li><a href=\"#\">이메일무단수집거부</a></li>\r\n");
      out.write("					<li><a href=\"#\">영상정보처리기기 운영 및 관리방침</a></li>\r\n");
      out.write("					<li><a href=\"#\">L.POINT회원안내</a></li>\r\n");
      out.write("					<li><a href=\"#\">배정기준</a></li>\r\n");
      out.write("					<li><a href=\"#\">채용안내</a></li>\r\n");
      out.write("					<li><a href=\"#\">광고/임대문의</a></li>\r\n");
      out.write("					<li><a href=\"#\">기업정보</a></li>\r\n");
      out.write("					<li><a href=\"#\">사회적책임</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<div class=\"address\">\r\n");
      out.write("					<address>서울특별시 송파구 올림픽로 300 롯데월드타워 27층</address>\r\n");
      out.write("					<span class=\"bar\">고객센터 1544-8855 (유료)</span><br> <span\r\n");
      out.write("						class=\"bar\">대표이사 4조</span> <span class=\"bar\">사업자등록번호\r\n");
      out.write("						111-11-11111</span> <span class=\"bar\">통신판매업신고번호 제1111호</span> <span\r\n");
      out.write("						class=\"bar\">개인정보보호책임자 4조</span>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p class=\"copyright\" style=\"font-size: 12px;\">COPYRIGHT LOTTE\r\n");
      out.write("					CINEMA ALL RIGHT RESERVED.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("    ");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\n");
      out.write("	\n");
      out.write("<script>\n");
      out.write("    function searchZip() {\n");
      out.write("        new daum.Postcode({\n");
      out.write("            oncomplete: function(data) {\n");
      out.write("                // 각 주소의 노출 규칙에 따라 주소를 조합\n");
      out.write("                var addr = '';\n");
      out.write("                var extraAddr = '';\n");
      out.write("\n");
      out.write("                if (data.userSelectedType === 'R') {\n");
      out.write("                    addr = data.roadAddress;\n");
      out.write("                } else {\n");
      out.write("                    addr = data.jibunAddress;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (data.userSelectedType === 'R') {\n");
      out.write("                    if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {\n");
      out.write("                        extraAddr += data.bname;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if (data.buildingName !== '' && data.apartment === 'Y') {\n");
      out.write("                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if (extraAddr !== '') {\n");
      out.write("                        extraAddr = ' (' + extraAddr + ')';\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    addr += extraAddr;\n");
      out.write("                } else {\n");
      out.write("                    addr += ' ';\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣기\n");
      out.write("                document.getElementsByName('zipcode')[0].value = data.zonecode;\n");
      out.write("                document.getElementsByName('addr1')[0].value = addr;\n");
      out.write("\n");
      out.write("                // 상세주소 입력란 활성화\n");
      out.write("                document.getElementsByName('addr2')[0].removeAttribute('readonly');\n");
      out.write("                document.getElementsByName('addr2')[0].focus();\n");
      out.write("            }\n");
      out.write("        }).open();\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
