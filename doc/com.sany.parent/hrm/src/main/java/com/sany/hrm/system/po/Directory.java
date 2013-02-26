package com.sany.hrm.system.po;

import java.util.Date;

import javax.persistence.Id;

/**
 * 目录
 * 
 * @author yaoht
 * 
 */
public class Directory implements java.io.Serializable {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 781282395860090106L;

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
    * 目录_标识
	 */
	public static final String _directoryId = "directoryId";

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
    * 分区_标识
	 */
	public static final String _partitionId = "partitionId";

	/**
    * 编号
	 */
	public static final String _code = "code";

	/**
    * 创建时间
	 */
	public static final String _createTi = "createTi";

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
    * 目录_标识
    */
	String directoryId;

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
    * 分区_标识
    */
	String partitionId;

	/**
    * 编号
    */
	String code;

	/**
    * 创建时间
    */
	Date createTi;

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
	 * @return 目录_标识
	 */
	public String getDirectoryId() {
		return this.directoryId;
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
	 * @return 分区_标识
	 */
	public String getPartitionId() {
		return this.partitionId;
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
	public Directory setId(String id) {
		this.id = id;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param endTi
	 *            结束时间
	 */
	public Directory setEndTi(Date endTi) {
		this.endTi = endTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param modifyTi
	 *            修改时间
	 */
	public Directory setModifyTi(Date modifyTi) {
		this.modifyTi = modifyTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param directoryId
	 *            目录_标识
	 */
	public Directory setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param name
	 *            名称
	 */
	public Directory setName(String name) {
		this.name = name;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param createPeId
	 *            创建人标识
	 */
	public Directory setCreatePeId(String createPeId) {
		this.createPeId = createPeId;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param orderNu
	 *            排序号
	 */
	public Directory setOrderNu(Double orderNu) {
		this.orderNu = orderNu;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param partitionId
	 *            分区_标识
	 */
	public Directory setPartitionId(String partitionId) {
		this.partitionId = partitionId;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param code
	 *            编号
	 */
	public Directory setCode(String code) {
		this.code = code;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param createTi
	 *            创建时间
	 */
	public Directory setCreateTi(Date createTi) {
		this.createTi = createTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param typeId
	 *            类型标识
	 */
	public Directory setTypeId(String typeId) {
		this.typeId = typeId;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param modifyPeId
	 *            修改人标识
	 */
	public Directory setModifyPeId(String modifyPeId) {
		this.modifyPeId = modifyPeId;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param beginTi
	 *            开始时间
	 */
	public Directory setBeginTi(Date beginTi) {
		this.beginTi = beginTi;
		
		return this;
	}

	/**
	 * 设置
     *
	 * @param versionNu
	 *            版本号
	 */
	public Directory setVersionNu(Double versionNu) {
		this.versionNu = versionNu;
		
		return this;
	}
}