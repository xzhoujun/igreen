<%@ tag body-content="empty" pageEncoding="UTF-8"%>

<!--当前页数-->
<%@ attribute name="pageNum" rtexprvalue="true" required="true"%>
<!--总记录数-->
<%@ attribute name="totalCount" rtexprvalue="true" required="true"%>
<!--接收总页数-->
<%@ attribute name="totalPageCount" rtexprvalue="true" required="true"%>
<!--提交地址-->
<%@ attribute name="path" rtexprvalue="true" required="true"%>
<!--其他参数-->
<%@ attribute name="param" rtexprvalue="true" required="false"%>
<!--表格样式-->
<%@ attribute name="style" rtexprvalue="true" required="false"%>
<!--表单名称-->
<%@ attribute name="formName" rtexprvalue="true" required="false" description="指定表单的名称,默认为pageform"%>
<!--页码大小-->
<%@ attribute name="isPageSize" rtexprvalue="true" required="false" description="指定是否显示页码大小"%>

<table border="0" align="center" width="95%"  style="${style}">
	<tr>
		<td align="left">
			共有<font color="red">${totalCount}</font>条记录  
			共有<font color="red">${totalPageCount}</font>页 
			当前第<font color="red">${pageNum}</font>页 
		</td>
		<td align="right">	
		
			
			<a href="#" onclick="page_go2('1')"><img border="0" src="${pageContext.request.contextPath}/images/1.gif" width="8" height="8" title="首页"/>首页</a>
			<a href="#" onclick="page_go2('${pageNum-1}')""><img border="0" src="${pageContext.request.contextPath}/images/2.gif" width="7" height="8" title="上一页"/></a>
			&nbsp;
			<%
			if(jspContext.getAttribute("formName")==null){
				jspContext.setAttribute("formName","pageform");
			}
			int totalPageCount = Integer.parseInt((String)jspContext.getAttribute("totalPageCount"));			
			int pageNum = Integer.parseInt((String)jspContext.getAttribute("pageNum"));			
			int left = 1;
			int right= 4;
							
			left = pageNum-3;
			right= pageNum+3;
			if(right<7)
				right=7;
			
			for(left = left;pageNum > left ;left++){
				if(left>0){
				out.println("<a href=\"#\" onclick=\"page_go2('"+left+"')\">"+left+"</a>");
				}
			}
			
			out.println("<font color=\"red\" class='redh'>"+pageNum+"</font>");
			pageNum++;
			for(right = right;pageNum <= right ;pageNum++){
				if(pageNum>0 && pageNum<=totalPageCount){
				out.println("<a href=\"#\" onclick=\"page_go2('"+pageNum+"')\">"+pageNum+"</a>");
				}
			}
			
			
			%>
			&nbsp;			
			
			<a href="#" onclick="page_go2('${pageNum+1}')"><img border="0" src="${pageContext.request.contextPath}/images/3.gif" width="7" height="8" title="下一页"/></a>
			
			
			
			<a href="#" onclick="page_go2('${totalPageCount}')"><img border="0" src="${pageContext.request.contextPath}/images/4.gif" width="8" height="8" title="尾页"/></a>		
		
		   
		    <input value="${pageNum}" style="width:30px;" maxlength="4" onkeypress="page_go(this.value)" title="输入页码后,可直接按Enter键"/>
		    
		    <%
		    //是否显示分页大小,需要修改
		    if(jspContext.getAttribute("isPageSize")!=null && "true".equals((String)jspContext.getAttribute("isPageSize"))){
		    	
		    }
		    %>
		    
		    <script>
		      function page_go(pageNum){		    	
		    	var key = event.keyCode;
		    	if(key<48 || key>57)
		    			event.keyCode = 0;
			      
		    	if(key==13){
		    		${formName}.action='${path}?pageNum='+pageNum;
		    		${formName}.submit();
		  		}
		      }
		      
		      function page_go2(pageNum){		    	  
		    	  //${formName}.action='${path}?pageNum='+pageNum; 
		    	  //${formName}.submit();
		    	  location='${path}?pageNum='+pageNum; 
		  	  }	      
		      
		    </script>
		    
		</td>
	</tr>

</table>




