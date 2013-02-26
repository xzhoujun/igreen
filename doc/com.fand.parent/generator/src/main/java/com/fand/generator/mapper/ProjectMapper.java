package com.fand.generator.mapper;

import java.util.Map;

/**
 * 项目映射
 * 
 * @author yaoht
 */
public class ProjectMapper implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2910623076775675790L;

	/**
	 * 编号
	 */
	private String code;

	private Map<String, ModuleMapper> moduleMapperMap;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 包编号
	 */
	private String packageCode;

	/**
	 * @return the code
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * @return the moduleMapperMap
	 */
	public Map<String, ModuleMapper> getModuleMapperMap() {
		return this.moduleMapperMap;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the packageCode
	 */
	public String getPackageCode() {
		return this.packageCode;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(final String code) {
		this.code = code;
	}

	/**
	 * @param moduleMapperMap
	 *            the moduleMapperMap to set
	 */
	public void setModuleMapperMap(final Map<String, ModuleMapper> moduleMapperMap) {
		this.moduleMapperMap = moduleMapperMap;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @param packageCode
	 *            the packageCode to set
	 */
	public void setPackageCode(final String packageCode) {
		this.packageCode = packageCode;
	}
}
