package com.chinasofti.basic.framework.manage.services.impl;

import java.util.List;

import com.chinasofti.basic.framework.common.Page;
import com.chinasofti.basic.framework.dao.DepDAO;
import com.chinasofti.basic.framework.dao.UserDAO;
import com.chinasofti.basic.framework.manage.services.IUserService;
import com.chinasofti.basic.framework.model.mybatis.Dep;

public class UserServiceImpl implements IUserService {
    private UserDAO userDao;
    private DepDAO depDao;

    public UserDAO getUserDao() {
        return userDao;
    }
    public void setUserDao(UserDAO userDao) {
        this.userDao = userDao;
    }
    public DepDAO getDepDao() {
		return depDao;
	}
	public void setDepDao(DepDAO depDao) {
		this.depDao = depDao;
	}
	
	
	
	public int countAll() {
        return this.userDao.countAll();
    }
	
	public Page getAllDep(Integer pageNum) {
		
		List result = this.depDao.getAllDep((pageNum-1)*5,5);
		Integer count = this.depDao.getCountDep();
		Integer pageCount = (count+5-1)/5;
		Page page = new Page(pageNum,count,pageCount,result);
        return page;
    }
	
	public void addDep(Dep dep) {
		
		 this.depDao.addDep(dep);
    }
	
	public void delDep(String depId) {
		
		 this.depDao.delDep(depId);
   }
}
