package com.chinasofti.basic.framework.common.web;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.mapper.ActionMapping;

import com.chinasofti.basic.core.Server;
import com.chinasofti.basic.utils.StringUtils;


public class StrutsFilter extends
		org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter {

	private List<String> actionNamespace;

	public void init(javax.servlet.FilterConfig filterConfig)
			throws javax.servlet.ServletException {
		super.init(filterConfig);
		actionNamespace = new ArrayList<String>();
		String path = Server.getInstance().getConfiguration().get(
				"action.namespace");
		String[] paths = path.split(";");
		for (String s : paths) {
			actionNamespace.add(s.trim());
		}
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		super.doFilter(req, res, chain);
		// HttpServletRequest request = (HttpServletRequest) req;
		// System.out.println(request.getServletPath());
		// HttpServletResponse response = (HttpServletResponse) res;
		// try {
		// this.prepare.setEncodingAndLocale(request, response);
		// this.prepare.createActionContext(request, response);
		// this.prepare.assignDispatcherToThread();
		// if ((this.excludedPatterns != null)
		// && (this.prepare.isUrlExcluded(request,
		// this.excludedPatterns))) {
		// chain.doFilter(request, response);
		// } else {
		// request = this.prepare.wrapRequest(request);
		// ActionMapping mapping = this.prepare.findActionMapping(request,
		// response, true);
		// if (mapping == null) {
		// boolean handled = this.execute
		// .executeStaticResourceRequest(request, response);
		//
		// } else {
		// try {
		// if (mapping.getName().indexOf("!") >= 0)
		// this.executeNoMapping(request, response);
		// else
		// this.execute.executeAction(request, response,
		// mapping);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// }
		// }
		// } finally {
		// this.prepare.cleanupRequest(request);
		// }
	}

	private void executeNoMapping(HttpServletRequest request,
			HttpServletResponse response) {
		String str = request.getServletPath();

		int inx = str.indexOf("!");
		int start = str.lastIndexOf("/");
		if (start < 0)
			start = 0;
		else
			start++;
		String action = str.substring(start, inx);
		int inx2 = str.indexOf("?");
		if (inx2 < 1)
			inx2 = str.length();
		String method = str.substring(inx + 1, inx2);
		for (String s : this.actionNamespace) {
			try {
				Class clazz = Class.forName(s + "."
						+ StringUtils.upperFirst(action) + "Action");
				Object obj = clazz.newInstance();
				Method[] ms = clazz.getDeclaredMethods();
				for (Method m : ms) {
					if (m.getName().equals(method)) {
						ActionMapping mapping = new ActionMapping();
						mapping.setName(StringUtils.upperFirst(action));
						mapping.setMethod(method);
						mapping.setNamespace("/");
						this.execute.executeAction(request, response, mapping);
						return;
					}
				}
			} catch (Exception e) {

			}
		}
	}

	public static final void main(String[] args) {
		String str = "index!login?";
		int inx = str.indexOf("!");
		String action = str.substring(0, inx);
		int inx2 = str.indexOf("?");
		if (inx2 < 1)
			inx2 = str.length();
		String method = str.substring(inx + 1, inx2);

		System.out.println(action + " , " + method);
	}
}
