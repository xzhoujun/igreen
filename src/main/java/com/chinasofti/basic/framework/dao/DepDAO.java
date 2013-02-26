package com.chinasofti.basic.framework.dao;

import java.util.List;

import com.chinasofti.basic.framework.model.mybatis.Dep;

public interface DepDAO {

	public List getAllDep(Integer skip,Integer limit);
	
	public Integer getCountDep();
	
	 public void addDep(Dep dep);
	 
	 public void delDep(String depId);

}