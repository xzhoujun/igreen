package com.fand.generator.mapper;

import java.util.Map;

/**
 * bean映射
 * 
 * @author yaoht
 */
public class PoMapper implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1495796601538631576L;

	/**
	 * 编号
	 */
	String code;

	Map<String, FieldMapper> fieldMapperMap;

	String moduleCode;
	/**
	 * 名称
	 */
	String name;
	String refGeneration;
	String remarks;
	String selfReferencingColName;
	String tableCat;
	String tableName;
	String tableSchem;
	String tableType;
	String typeCat;
	String typeName;
	String typeSchem;

	/**
	 * @return the code
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * @return the fieldMapperMap
	 */
	public Map<String, FieldMapper> getFieldMapperMap() {
		return this.fieldMapperMap;
	}

	/**
	 * @return the moduleCode
	 */
	public String getModuleCode() {
		return this.moduleCode;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the refGeneration
	 */
	public String getRefGeneration() {
		return this.refGeneration;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return this.remarks;
	}

	/**
	 * @return the selfReferencingColName
	 */
	public String getSimplelfReferencingColName() {
		return this.selfReferencingColName;
	}

	/**
	 * @return the tableCat
	 */
	public String getTableCat() {
		return this.tableCat;
	}

	/**
	 * @return the tableName
	 */
	public String getTableName() {
		return this.tableName;
	}

	/**
	 * @return the tableSchem
	 */
	public String getTableSchem() {
		return this.tableSchem;
	}

	/**
	 * @return the tableType
	 */
	public String getTableType() {
		return this.tableType;
	}

	/**
	 * @return the typeCat
	 */
	public String getTypeCat() {
		return this.typeCat;
	}

	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return this.typeName;
	}

	/**
	 * @return the typeSchem
	 */
	public String getTypeSchem() {
		return this.typeSchem;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(final String code) {
		this.code = code;
	}

	/**
	 * @param fieldMapperMap
	 *            the fieldMapperMap to set
	 */
	public void setFieldMapperMap(final Map<String, FieldMapper> fieldMapperMap) {
		this.fieldMapperMap = fieldMapperMap;
	}

	/**
	 * @param moduleCode
	 *            the moduleCode to set
	 */
	public void setModuleCode(final String moduleCode) {
		this.moduleCode = moduleCode;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @param refGeneration
	 *            the refGeneration to set
	 */
	public void setRefGeneration(final String refGeneration) {
		this.refGeneration = refGeneration;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(final String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @param selfReferencingColName
	 *            the selfReferencingColName to set
	 */
	public void setSimplelfReferencingColName(final String selfReferencingColName) {
		this.selfReferencingColName = selfReferencingColName;
	}

	/**
	 * @param tableCat
	 *            the tableCat to set
	 */
	public void setTableCat(final String tableCat) {
		this.tableCat = tableCat;
	}

	/**
	 * @param tableName
	 *            the tableName to set
	 */
	public void setTableName(final String tableName) {
		this.tableName = tableName;
	}

	/**
	 * @param tableSchem
	 *            the tableSchem to set
	 */
	public void setTableSchem(final String tableSchem) {
		this.tableSchem = tableSchem;
	}

	/**
	 * @param tableType
	 *            the tableType to set
	 */
	public void setTableType(final String tableType) {
		this.tableType = tableType;
	}

	/**
	 * @param typeCat
	 *            the typeCat to set
	 */
	public void setTypeCat(final String typeCat) {
		this.typeCat = typeCat;
	}

	/**
	 * @param typeName
	 *            the typeName to set
	 */
	public void setTypeName(final String typeName) {
		this.typeName = typeName;
	}

	/**
	 * @param typeSchem
	 *            the typeSchem to set
	 */
	public void setTypeSchem(final String typeSchem) {
		this.typeSchem = typeSchem;
	}
}
