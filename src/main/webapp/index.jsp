<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/common/taglibs.jsp" %> 
<%@ taglib tagdir="/WEB-INF/tags/" prefix="p"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<a href="javascript:location='add.jsp'">添加</a>
<table>
  <tr><th>ID</th><th>名称</th><th>操作</th></tr>
  
  <s:iterator value="page.result" var="_dep" >
	  <tr><td>${_dep.depId}</td><td>${_dep.depName}</td><td><a href="#" onclick="delDep('${_dep.depId}')">删 除</a></td></tr>
  </s:iterator>

</table>
<form name="pageform">
<p:pagination totalCount="${page.totalCount }" pageNum="${page.pageNum }" path="index.action" totalPageCount="${page.totalPageCount  }"/>
</form>
</body>
<script type="text/javascript">
function delDep(depid){
	if(confirm('确认删除吗！'))
	location='index!delete.action?dep.depId='+depid;	
}

</script>
</html>