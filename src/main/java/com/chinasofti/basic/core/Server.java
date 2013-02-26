package com.chinasofti.basic.core;

import com.chinasofti.basic.configuration.ConfigurationManager;
import com.chinasofti.basic.configuration.PropertyConfiguration;

/**
 * 系统服务核心类
 * @author zengzj
 *
 */
public class Server {

	private Server() {
		init();
	}

	private static final Server instance = new Server();

	public static final Server getInstance() {
		return instance;
	}

	private ConfigurationManager configuration;

	/**
	 * 获取配置文件管理器
	 * @return
	 */
	public ConfigurationManager getConfiguration() {
		return configuration;
	}

	private int state = 0;

	private interface State {
		public static final int STOP = 0, START = 1, PAUSE = 2;
	}

	private void init() {
		configuration = new PropertyConfiguration("configuration.properties");
	}

	/**
	 * 启动服务
	 */
	public void start() {
		System.out.println("服务启动...");
		try {
			configuration.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		state = State.START;
	}

	/**
	 * 停止服务
	 */
	public void stop() {
		state = State.STOP;
	}

	/**
	 * 暂停服务
	 */
	public void pause() {
		state = State.PAUSE;
	}
}
