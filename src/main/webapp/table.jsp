<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<script type="text/javascript"
	src="js/jquery-easyui-1.3.2/jquery-1.8.0.min.js"></script>
<script type="text/javascript"
	src="js/jquery-easyui-1.3.2/jquery.easyui.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.3.2/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.3.2/themes/icon.css">
<script src="js/jquery-easyui-1.3.2/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#dlg').dialog('close');
	});
	var toolbar = [ {
		text : '添加',
		iconCls : 'icon-add',
		handler : function() {
			to_add();
		}
	}, {
		text : '修改',
		iconCls : 'icon-edit',
		handler : function() {
			to_edit();
		}
	}, '-', {
		text : '删除',
		iconCls : 'icon-remove',
		handler : function() {
			to_remove();
		}
	} ];

	function to_add() {
		$('#dlg').dialog({
			modal : true,
			title : '添加'
		});
	}
	function to_edit() {
		$('#dlg').dialog({
			modal : true,
			title : '修改'
		});
	}
	function to_remove() {
		$('#dlg').dialog({
			modal : true,
			title : '删除'
		});
	}
</script>
</head>
<body>
	<table class="easyui-datagrid" title="Table组件"
		style="width: 900px; height: 500px"
		data-options="rownumbers:true,singleSelect:true,pagination:true,pageSize:5,pageList:[5,15,25,35],url:'datagrid_data1.json',toolbar:toolbar">
		<thead>
			<tr>
				<th data-options="field:'name',width:150">姓名</th>
				<th data-options="field:'addr',width:200">地址</th>
				<th data-options="field:'birth',width:150">生日</th>
				<th data-options="field:'remark',width:200">备注</th>
				<th data-options="field:'record_status',width:60,align:'center'">状态</th>
			</tr>
		</thead>
	</table>

	<div id="dlg" class="easyui-dialog" title="添加"
		style="width: 400px; height: 200px; padding: 10px"
		data-options="
				iconCls: 'icon-save',				
				buttons: [{
					text:'确定',
					iconCls:'icon-ok',
					handler:function(){
						alert('ok');
					}
				},{
					text:'Cancel',
					handler:function(){
						$('#dlg').dialog('close');
					}
				}]
			">
		<table>
			<tr>
				<td>姓名:</td>
				<td><input type="text" name="uname" /></td>
			</tr>
			<tr>
				<td>生日:</td>
				<td><input type="text" name="birthday" /></td>
			</tr>
			<tr>
				<td>地址:</td>
				<td><input type="text" name="addr" /></td>
			</tr>
			<tr>
				<td>备注:</td>
				<td><input type="text" name="desc" /></td>
			</tr>
		</table>
	</div>


</body>
</html>