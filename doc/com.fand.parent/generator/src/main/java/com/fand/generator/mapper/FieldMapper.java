package com.fand.generator.mapper;

/**
 * 字段映射
 * 
 * @author yaoht
 */
public class FieldMapper implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3060242666159354649L;

	Integer charOctetLength;

	/**
	 * 编号
	 */
	String code;

	String columnDef;

	String columnName;
	Integer columnSize;
	Integer dataType;
	Integer decimalDigits;
	String isAutoincrement;
	String isGeneratedcolumn;
	String isNullable;
	Short keySeq;
	/**
	 * 名称
	 */
	String name;
	String namePascalCase;
	Integer nullable;
	Integer numPrecRadix;
	Integer ordinalPosition;
	String pkName;
	String remarks;
	String scopeCatalog;
	String scopeSchema;
	String scopeTable;
	String sourceDataType;
	Integer sqlDataType;
	Integer sqlDatetimeSub;
	String tableCat;
	String tableName;
	String tableSchem;
	/**
	 * 类型编号
	 */
	String typeCode;

	String typeName;

	/**
	 * @return the charOctetLength
	 */
	public Integer getCharOctetLength() {
		return this.charOctetLength;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * @return the columnDef
	 */
	public String getColumnDef() {
		return this.columnDef;
	}

	/**
	 * @return the columnName
	 */
	public String getColumnName() {
		return this.columnName;
	}

	/**
	 * @return the columnSize
	 */
	public Integer getColumnSize() {
		return this.columnSize;
	}

	/**
	 * @return the dataType
	 */
	public Integer getDataType() {
		return this.dataType;
	}

	/**
	 * @return the decimalDigits
	 */
	public Integer getDecimalDigits() {
		return this.decimalDigits;
	}

	/**
	 * @return the isAutoincrement
	 */
	public String getIsAutoincrement() {
		return this.isAutoincrement;
	}

	/**
	 * @return the isGeneratedcolumn
	 */
	public String getIsGeneratedcolumn() {
		return this.isGeneratedcolumn;
	}

	/**
	 * @return the isNullable
	 */
	public String getIsNullable() {
		return this.isNullable;
	}

	/**
	 * @return the keySeq
	 */
	public Short getKeySeq() {
		return this.keySeq;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the namePascalCase
	 */
	public String getNamePascalCase() {
		return this.namePascalCase;
	}

	/**
	 * @return the nullable
	 */
	public Integer getNullable() {
		return this.nullable;
	}

	/**
	 * @return the numPrecRadix
	 */
	public Integer getNumPrecRadix() {
		return this.numPrecRadix;
	}

	/**
	 * @return the ordinalPosition
	 */
	public Integer getOrdinalPosition() {
		return this.ordinalPosition;
	}

	/**
	 * @return the pkName
	 */
	public String getPkName() {
		return this.pkName;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return this.remarks;
	}

	/**
	 * @return the scopeCatalog
	 */
	public String getScopeCatalog() {
		return this.scopeCatalog;
	}

	/**
	 * @return the scopeSchema
	 */
	public String getScopeSchema() {
		return this.scopeSchema;
	}

	/**
	 * @return the scopeTable
	 */
	public String getScopeTable() {
		return this.scopeTable;
	}

	/**
	 * @return the sourceDataType
	 */
	public String getSourceDataType() {
		return this.sourceDataType;
	}

	/**
	 * @return the sqlDataType
	 */
	public Integer getSqlDataType() {
		return this.sqlDataType;
	}

	/**
	 * @return the sqlDatetimeSub
	 */
	public Integer getSqlDatetimeSub() {
		return this.sqlDatetimeSub;
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
	 * @return the typeCode
	 */
	public String getTypeCode() {
		return this.typeCode;
	}

	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return this.typeName;
	}

	/**
	 * @param charOctetLength
	 *            the charOctetLength to set
	 */
	public void setCharOctetLength(final Integer charOctetLength) {
		this.charOctetLength = charOctetLength;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(final String code) {
		this.code = code;
	}

	/**
	 * @param columnDef
	 *            the columnDef to set
	 */
	public void setColumnDef(final String columnDef) {
		this.columnDef = columnDef;
	}

	/**
	 * @param columnName
	 *            the columnName to set
	 */
	public void setColumnName(final String columnName) {
		this.columnName = columnName;
	}

	/**
	 * @param columnSize
	 *            the columnSize to set
	 */
	public void setColumnSize(final Integer columnSize) {
		this.columnSize = columnSize;
	}

	/**
	 * @param dataType
	 *            the dataType to set
	 */
	public void setDataType(final Integer dataType) {
		this.dataType = dataType;
	}

	/**
	 * @param decimalDigits
	 *            the decimalDigits to set
	 */
	public void setDecimalDigits(final Integer decimalDigits) {
		this.decimalDigits = decimalDigits;
	}

	/**
	 * @param isAutoincrement
	 *            the isAutoincrement to set
	 */
	public void setIsAutoincrement(final String isAutoincrement) {
		this.isAutoincrement = isAutoincrement;
	}

	/**
	 * @param isGeneratedcolumn
	 *            the isGeneratedcolumn to set
	 */
	public void setIsGeneratedcolumn(final String isGeneratedcolumn) {
		this.isGeneratedcolumn = isGeneratedcolumn;
	}

	/**
	 * @param isNullable
	 *            the isNullable to set
	 */
	public void setIsNullable(final String isNullable) {
		this.isNullable = isNullable;
	}

	/**
	 * @param keySeq
	 *            the keySeq to set
	 */
	public void setKeySeq(final Short keySeq) {
		this.keySeq = keySeq;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @param namePascalCase
	 *            the namePascalCase to set
	 */
	public void setNamePascalCase(final String namePascalCase) {
		this.namePascalCase = namePascalCase;
	}

	/**
	 * @param nullable
	 *            the nullable to set
	 */
	public void setNullable(final Integer nullable) {
		this.nullable = nullable;
	}

	/**
	 * @param numPrecRadix
	 *            the numPrecRadix to set
	 */
	public void setNumPrecRadix(final Integer numPrecRadix) {
		this.numPrecRadix = numPrecRadix;
	}

	/**
	 * @param ordinalPosition
	 *            the ordinalPosition to set
	 */
	public void setOrdinalPosition(final Integer ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}

	/**
	 * @param pkName
	 *            the pkName to set
	 */
	public void setPkName(final String pkName) {
		this.pkName = pkName;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(final String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @param scopeCatalog
	 *            the scopeCatalog to set
	 */
	public void setScopeCatalog(final String scopeCatalog) {
		this.scopeCatalog = scopeCatalog;
	}

	/**
	 * @param scopeSchema
	 *            the scopeSchema to set
	 */
	public void setScopeSchema(final String scopeSchema) {
		this.scopeSchema = scopeSchema;
	}

	/**
	 * @param scopeTable
	 *            the scopeTable to set
	 */
	public void setScopeTable(final String scopeTable) {
		this.scopeTable = scopeTable;
	}

	/**
	 * @param sourceDataType
	 *            the sourceDataType to set
	 */
	public void setSourceDataType(final String sourceDataType) {
		this.sourceDataType = sourceDataType;
	}

	/**
	 * @param sqlDataType
	 *            the sqlDataType to set
	 */
	public void setSqlDataType(final Integer sqlDataType) {
		this.sqlDataType = sqlDataType;
	}

	/**
	 * @param sqlDatetimeSub
	 *            the sqlDatetimeSub to set
	 */
	public void setSqlDatetimeSub(final Integer sqlDatetimeSub) {
		this.sqlDatetimeSub = sqlDatetimeSub;
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
	 * @param typeCode
	 *            the typeCode to set
	 */
	public void setTypeCode(final String typeCode) {
		this.typeCode = typeCode;
	}

	/**
	 * @param typeName
	 *            the typeName to set
	 */
	public void setTypeName(final String typeName) {
		this.typeName = typeName;
	}
}
