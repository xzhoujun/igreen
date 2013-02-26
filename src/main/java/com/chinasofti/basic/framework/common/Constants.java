package com.chinasofti.basic.framework.common;

import com.chinasofti.basic.core.Server;

/**
 * 系统常量类
 * @author zengzj
 *
 */
public class Constants {
	
	/**
	 * 分页大小
	 */
	public static final int PAGE_SIZE = Integer.parseInt(Server.getInstance()
			.getConfiguration().get("constant.default_page_size",
					String.valueOf(10)));

	/**
	 * 默认系统日期格式
	 */
	public static final String DEFAULT_DATE_PATTERN = Server.getInstance()
			.getConfiguration()
			.get("constant.default_date_pattern", "yyyy-MM-dd");
	
	/**
	 * 默认系统时间格式
	 */
	public static final String DEFAULT_DATE_PATTERN_TIME = Server.getInstance()
			.getConfiguration().get("constant.default_date_patternTime",
					"yyyy-MM-dd HH:mm:ss");


	/**
	 * 默认系统标题
	 */
	public static final String DEFAULT_TITLE = Server.getInstance()
			.getConfiguration().get("constant.title", "");


	/**
	 * 默认缓存时限
	 */
	public static final String DEFAULT_CACHE_TIME = Server.getInstance()
			.getConfiguration().get("constant.default_cache_time", "10");

	/**
	 * 上传临时目录
	 */
	public static final String UPLOAD_DIR = Server.getInstance()
			.getConfiguration().get("constant.upload_dir", "/images/upload/");

}
