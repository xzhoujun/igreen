package com.fand.generator.mapper;

import java.util.Map;

/**
 * 模块映射
 * 
 * @author yaoht
 */
public class ModuleMapper implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2617824744116728750L;

	Map<String, BusinessMapper> businessMap;

	/**
	 * 编号
	 */
	String code;

	/**
	 * 名称
	 */
	String name;

	/**
	 * @return the businessMap
	 */
	public Map<String, BusinessMapper> getBusinessMap() {
		return this.businessMap;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param businessMap
	 *            the businessMap to set
	 */
	public void setBusinessMap(final Map<String, BusinessMapper> businessMap) {
		this.businessMap = businessMap;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(final String code) {
		this.code = code;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}
}
