package com.chinasofti.basic.framework.common;


/**
 * Hibernate Query对象 
 * @author 
 *
 */
public class HQuery {

	/**
	 * 需要查询哪些字段, 默认查询所有字段
	 */
	private String[] queryField;
	/**
	 * 参数集合对象
	 */
	private ParamsList paralist;
	/**
	 * 排序字段
	 */
	private String orderby;
	/**
	 * 分组字段
	 */
	private String groupby;
	/**
	 * 分页起始查询地址(页码)
	 */
	private int pageNum;
	/**
	 * 每页显示记录数
	 */
	private int pageSize;

	
	/**
	 * 取得一个HQL查询字段字符串
	 * 
	 * @return：查询字符串
	 * 
	 */
	public String[] getQueryField() {
		return queryField;
	}

	/**
	 * 设置一个HQL查询字段字符串
	 * 
	 * @param queryString：查询字符串
	 * 
	 */
	public void setQueryField(String[] queryField) {

		this.queryField = queryField;

	}

	/**
	 * 取得参数集合对象
	 * 
	 * @return：参数集合对象
	 */
	public ParamsList getParalist() {
		return paralist;
	}

	/**
	 * 设置参数集合对象
	 * 
	 * @param paralist：参数集合对象
	 */
	public void setParalist(ParamsList paralist) {
		this.paralist = paralist;
	}

	/**
	 * 取得排序字段
	 * 
	 * @return：排序字段
	 */
	public String getOrderby() {
		return orderby;
	}

	/**
	 * 设置排序字段
	 * 
	 * @param orderby
	 */
	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}

	/**
	 * 取得分组字段
	 * 
	 * @return
	 */
	public String getGroupby() {
		return groupby;
	}

	/**
	 * 设置分组字段
	 * 
	 * @param groupby
	 */
	public void setGroupby(String groupby) {
		this.groupby = groupby;
	}

	
	
	
	
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
