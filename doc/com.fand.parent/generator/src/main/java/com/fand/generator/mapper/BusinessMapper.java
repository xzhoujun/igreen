package com.fand.generator.mapper;

import java.util.List;

public class BusinessMapper implements java.io.Serializable {

	/**
     * 
     */
	private static final long serialVersionUID = 815257592663119234L;

	/**
	 * 编号
	 */
	String code;

	List<String> entityList;

	/**
	 * 名称
	 */
	String name;

	/**
	 * @return the code
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * @return the entityList
	 */
	public List<String> getEntityList() {
		return this.entityList;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(final String code) {
		this.code = code;
	}

	/**
	 * @param entityList
	 *            the entityList to set
	 */
	public void setEntityList(final List<String> entityList) {
		this.entityList = entityList;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}
}
