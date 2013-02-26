package com.fand.dto;

import java.util.List;

/**
 * 分页
 * 
 * @author yaoht0-fand
 * 
 * @param <T>
 *            泛型
 */
public class PaginationDto<T>  implements java.io.Serializable {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 2759596825937626448L;

	/**
	 * 数据集合
	 */
	private List<T> dataList;

	/**
	 * 统计大小
	 */
	private int totalSize;

	/**
	 * 获取
	 * 
	 * @return 数据集合
	 */
	public List<T> getDataList() {
		return this.dataList;
	}

	/**
	 * 获取
	 * 
	 * @return 统计大小
	 */
	public int getTotalSize() {
		return this.totalSize;
	}

	/**
	 * 设置
	 * 
	 * @param dataList
	 *            数据集合
	 */
	public void setDataList(final List<T> dataList) {
		this.dataList = dataList;
	}

	/**
	 * 设置
	 * 
	 * @param totalSize
	 *            统计大小
	 */
	public void setTotalSize(final int totalSize) {
		this.totalSize = totalSize;
	}
}
