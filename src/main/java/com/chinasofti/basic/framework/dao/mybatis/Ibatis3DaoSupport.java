package com.chinasofti.basic.framework.dao.mybatis;

import org.springframework.dao.support.DaoSupport;

import org.springframework.transaction.support.TransactionSynchronizationManager;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import javax.sql.DataSource;

/**
 * MyBatis通用DAO
 * @author zengzj
 *
 */
public class Ibatis3DaoSupport extends DaoSupport {
	private SqlSessionFactory sqlSessionFactory;
	private IBatis3DaoTemplate template;
	
	public void createTemplate(){
		this.template = new IBatis3DaoTemplate(sqlSessionFactory);
	}

	public IBatis3DaoTemplate getTemplate() {
		//System.out.println(template);
		return template;
	}

	public void setTemplate(IBatis3DaoTemplate template) {
		this.template = template;
	}

	//创建或得到session
	public SqlSession openSession() {

		SqlSession session = (SqlSession) TransactionSynchronizationManager
				.getResource(sqlSessionFactory);
		if (session == null) {
			session = sqlSessionFactory.openSession();
		}
     
		return session;
	}

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sessionFactory) {
		this.sqlSessionFactory = sessionFactory;
		this.template = new IBatis3DaoTemplate(sessionFactory);
		
	}

	
	@Override
	protected void checkDaoConfig() throws IllegalArgumentException {
		
		if (sqlSessionFactory == null) {
			throw new IllegalArgumentException(
					"Property 'sessionFactory' or 'template'  is required");
		}

	}

}
