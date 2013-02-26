package com.fand.support;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * 模板支持
 * 
 * @author yaoht
 * 
 */
public class DefaultTemplateSupport implements TemplateSupport {
	/**
	 * 日志
	 */
	private final static Log log = LogFactory.getLog(DefaultTemplateSupport.class);

	/**
	 * freemarker.template.Configuratio
	 */
	Configuration configuration;

	/**
	 * 文件名变量名称
	 */
	private String fileBaseNameVariableName = "${fileBaseName}";

	/**
	 * 文件名解析格式
	 */
	private String filenameFormate = "${fileBaseName}.ftl";

	@Override
	public String processTemplateIntoString(final String fileBaseName, final Object model) {
		Validate.notEmpty(fileBaseName);

		final String fileName = StringUtils.replace(this.filenameFormate, this.fileBaseNameVariableName, fileBaseName);

		Template template;

		try {
			template = this.configuration.getTemplate(fileName);

			final String str = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);

			System.out.println(str);

			System.out.println(model);

			DefaultTemplateSupport.log.debug(str);

			DefaultTemplateSupport.log.debug(model);

			return str;
		} catch (final IOException e) {
			throw new IllegalArgumentException(e);
		} catch (final TemplateException e) {
			throw new IllegalArgumentException(e);
		}
	}

	/**
	 * 设置
	 * 
	 * @param configuration
	 *            freemarker.template.Configuratio
	 */
	public void setConfiguration(final Configuration configuration) {
		this.configuration = configuration;
	}

	/**
	 * 设置
	 * 
	 * @param fileBaseNameVariableName
	 *            文件名变量名称
	 */
	public void setFileBaseNameVariableName(final String fileBaseNameVariableName) {
		this.fileBaseNameVariableName = StringUtils.defaultIfBlank(fileBaseNameVariableName, this.fileBaseNameVariableName);
	}

	/**
	 * 设置
	 * 
	 * @param filenameFormate
	 *            文件名解析格式
	 */
	public void setFilenameFormate(final String filenameFormate) {
		this.filenameFormate = StringUtils.defaultIfBlank(filenameFormate, this.filenameFormate);
	}
}
