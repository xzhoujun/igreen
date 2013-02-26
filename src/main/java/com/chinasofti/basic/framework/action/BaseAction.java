package com.chinasofti.basic.framework.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action 基类
 * @author zengzj
 *
 */
public class BaseAction extends ActionSupport implements SessionAware,
		ServletResponseAware, ServletRequestAware {

	private Map<String, Object> session;

	private HttpServletResponse response;

	private HttpServletRequest request;

	/**
	 * 从会话获取值
	 * @param name
	 * @return 
	 */
	public Object getSessionValue(String name) {
		return this.session.get(name);
	}

	/**
	 * 从请求对象获取值
	 * @param name
	 * @return
	 */
	public Object getRequestValue(String name) {
		return this.request.getAttribute(name);
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setServletResponse(HttpServletResponse res) {
		response = res;
	}

	
	public void setServletRequest(HttpServletRequest req) {
		request = req;
	}

}
