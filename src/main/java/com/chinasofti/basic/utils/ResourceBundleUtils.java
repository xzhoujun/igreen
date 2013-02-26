package com.chinasofti.basic.utils;

import java.util.ResourceBundle;

public class ResourceBundleUtils {
	private ResourceBundle bundle;

	private static final String RESOUTCE_NAME = "resources/messages";

	public String getResourceMessage(String messageName) {
		bundle = ResourceBundle.getBundle(RESOUTCE_NAME);
		String message = bundle.getString(messageName);
		
		return message;
	}
}
