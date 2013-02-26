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

/**
 * 
 * @author zengzj
 *
 */
public class SetCharacterEncodingFilter implements Filter {

	protected String encoding = null;

	protected FilterConfig filterConfig = null;

	protected boolean ignore = true;

	// --------------------------------------------------------- Public Methods

	public void destroy() {

		this.encoding = null;
		this.filterConfig = null;

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		// HttpServletRequest hsr = (HttpServletRequest) request;
		// HttpServletResponse hsrs = (HttpServletResponse) response;
		// String agent = hsr.getHeader("User-Agent");
		// String ip = request.getRemoteAddr();

		// System.out.println(agent);
		// System.out.println(hsr.getRemoteAddr());

		String encoding = selectEncoding(request);
		if (encoding != null)
			request.setCharacterEncoding(encoding);

		chain.doFilter(request, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		this.encoding = filterConfig.getInitParameter("encoding");

	}


	protected String selectEncoding(ServletRequest request) {

		return (this.encoding);

	}

}
