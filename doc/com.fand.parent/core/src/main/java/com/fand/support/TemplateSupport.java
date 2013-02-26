package com.fand.support;

/**
 * 模板支持
 * 
 * @author yaoht
 */
public interface TemplateSupport {
	/**
	 * 获取
	 * 
	 * @param fileBaseName
	 *            文件名
	 * @param model
	 *            数据
	 * @return 解析后字符
	 */
	String processTemplateIntoString(String fileBaseName, Object model);
}
