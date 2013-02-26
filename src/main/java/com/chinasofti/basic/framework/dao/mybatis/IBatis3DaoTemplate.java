package com.chinasofti.basic.framework.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.jdbc.support.JdbcAccessor;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class IBatis3DaoTemplate extends JdbcAccessor {
	private SqlSessionFactory sessionFactory;

	public IBatis3DaoTemplate(SqlSessionFactory factory) {
		this.sessionFactory = factory;
	}

	public SqlSession openSession() {
		SqlSession session = (SqlSession) TransactionSynchronizationManager
				.getResource(sessionFactory);
		if (session == null) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	public void setSessionFactory(SqlSessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List executeFind(SqlSessionCallback callback) {
		return (List) execute(callback);
	}

	public Object execute(SqlSessionCallback callback) {

		SqlSession session = openSession();

		Object obj = callback.doInSqlSession(session);
		if (session != null)
			session.close();

		return obj;
	}


	public int delete(final String statement) {
		return delete(statement, null);
	}

	
	public int delete(final String statement, final Object param) {
		return (Integer) execute(new SqlSessionCallback() {

			public Object doInSqlSession(SqlSession session) {
				if (param != null)
					return session.delete(statement, param);
				else
					return session.delete(statement);
			}
		});
	}

	
	public int update(final String statement, final Object param) {
		return (Integer) execute(new SqlSessionCallback() {

			public Object doInSqlSession(SqlSession session) {
				if (param != null)
					return session.update(statement, param);
				else
					return session.update(statement);
			}
		});
	}

	
	public int update(final String statement) {
		return update(statement, null);
	}


	public int insert(final String statement, final Object param) {
		return (Integer) execute(new SqlSessionCallback() {

			public Object doInSqlSession(SqlSession session) {
				if (param != null)
					return session.insert(statement, param);
				else
					return session.insert(statement);
			}
		});
	}

	
	public int insert(final String statement) {
		return insert(statement, null);
	}


	public List selectList(final String statement, final Object param,
			final RowBounds bounds) {
		return executeFind(new SqlSessionCallback() {

			public Object doInSqlSession(SqlSession session) {
				if (statement == null)
					throw new IllegalArgumentException(
							"Sql 'statement' require");
				if (bounds != null && param != null)
					return session.selectList(statement, param, bounds);
				else if (bounds!=null)
					return session.selectList(statement, null, bounds);
				else if (param != null) {
					return session.selectList(statement, param);
				} 
			
				else
					return session.selectList(statement);

			}
		});
	}


	public List selectList(final String statement, final Object param,
			int skip, int limit) {
		return selectList(statement, param, new RowBounds(skip, limit));
	}

	
	public List selectList(final String statement, final Object param) {
		return selectList(statement, param, null);
	}

	
	public List selectList(final String statement) {
		return selectList(statement, null);
	}

	
	public void select(final String statement, final Object param,
			final RowBounds bounds, final ResultHandler handler) {
		if (statement == null || handler == null)
			throw new IllegalArgumentException(
					"'statement' and 'handler' require");

		execute(new SqlSessionCallback() {

			public Object doInSqlSession(SqlSession session) {
				if (handler != null && bounds != null && param != null)
					session.select(statement, param, bounds, handler);
				else if (bounds == null)
					session.select(statement, param, handler);

				return null;
			}
		});
	}

	
	public void select(final String statement, final Object param,
			final ResultHandler handler) {
		select(statement, param, null, handler);
	}

	
	public Object selectOne(final String statement) {
		return selectOne(statement, null);
	}


	public Object selectOne(final String statement, final Object param) {
		if (statement == null)
			throw new IllegalArgumentException("Sql 'statement' require");
		return execute(new SqlSessionCallback() {

			public Object doInSqlSession(SqlSession session) {
				if (param != null)
					return session.selectOne(statement, param);
				else
					return session.selectOne(statement);

			}
		});
	}

}
