package com.chinasofti.basic.framework.common.web;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;

/**
 * 
 * @author zengzj
 *
 */
public class SessionFilter implements Filter {
	protected FilterConfig filterConfig;
	private static final Logger logger = Logger
	.getLogger(SessionFilter.class);

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		String path = request.getRequestURI();
		logger.info(" ip = "+request.getRemoteAddr());
		if (filterConfig.getInitParameter("disableFilter")
				.equalsIgnoreCase("Y")) {
			chain.doFilter(req, res);
			return;
		}

		HttpSession session = request.getSession();
		if (null == session.getAttribute("user")) {
			//System.out.println("sessionFilter : "+path);
			if (path.endsWith(".js") || path.endsWith(".css")
					|| path.endsWith(".gif") || path.endsWith(".jpg")) {
				chain.doFilter(req, res);
				return;
			}
			//其他内容的过滤在web.xml中配置
			if (path.endsWith("/") || path.contains("login")) {
				chain.doFilter(req, res);
				return;
			}

			logger.warn("非法请求或会话超时!重新登陆！ ip = "+request.getRemoteAddr());
			response.sendRedirect(request.getContextPath() +"/common/timeout.jsp");
		} else {
			chain.doFilter(request, response);
		}

	}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

	public void destroy() {
		this.filterConfig = null;
	}
}
