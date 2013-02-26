package com.chinasofti.basic.framework.dao.hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasofti.basic.framework.common.Constants;
import com.chinasofti.basic.framework.common.Page;
import com.chinasofti.basic.framework.exception.DaoException;

/**
 * Hibernate通用DAO
 * @author Administrator
 *
 */
public class GenericDAO extends HibernateDaoSupport {

	Logger log = Logger.getLogger(this.getClass());

	public void flush() {
		this.getHibernateTemplate().flush();
	}

	public void clear() {
		this.getHibernateTemplate().clear();
	}

	public Session getNativeHibernateSession() {
		return this.getSessionFactory().getCurrentSession();
	}

	/**
	 * 批量更新
	 */
	public void saveOrUpdateAll(Collection entities) {
		try {
			getHibernateTemplate().saveOrUpdateAll(entities);

		} catch (DataAccessException e) {
			String _error = "批量更新 " + entities + " 实例到数据库失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}
	}

	public Object loadByKey(Class clazz, String keyName, Object keyValue) {

		try {
			List result = getHibernateTemplate().find(
					"from " + clazz.getName() + " where " + keyName + " = ?",
					keyValue);
			if (result != null && result.size() > 0) {
				return result.get(0);
			} else {
				return null;
			}
		} catch (DataAccessException e) {
			String _error = "查询  " + clazz.getName() + " 的记录失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}
	}

	public List queryList(String hql, Object... param) {

		try {
			return getHibernateTemplate().find(hql, param);
		} catch (DataAccessException e) {
			String _error = "执行查询 " + hql + " 失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}

	}

	public Iterator queryIterator(String hql, Object... values) {
		try {
			return this.getHibernateTemplate().iterate(hql, values);
		} catch (DataAccessException e) {
			String _error = "执行查询 " + hql + " 失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}
	}

	public int updateOrDelete(String hql) {

		try {

			return getHibernateTemplate().bulkUpdate(hql);
		} catch (DataAccessException e) {
			String _error = "执行语句 " + hql + " 失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}

	}

	public Page queryPage(String hql, int pageNum, int pageSize,
			Object... param) {
		if (pageSize <= 0) {
			pageSize = Constants.PAGE_SIZE;
		}
		if (pageNum <= 0) {
			pageNum = 1;
		}
		int totalCount = queryByCount(hql, param);// 取总记录数
		int totalPageCount = (totalCount + pageSize - 1) / pageSize;// 取总页数
		if (pageNum > totalPageCount) {
			pageNum = totalPageCount;
		}

		Session session = this.getHibernateTemplate().getSessionFactory()
				.getCurrentSession();
		List result = new ArrayList();

		try {
			Query query = session.createQuery(hql);

			if (param != null && param.length > 0) {
				for (int i = 0; i < param.length; i++) {
					query.setParameter(i, param[i]); // hibernate参数绑定0开始
				}
			}
			query.setFirstResult((pageNum - 1) * pageSize); // 设置查询的起始位置

			query.setMaxResults(pageSize); // 每次取出的最大结果数
			query.setCacheable(true);// 查询缓存
			result = query.list();

		} catch (HibernateException e) {

			String _error = "执行分页查询 " + hql + " 失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}
		// 由spring事务管理连接关闭

		// page分页对象 pageNum当前页，count 总记录数,totalPageCount 总页数 result 分页的数据
		return new Page(pageNum, totalCount, totalPageCount, result);
	}

	public int queryByCount(String hql, Object... param) {
		// 截取hql,拼装为count语句
		int sql_from = hql.indexOf("from");
		int sql_orderby = hql.indexOf("order by");
		StringBuffer countStr = new StringBuffer();
		if (sql_orderby > 0) {
			countStr.append("select count(*) ").append(
					hql.substring(sql_from, sql_orderby));
		} else {
			countStr.append("select count(*) ").append(hql.substring(sql_from));
		}

		Session session = this.getHibernateTemplate().getSessionFactory()
				.getCurrentSession();
		Long count = 0L;
		try {
			Query query = session.createQuery(countStr.toString());
			if (param != null && param.length > 0) {
				for (int i = 0; i < param.length; i++) {
					query.setParameter(i, param[i]); // hibernate参数绑定0开始 ,jdbc
					// 从1开始
				}
			}
			query.setCacheable(true);// 查询缓存
			count = (Long) query.uniqueResult();

		} catch (HibernateException e) {

			String _error = "执行count查询 " + hql + " 失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}
		return count.intValue();
	}

	public List queryListNum(String hql, Integer max, Object... param) {

		Session session = this.getHibernateTemplate().getSessionFactory()
				.getCurrentSession();
		List ulist = new ArrayList();

		try {
			Query query = session.createQuery(hql);
			if (param != null && param.length > 0) {
				for (int i = 0; i < param.length; i++) {
					query.setParameter(i, param[i]); // hibernate参数绑定0开始
				}
			}
			query.setMaxResults(max); // 每次取出的最大结果数
			query.setCacheable(true);// 先从缓存中查找结果， 并将自己的结果集放到缓存中去。

			ulist = query.list();

		} catch (HibernateException e) {
			String _error = "执行查询 " + hql + " 失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}

		return ulist;
	}

	public List queryBySql(String sql, Object... param) {
		Session session = this.getHibernateTemplate().getSessionFactory()
				.getCurrentSession();
		List ulist = new ArrayList();

		try {
			Query query = session.createSQLQuery(sql);
			if (param != null && param.length > 0) {
				for (int i = 0; i < param.length; i++) {
					query.setParameter(i, param[i]); // hibernate参数绑定0开始
				}
			}

			query.setCacheable(true);// 先从缓存中查找结果， 并将自己的结果集放到缓存中去。

			ulist = query.list();

		} catch (HibernateException e) {
			String _error = "执行sql查询 " + sql + " 失败";
			log.error(_error, e);
			throw new DaoException(_error, e);
		}

		return ulist;
	}

	public void printCache() {
		String[] RegionNames = this.getHibernateTemplate().getSessionFactory()
				.getStatistics().getSecondLevelCacheRegionNames();
		// System.out.println("RegionNames:"+RegionNames[0]+RegionNames.length);
		// System.out.println("RegionNames:"+RegionNames[1]+RegionNames.length);

		// Map cacheEntries =
		// this.getHibernateTemplate().getSessionFactory().getStatistics().getSecondLevelCacheStatistics("StandardQueryCache").getEntries();
		// System.out.println(cacheEntries);
		System.out.println("使用连接总数是:"
				+ this.getHibernateTemplate().getSessionFactory()
						.getStatistics().getConnectCount());
		System.out.println("使用session总数是:"
				+ this.getHibernateTemplate().getSessionFactory()
						.getStatistics().getSessionOpenCount());
		System.out.println("关闭session总数是:"
				+ this.getHibernateTemplate().getSessionFactory()
						.getStatistics().getSessionCloseCount());
		System.out.println("缓存命中成功次数是:"
				+ this.getHibernateTemplate().getSessionFactory()
						.getStatistics().getSecondLevelCacheHitCount());
		System.out.println("缓存命中失败次数是:"
				+ this.getHibernateTemplate().getSessionFactory()
						.getStatistics().getSecondLevelCacheMissCount());
		System.out.println("缓存写入记录数是:"
				+ this.getHibernateTemplate().getSessionFactory()
						.getStatistics().getSecondLevelCachePutCount());

	}
}
