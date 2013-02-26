<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>

<%
	//=========================================
	//页面名：exit.jsp
	//作  用：重登陆页
	//开发者：
	//开发时间：
	//=========================================
	session.invalidate();
	response.sendRedirect(request.getContextPath()+"/");
%>
