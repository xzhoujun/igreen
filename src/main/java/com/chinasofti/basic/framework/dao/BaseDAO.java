package com.chinasofti.basic.framework.dao;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.StatelessSession;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.chinasofti.basic.framework.common.Page;
import com.chinasofti.basic.framework.dao.hibernate.GenericDAO;
import com.chinasofti.basic.framework.dao.hibernate.GenericEntityDAO;
import com.chinasofti.basic.framework.dao.jdbc.JdbcDAO;

/**
 * DAO基类
 * @author zengzj
 *
 * @param <T>
 * @param <PK>
 */
public class BaseDAO<T, PK extends Serializable> implements IBaseDAO<T, PK> {
	Logger log = Logger.getLogger(this.getClass()); // 定义日志记录器

	protected Class<T> entityClass;// DAO所管理的Entity类型.
	private GenericEntityDAO<T, PK> gedao;
	private GenericDAO gdao;
	private JdbcDAO jdbcdao;

	public Class<T> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<T> entityClass) {

		this.entityClass = entityClass;
	}

	public GenericEntityDAO<T, PK> getGedao() {
		return gedao;
	}

	public void setGedao(GenericEntityDAO<T, PK> gedao) {
		gedao.setEntityClass(entityClass);
		this.gedao = gedao;
	}

	public GenericDAO getGdao() {
		return gdao;
	}

	public void setGdao(GenericDAO gdao) {
		this.gdao = gdao;
	}

	public JdbcDAO getJdbcdao() {
		return jdbcdao;
	}

	public void setJdbcdao(JdbcDAO jdbcdao) {
		this.jdbcdao = jdbcdao;
	}

	
	public BaseDAO(Class<T> type) {

		this.entityClass = type;
	}

	public BaseDAO() {
	}

	// ----------------------------------

	public void clear() {
		gdao.clear();
	}

	public void flush() {
		gdao.flush();
	}

	public void refresh(T entityObject) {
		gedao.refresh(entityObject);
	}

	public void evict(T entityObject) {
		gedao.evict(entityObject);
	}

	public Session getNativeHibernateSession() {
		return gdao.getNativeHibernateSession();
	}

	public JdbcDAO getJdbcDAO() {
		return jdbcdao;
	}

	public Iterator queryIterator(String hql, Object... values) {
		return gdao.queryIterator(hql, values);
	}

	public List queryList(String hql, Object... values) {
		return gdao.queryList(hql, values);
	}

	public List<T> getAll() {
		return gedao.getAll();
	}

	public Page queryPage(String hql, int pageNum, int pageSize,
			Object... param) {
		return gdao.queryPage(hql, pageNum, pageSize, param);
	}

	public int queryByCount(String hql, Object... param) {
		return gdao.queryByCount(hql, param);
	}

	public List queryListNum(String hql, Integer max, Object... param) {
		return gdao.queryListNum(hql, max, param);
	}

	public List queryBySql(String sql, Object... param) {
		return gdao.queryBySql(sql, param);
	}

	public int updateOrDelete(String hql) {
		return gdao.updateOrDelete(hql);
	}

	public T get(PK id) {
		return gedao.get(id);
	}

	public T load(PK id) {
		return gedao.load(id);
	}

	public void add(T entityObject) {
		gedao.add(entityObject);
	}

	public void update(T entityObject) {
		gedao.update(entityObject);
	}

	public void saveOrUpdate(T entityObject) {
		gedao.saveOrUpdate(entityObject);
	}

	public T merge(T entityObject) {
		return gedao.merge(entityObject);
	}

	public void delete(T entityObject) {
		gedao.delete(entityObject);
	}

	public void delete(PK id) {
		gedao.delete(id);
	}

	public void printCache() {
		gdao.printCache();
	}
}
