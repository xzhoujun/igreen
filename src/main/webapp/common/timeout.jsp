<%@ include file="/common/communal.jsp"%>
<%@ include file="/common/taglibs.jsp"%>
<%@ page language="java" 
	contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%
//=========================================
// 页面名messages.jsp
//作  用：提示信息显示界面
//开发者：
//开发时间：
//=========================================
%>

<html>
<body>
<table align="center" width="50%">
	<tr  align="center" >
		<td height="200"></td>
	</tr>
	<tr  align="center" >
		<td>登陆超时或非法登陆! 请重新登陆</td>
	</tr>
	<tr  align="center" > 
		<td><a href="${pageContext.request.contextPath}/common/exit.jsp" target="_top">重新登陆</a></td>
	</tr>
</table>

</body>
</html>