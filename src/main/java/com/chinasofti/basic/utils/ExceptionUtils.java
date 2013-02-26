package com.chinasofti.basic.utils;

/**
 * @author 周俊
 * 
 */
public class ExceptionUtils {
	public static String buildMessage(String message, Throwable cause) {
		if (cause != null) {
			StringBuffer buf = new StringBuffer();
			if (message != null) {
				buf.append(message).append("; ");
			}
			buf.append("nested exception is ").append(cause);
			return buf.toString();
		} else {
			return message;
		}
	}
}
