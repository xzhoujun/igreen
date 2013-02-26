package com.chinasofti.basic.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author zengzj
 *
 */
public class PropertyConfiguration extends ConfigurationManager {

	private Properties properties;

	public PropertyConfiguration(String path) {
		super(path);
		properties = new Properties();
	}

	@Override
	public void read() throws Exception {

		properties.load(ConfigurationManager.class.getClassLoader()
				.getResourceAsStream(this.getPath()));
	}

	@Override
	public String get(String name) {
		return this.properties.getProperty(name);
	}

	public String get(String name, String defaultValue) {
		String v = this.get(name);
		if (v == null || v.trim().equals(""))
			return defaultValue;
		return v;
	}
}
