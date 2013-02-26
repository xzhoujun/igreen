package com.fand.utils;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.WordUtils;

/**
 * 字符串工具类
 * 
 * @author yaoht
 * 
 */
public class StringUtils {

	/**
	 * 转为首字母小写的字符，并移除间隔字符
	 * 
	 * @param str
	 *            原字符
	 * @param delimiters
	 *            间隔字符
	 * @return 转换后字符
	 */
	public static String toCamelCase(String str, final char... delimiters) {
		str = StringUtils.toPascalCase(str, delimiters);

		str = org.apache.commons.lang.StringUtils.uncapitalize(str);

		return str;
	}

	/**
	 * 转为首字母大写的字符，并移除间隔字符
	 * 
	 * @param str
	 *            原字符
	 * @param delimiters
	 *            间隔字符
	 * @return 转换后字符
	 */
	public static String toPascalCase(String str, char... delimiters) {
		if (ArrayUtils.isEmpty(delimiters)) {
			delimiters = new char[] { '_' };
		}

		str = org.apache.commons.lang.StringUtils.lowerCase(str);

		str = WordUtils.capitalizeFully(str, delimiters);

		for (final char delimiter : delimiters) {
			str = org.apache.commons.lang.StringUtils.remove(str, delimiter);
		}

		return str;
	}
}
