package com.sany.hrm.system.po;

import java.util.Date;

import javax.persistence.Id;

/**
 * 资源字段
 * 
 * @author yaoht
 * 
 */
public class ResourceFi implements java.io.Serializable {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 295068054205706392L;

	/**
    * double值
	 */
	public static final String _doubleVa = "doubleVa";

	/**
    * 结束时间
	 */
	public static final String _endTi = "endTi";

	/**
    * 排序号
	 */
	public static final String _orderNu = "orderNu";

	/**
    * 编号
	 */
	public static final String _code = "code";

	/**
    * 创建时间
	 */
	public static final String _createTi = "createTi";

	/**
    * string值
	 */
	public static final String _stringVa = "stringVa";

	/**
    * 标识
	 */
	public static final String _id = "id";

	/**
    * 资源_标识
	 */
	public static final String _resourceId = "resourceId";

	/**
    * date值
	 */
	public static final String _dateVa = "dateVa";

	/**
    * 修改时间
	 */
	public static final String _modifyTi = "modifyTi";

	/**
    * 创建人标识
	 */
	public static final String _createPeId = "createPeId";

	/**
    * 名称
	 */
	public static final String _name = "name";

	/**
    * long值
	 */
	public static final String _longVa = "longVa";

	/**
    * 类型标识
	 */
	public static final String _typeId = "typeId";

	/**
    * 修改人标识
	 */
	public static final String _modifyPeId = "modifyPeId";

	/**
    * 开始时间
	 */
	public static final String _beginTi = "beginTi";

	/**
    * text类型值
	 */
	public static final String _textVa = "textVa";

	/**
    * 版本号
	 */
	public static final String _versionNu = "versionNu";

	/**
    * double值
    */
	Long doubleVa;

	/**
    * 结束时间
    */
	Date endTi;

	/**
    * 排序号
    */
	Double orderNu;

	/**
    * 编号
    */
	String code;

	/**
    * 创建时间
    */
	Date createTi;

	/**
    * string值
    */
	String stringVa;

	/**
    * 标识
    */
	@Id
	String id;

	/**
    * 资源_标识
    */
	String resourceId;

	/**
    * date值
    */
	Date dateVa;

	/**
    * 修改时间
    */
	Date modifyTi;

	/**
    * 创建人标识
    */
	String createPeId;

	/**
    * 名称
    */
	String name;

	/**
    * long值
    */
	Double longVa;

	/**
    * 类型标识
    */
	String typeId;

	/**
    * 修改人标识
    */
	String modifyPeId;

	/**
    * 开始时间
    */
	Date beginTi;

	/**
    * text类型值
    */
	String textVa;

	/**
    * 版本号
    */
	Double versionNu;

	/**
     * 获取
     *
	 * @return double值
	 */
	public Long getDoubleVa() {
		return this.doubleVa;
	}

	/**
     * 获取
     *
	 * @return 结束时间
	 */
	public Date getEndTi() {
		return this.endTi;
	}

	/**
     * 获取
     *
	 * @return 排序号
	 */
	public Double getOrderNu() {
		return this.orderNu;
	}

	/**
     * 获取
     *
	 * @return 编号
	 */
	public String getCode() {
		return this.code;
	}

	/**
     * 获取
     *
	 * @return 创建时间
	 */
	public Date getCreateTi() {
		return this.createTi;
	}

	/**
     * 获取
     *
	 * @return string值
	 */
	public String getStringVa() {
		return this.stringVa;
	}

	/**
     * 获取
     *
	 * @return 标识
	 */
	public String getId() {
		return this.id;
	}

	/**
     * 获取
     *
	 * @return 资源_标识
	 */
	public String getResourceId() {
		return this.resourceId;
	}

	/**
     * 获取
     *
	 * @return date值
	 */
	public Date getDateVa() {
		return this.dateVa;
	}

	/**
     * 获取
     *
	 * @return 修改时间
	 */
	public Date getModifyTi() {
		return this.modifyTi;
	}

	/**
     * 获取
     *
	 * @return 创建人标识
	 */
	public String getCreatePeId() {
		return this.createPeId;
	}

	/**
     * 获取
     *
	 * @return 名称
	 */
	public String getName() {
		return this.name;
	}

	/**
     * 获取
     *
	 * @return long值
	 */
	public Double getLongVa() {
		return this.longVa;
	}

	/**
     * 获取
     *
	 * @return 类型标识
	 */
	public String getTypeId() {
		return this.typeId;
	}

	/**
     * 获取
     *
	 * @return 修改人标识
	 */
	public String getModifyPeId() {
		return this.modifyPeId;
	}

	/**
     * 获取
     *
	 * @return 开始时间
	 */
	public Date getBeginTi() {
		return this.beginTi;
	}

	/**
     * 获取
     *
	 * @return text类型值
	 */
	public String getTextVa() {
		return this.textVa;
	}

	/**
     * 获取
     *
	 * @return 版本号
	 */
	public Double getVersionNu() {
		return this.versionNu;
	}

	/**
	 * 设置
     *
	 * @param doubleVa
	 *            double值
	 */
	public ResourceFi setDoubleVa(Long doubleVa) {
		this.doubleVa = doubleVa;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param endTi
	 *            结束时间
	 */
	public ResourceFi setEndTi(Date endTi) {
		this.endTi = endTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param orderNu
	 *            排序号
	 */
	public ResourceFi setOrderNu(Double orderNu) {
		this.orderNu = orderNu;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param code
	 *            编号
	 */
	public ResourceFi setCode(String code) {
		this.code = code;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param createTi
	 *            创建时间
	 */
	public ResourceFi setCreateTi(Date createTi) {
		this.createTi = createTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param stringVa
	 *            string值
	 */
	public ResourceFi setStringVa(String stringVa) {
		this.stringVa = stringVa;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param id
	 *            标识
	 */
	public ResourceFi setId(String id) {
		this.id = id;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param resourceId
	 *            资源_标识
	 */
	public ResourceFi setResourceId(String resourceId) {
		this.resourceId = resourceId;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param dateVa
	 *            date值
	 */
	public ResourceFi setDateVa(Date dateVa) {
		this.dateVa = dateVa;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param modifyTi
	 *            修改时间
	 */
	public ResourceFi setModifyTi(Date modifyTi) {
		this.modifyTi = modifyTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param createPeId
	 *            创建人标识
	 */
	public ResourceFi setCreatePeId(String createPeId) {
		this.createPeId = createPeId;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param name
	 *            名称
	 */
	public ResourceFi setName(String name) {
		this.name = name;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param longVa
	 *            long值
	 */
	public ResourceFi setLongVa(Double longVa) {
		this.longVa = longVa;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param typeId
	 *            类型标识
	 */
	public ResourceFi setTypeId(String typeId) {
		this.typeId = typeId;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param modifyPeId
	 *            修改人标识
	 */
	public ResourceFi setModifyPeId(String modifyPeId) {
		this.modifyPeId = modifyPeId;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param beginTi
	 *            开始时间
	 */
	public ResourceFi setBeginTi(Date beginTi) {
		this.beginTi = beginTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param textVa
	 *            text类型值
	 */
	public ResourceFi setTextVa(String textVa) {
		this.textVa = textVa;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param versionNu
	 *            版本号
	 */
	public ResourceFi setVersionNu(Double versionNu) {
		this.versionNu = versionNu;
		
		return this;
	}
}