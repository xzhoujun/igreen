<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/common/taglibs.jsp"%>
<%@ taglib tagdir="/WEB-INF/tags/" prefix="p"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>

	添加
	<form action="index!add.action" method="post">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name="dep.depId" /></td>
			</tr>
			<tr>
				<td>名称</td>
				<td><input type="text" name="dep.depName" /></td>
			</tr>
		</table>
		<input type="submit" value="添加" />
	</form>
</body>
</html>