package com.chinasofti.basic.configuration;

import java.io.File;

/**
 * 配置文件管理器
 * @author zengzj
 *
 */
public abstract class ConfigurationManager {

	private String path;

	public String getPath() {
		return path;
	}

	/**
	 * 
	 * @param path
	 */
	public ConfigurationManager(String path) {
		this.path = path;
	}

	/**
	 * 载入配置文件
	 * @throws Exception
	 */
	public abstract void read() throws Exception;

	/**
	 * 获取属性值
	 * @param name
	 * @return
	 */
	public abstract String get(String name);

	/**
	 * 获取属性值，如未获取到则返回默认值
	 * @param name
	 * @param defaultValue
	 * @return
	 */
	public abstract String get(String name, String defaultValue);
}
