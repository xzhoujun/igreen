package com.fand.extend.service;

import com.fand.extend.dao.SimpleDao;

/**
 * service
 * 
 * @author yaoht
 * 
 * @param <Dao>
 */
public class DefaultSimpleService<Dao extends SimpleDao> implements SimpleService {
	/**
	 * dao
	 */
	protected Dao dao;

	/**
	 * 设置
	 * 
	 * @param dao
	 *            dao
	 */
	public void setDao(final Dao dao) {
		this.dao = dao;
	}
}
