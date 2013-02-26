package com.chinasofti.basic.framework.manage.services;

import java.util.List;

import com.chinasofti.basic.framework.dao.jdbc.JdbcDAO;

public interface IBaseServices {
	
	public JdbcDAO getJdbcDAO();

	public void printCache();
	public List queryListNum(String hql, Integer max, Object... param);
}