package com.fand.builder;

import java.util.Date;

import javax.persistence.Id;

/**
 * 流程日志
 * 
 * @author yaoht
 * 
 */
public class WorkflowLo implements java.io.Serializable {
	/**
	 * 创建人
	 */
	public static final String _createPerson = "createPerson";

	/**
	 * 创建时间
	 */
	public static final String _createTime = "createTime";

	/**
	 * 描述
	 */
	public static final String _describing = "describing";

	/**
	 * 信息
	 */
	public static final String _message = "message";

	/**
	 * 名称
	 */
	public static final String _name = "name";

	/**
    * 
	 */
	public static final String _nodeName = "nodeName";

	/**
	 * 操作
	 */
	public static final String _operation = "operation";

	/**
	 * 操作者
	 */
	public static final String _operationPerson = "operationPerson";

	/**
	 * 流程编号
	 */
	public static final String _wfCode = "wfCode";

	/**
	 * 流程日志标识
	 */
	public static final String _wfLogId = "wfLogId";

	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 799937130732547932L;

	/**
	 * 创建人
	 */
	String createPerson;

	/**
	 * 创建时间
	 */
	Date createTime;

	/**
	 * 描述
	 */
	String describing;

	/**
	 * 信息
	 */
	String message;

	/**
	 * 名称
	 */
	String name;

	/**
    * 
    */
	String nodeName;

	/**
	 * 操作
	 */
	String operation;

	/**
	 * 操作者
	 */
	String operationPerson;

	/**
	 * 流程编号
	 */
	String wfCode;

	/**
	 * 流程日志标识
	 */
	@Id
	String wfLogId;

	/**
	 * 获取
	 * 
	 * @return 创建人
	 */
	public String getCreatePerson() {
		return this.createPerson;
	}

	/**
	 * 获取
	 * 
	 * @return 创建时间
	 */
	public Date getCreateTime() {
		return this.createTime;
	}

	/**
	 * 获取
	 * 
	 * @return 描述
	 */
	public String getDescribing() {
		return this.describing;
	}

	/**
	 * 获取
	 * 
	 * @return 信息
	 */
	public String getMessage() {
		return this.message;
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
	 * @return
	 */
	public String getNodeName() {
		return this.nodeName;
	}

	/**
	 * 获取
	 * 
	 * @return 操作
	 */
	public String getOperation() {
		return this.operation;
	}

	/**
	 * 获取
	 * 
	 * @return 操作者
	 */
	public String getOperationPerson() {
		return this.operationPerson;
	}

	/**
	 * 获取
	 * 
	 * @return 流程编号
	 */
	public String getWfCode() {
		return this.wfCode;
	}

	/**
	 * 获取
	 * 
	 * @return 流程日志标识
	 */
	public String getWfLogId() {
		return this.wfLogId;
	}

	/**
	 * 设置
	 * 
	 * @param createPerson
	 *            创建人
	 */
	public void setCreatePerson(final String createPerson) {
		this.createPerson = createPerson;
	}

	/**
	 * 设置
	 * 
	 * @param createTime
	 *            创建时间
	 */
	public void setCreateTime(final Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 设置
	 * 
	 * @param describing
	 *            描述
	 */
	public void setDescribing(final String describing) {
		this.describing = describing;
	}

	/**
	 * 设置
	 * 
	 * @param message
	 *            信息
	 */
	public void setMessage(final String message) {
		this.message = message;
	}

	/**
	 * 设置
	 * 
	 * @param name
	 *            名称
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * 设置
	 * 
	 * @param nodeName
	 * 
	 */
	public void setNodeName(final String nodeName) {
		this.nodeName = nodeName;
	}

	/**
	 * 设置
	 * 
	 * @param operation
	 *            操作
	 */
	public void setOperation(final String operation) {
		this.operation = operation;
	}

	/**
	 * 设置
	 * 
	 * @param operationPerson
	 *            操作者
	 */
	public void setOperationPerson(final String operationPerson) {
		this.operationPerson = operationPerson;
	}

	/**
	 * 设置
	 * 
	 * @param wfCode
	 *            流程编号
	 */
	public void setWfCode(final String wfCode) {
		this.wfCode = wfCode;
	}

	/**
	 * 设置
	 * 
	 * @param wfLogId
	 *            流程日志标识
	 */
	public void setWfLogId(final String wfLogId) {
		this.wfLogId = wfLogId;
	}
}