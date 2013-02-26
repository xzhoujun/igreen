package com.chinasofti.basic.framework.listener;

import com.chinasofti.basic.core.Server;

/**
 * 系统服务监听器
 * @author Administrator
 *
 */
public class BasicContextLoaderListener extends
		org.springframework.web.context.ContextLoaderListener {

	public void contextInitialized(javax.servlet.ServletContextEvent event) {
		super.contextInitialized(event);
		Server.getInstance().start();
	}

	public void contextDestroyed(javax.servlet.ServletContextEvent event) {
		super.contextDestroyed(event);
		Server.getInstance().stop();
	}
}
