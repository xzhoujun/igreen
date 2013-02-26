package com.chinasofti.basic.framework.manage.services;

import java.util.List;

import com.chinasofti.basic.framework.common.Page;
import com.chinasofti.basic.framework.model.mybatis.Dep;

public interface IUserService {
    public int countAll();
    public Page getAllDep(Integer pageNum);
    
    public void addDep(Dep dep);
    
    public void delDep(String depId);
}