package com.chinasofti.basic.framework.dao;

import java.util.List;

import com.chinasofti.basic.framework.dao.mybatis.Ibatis3DaoSupport;
import com.chinasofti.basic.framework.model.mybatis.Dep;


public class DepDAOImpl extends Ibatis3DaoSupport implements DepDAO {
    
    public List getAllDep(Integer skip,Integer limit){
    	
    	//分页查询
    	return super.getTemplate().selectList("dep.selectAll", null, skip, limit);
    	
    }
    
    public Integer getCountDep(){
    	
    	//统计查询
    	return (Integer)super.getTemplate().selectOne("dep.count");
    	
    }
    
    public void addDep(Dep dep) {
		
    	super.getTemplate().insert("dep.add", dep);
   }
    
    public void delDep(String depId) {
		
    	super.getTemplate().delete("dep.delete", depId);
   }
}
