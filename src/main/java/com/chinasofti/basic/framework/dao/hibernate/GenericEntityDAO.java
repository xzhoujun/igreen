package com.chinasofti.basic.framework.dao.hibernate;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasofti.basic.framework.exception.DaoException;

/**
 * Hibernate通用实体DAO
 * @author zengzj
 *
 * @param <T>
 * @param <PK>
 */
public class GenericEntityDAO<T, PK extends Serializable> extends 
		HibernateDaoSupport {
	Logger log = Logger.getLogger(this.getClass()); // 定义日志记录器

	protected Class<T> entityClass;

	public void setEntityClass(Class<T> type) {// 注入实体类型		
		this.entityClass = type;
	}

	public Class<T> getEntityClass() {
		return this.entityClass;
	}

	public GenericEntityDAO() {				
	}

	public GenericEntityDAO(Class<T> entityClass) {	
		this.entityClass = entityClass;
	}

	
	@SuppressWarnings("unchecked")
	public T get(PK id) {
		try {
			
			return (T) this.getHibernateTemplate().get(this.entityClass, id);
		} catch (DataAccessException e) {
			String _error = "查询  " + this.entityClass.getName() + " 的记录失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}
	}


	
	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		
		try {
			return (List<T>) (this.getHibernateTemplate()
					.loadAll(this.entityClass));
		} catch (DataAccessException e) {
			String _error = "查询  " + this.entityClass.getName() + " 的全部记录失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}
	}

	
	@SuppressWarnings("unchecked")
	public T load(PK id) {
		try {
			return (T) this.getHibernateTemplate().load(this.entityClass, id);
		} catch (DataAccessException e) {
			String _error = "查询  " + this.entityClass.getName() + " 的记录失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}
	}

	
	public void delete(T entityObject) {
		try {
			
			this.getHibernateTemplate().delete(entityObject);
		} catch (DataAccessException e) {
			String _error = "从数据库删除 " + this.entityClass.getClass().getName()
					+ " 实例失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}
	}

	
	public void delete(PK id) {
		try {
			this.delete(this.get(id));
		} catch (DataAccessException e) {
			String _error = "从数据库删除 " + this.entityClass.getClass().getName()
					+ " 实例失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}
	}
	
	
	
	public void refresh(T entityObject) {
		this.getHibernateTemplate().refresh(entityObject);
	}
	

	
	public void evict(T entityObject) {
		this.getHibernateTemplate().evict(entityObject);
	}

	
	public void add(T entityObject) {
		try {
			
			getHibernateTemplate().save(entityObject);
		} catch (DataAccessException e) {
			String _error = "保存 " + this.entityClass.getClass().getName()
					+ " 实例到数据库失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}
	}

	
	public void update(T entityObject) {
		try {
			getHibernateTemplate().update(entityObject);
		} catch (DataAccessException e) {
			String _error = " " + this.entityClass.getClass().getName()
					+ " 实例到数据库失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}
	}

	
	public void saveOrUpdate(T entityObject) {
		this.getHibernateTemplate().saveOrUpdate(entityObject);
	}

	
	@SuppressWarnings("unchecked")
	public T merge(T entityObject) {
		return (T) this.getHibernateTemplate().merge(entityObject);
	}

}
