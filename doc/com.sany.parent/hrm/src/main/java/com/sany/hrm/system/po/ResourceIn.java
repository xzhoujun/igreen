package com.sany.hrm.system.po;

import java.util.Date;

import javax.persistence.Id;

/**
 * 资源索引
 * 
 * @author yaoht
 * 
 */
public class ResourceIn implements java.io.Serializable {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 787932724482201280L;

	/**
    * 父级名称
	 */
	public static final String _parentNa = "parentNa";

	/**
    * 级次
	 */
	public static final String _levelNu = "levelNu";

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
    * 编号路径
	 */
	public static final String _codePa = "codePa";

	/**
    * 标识
	 */
	public static final String _id = "id";

	/**
    * 父级标识
	 */
	public static final String _parentId = "parentId";

	/**
    * 资源_标识
	 */
	public static final String _resourceId = "resourceId";

	/**
    * 标识路径
	 */
	public static final String _idPa = "idPa";

	/**
    * 名称
	 */
	public static final String _name = "name";

	/**
    * 名称路径
	 */
	public static final String _namePa = "namePa";

	/**
    * 子级数量
	 */
	public static final String _childNu = "childNu";

	/**
    * 父级编号
	 */
	public static final String _parentCo = "parentCo";

	/**
    * 开始时间
	 */
	public static final String _beginTi = "beginTi";

	/**
    * 版本号
	 */
	public static final String _versionNu = "versionNu";

	/**
    * 父级名称
    */
	String parentNa;

	/**
    * 级次
    */
	Double levelNu;

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
    * 编号路径
    */
	String codePa;

	/**
    * 标识
    */
	@Id
	String id;

	/**
    * 父级标识
    */
	String parentId;

	/**
    * 资源_标识
    */
	String resourceId;

	/**
    * 标识路径
    */
	String idPa;

	/**
    * 名称
    */
	String name;

	/**
    * 名称路径
    */
	String namePa;

	/**
    * 子级数量
    */
	Double childNu;

	/**
    * 父级编号
    */
	String parentCo;

	/**
    * 开始时间
    */
	Date beginTi;

	/**
    * 版本号
    */
	Double versionNu;

	/**
     * 获取
     *
	 * @return 父级名称
	 */
	public String getParentNa() {
		return this.parentNa;
	}

	/**
     * 获取
     *
	 * @return 级次
	 */
	public Double getLevelNu() {
		return this.levelNu;
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
	 * @return 编号路径
	 */
	public String getCodePa() {
		return this.codePa;
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
	 * @return 父级标识
	 */
	public String getParentId() {
		return this.parentId;
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
	 * @return 标识路径
	 */
	public String getIdPa() {
		return this.idPa;
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
	 * @return 名称路径
	 */
	public String getNamePa() {
		return this.namePa;
	}

	/**
     * 获取
     *
	 * @return 子级数量
	 */
	public Double getChildNu() {
		return this.childNu;
	}

	/**
     * 获取
     *
	 * @return 父级编号
	 */
	public String getParentCo() {
		return this.parentCo;
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
	 * @return 版本号
	 */
	public Double getVersionNu() {
		return this.versionNu;
	}

	/**
	 * 设置
     *
	 * @param parentNa
	 *            父级名称
	 */
	public ResourceIn setParentNa(String parentNa) {
		this.parentNa = parentNa;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param levelNu
	 *            级次
	 */
	public ResourceIn setLevelNu(Double levelNu) {
		this.levelNu = levelNu;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param endTi
	 *            结束时间
	 */
	public ResourceIn setEndTi(Date endTi) {
		this.endTi = endTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param orderNu
	 *            排序号
	 */
	public ResourceIn setOrderNu(Double orderNu) {
		this.orderNu = orderNu;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param code
	 *            编号
	 */
	public ResourceIn setCode(String code) {
		this.code = code;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param codePa
	 *            编号路径
	 */
	public ResourceIn setCodePa(String codePa) {
		this.codePa = codePa;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param id
	 *            标识
	 */
	public ResourceIn setId(String id) {
		this.id = id;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param parentId
	 *            父级标识
	 */
	public ResourceIn setParentId(String parentId) {
		this.parentId = parentId;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param resourceId
	 *            资源_标识
	 */
	public ResourceIn setResourceId(String resourceId) {
		this.resourceId = resourceId;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param idPa
	 *            标识路径
	 */
	public ResourceIn setIdPa(String idPa) {
		this.idPa = idPa;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param name
	 *            名称
	 */
	public ResourceIn setName(String name) {
		this.name = name;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param namePa
	 *            名称路径
	 */
	public ResourceIn setNamePa(String namePa) {
		this.namePa = namePa;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param childNu
	 *            子级数量
	 */
	public ResourceIn setChildNu(Double childNu) {
		this.childNu = childNu;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param parentCo
	 *            父级编号
	 */
	public ResourceIn setParentCo(String parentCo) {
		this.parentCo = parentCo;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param beginTi
	 *            开始时间
	 */
	public ResourceIn setBeginTi(Date beginTi) {
		this.beginTi = beginTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param versionNu
	 *            版本号
	 */
	public ResourceIn setVersionNu(Double versionNu) {
		this.versionNu = versionNu;
		
		return this;
	}
}