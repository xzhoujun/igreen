package com.chinasofti.basic.framework.manage.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.chinasofti.basic.framework.dao.IBaseDAO;
import com.chinasofti.basic.framework.dao.jdbc.JdbcDAO;
import com.chinasofti.basic.framework.manage.services.IBaseServices;
import com.chinasofti.basic.framework.model.hibernate.Users;

public class BaseServices implements IBaseServices  {
	//protected IBaseDAO basedao;		
	protected IBaseDAO<Users,String> userdao;
	
	
	
	public void setUserdao(IBaseDAO<Users, String> userdao) {
		this.userdao = userdao;
	}



	
	public JdbcDAO getJdbcDAO(){
		return userdao.getJdbcDAO();
	}


	
	public void printCache() {
		// TODO Auto-generated method stub
		
	}



	
	public List queryListNum(String hql, Integer max, Object... param) {
		// TODO Auto-generated method stub
		List list  = new ArrayList();
		list.add("11");
		return list;
	}

	
	
}
