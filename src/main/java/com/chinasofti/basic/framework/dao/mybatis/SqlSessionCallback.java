package com.chinasofti.basic.framework.dao.mybatis;

import org.apache.ibatis.session.SqlSession;

public interface SqlSessionCallback {
	public Object doInSqlSession(SqlSession session);
}
