package com.sany.hrm.system.po;

import java.util.Date;

import javax.persistence.Id;

/**
 * 分区
 * 
 * @author yaoht
 * 
 */
public class Partition implements java.io.Serializable {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 811342126218562795L;

	/**
    * 标识
	 */
	public static final String _id = "id";

	/**
    * 结束时间
	 */
	public static final String _endTi = "endTi";

	/**
    * 修改时间
	 */
	public static final String _modifyTi = "modifyTi";

	/**
    * 名称
	 */
	public static final String _name = "name";

	/**
    * 创建人标识
	 */
	public static final String _createPeId = "createPeId";

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
    * 修改人标识
	 */
	public static final String _modifyPeId = "modifyPeId";

	/**
    * 开始时间
	 */
	public static final String _beginTi = "beginTi";

	/**
    * 版本号
	 */
	public static final String _versionNu = "versionNu";

	/**
    * 标识
    */
	@Id
	String id;

	/**
    * 结束时间
    */
	Date endTi;

	/**
    * 修改时间
    */
	Date modifyTi;

	/**
    * 名称
    */
	String name;

	/**
    * 创建人标识
    */
	String createPeId;

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
    * 修改人标识
    */
	String modifyPeId;

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
	 * @return 标识
	 */
	public String getId() {
		return this.id;
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
	 * @return 修改时间
	 */
	public Date getModifyTi() {
		return this.modifyTi;
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
	 * @return 创建人标识
	 */
	public String getCreatePeId() {
		return this.createPeId;
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
	 * @return 版本号
	 */
	public Double getVersionNu() {
		return this.versionNu;
	}

	/**
	 * 设置
     *
	 * @param id
	 *            标识
	 */
	public Partition setId(String id) {
		this.id = id;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param endTi
	 *            结束时间
	 */
	public Partition setEndTi(Date endTi) {
		this.endTi = endTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param modifyTi
	 *            修改时间
	 */
	public Partition setModifyTi(Date modifyTi) {
		this.modifyTi = modifyTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param name
	 *            名称
	 */
	public Partition setName(String name) {
		this.name = name;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param createPeId
	 *            创建人标识
	 */
	public Partition setCreatePeId(String createPeId) {
		this.createPeId = createPeId;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param orderNu
	 *            排序号
	 */
	public Partition setOrderNu(Double orderNu) {
		this.orderNu = orderNu;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param code
	 *            编号
	 */
	public Partition setCode(String code) {
		this.code = code;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param createTi
	 *            创建时间
	 */
	public Partition setCreateTi(Date createTi) {
		this.createTi = createTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param modifyPeId
	 *            修改人标识
	 */
	public Partition setModifyPeId(String modifyPeId) {
		this.modifyPeId = modifyPeId;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param beginTi
	 *            开始时间
	 */
	public Partition setBeginTi(Date beginTi) {
		this.beginTi = beginTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param versionNu
	 *            版本号
	 */
	public Partition setVersionNu(Double versionNu) {
		this.versionNu = versionNu;
		
		return this;
	}
}