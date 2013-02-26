package com.chinasofti.basic.framework.dao;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import com.chinasofti.basic.framework.common.Page;
import com.chinasofti.basic.framework.dao.jdbc.JdbcDAO;

public interface IBaseDAO<T,PK extends Serializable> {
    
    public T get(PK id);
    
    
    public List<T> getAll();
 
    
    public T load(PK id);
 
    
    public void delete(T entityObject);
 
   
    public void delete(PK id);
    
    public void refresh(T entityObject);
   
    public void evict(T entityObject);
    
   
	public void add(T entityObject);
	
	
	public void update(T entityObject);
 
    
    public void saveOrUpdate(T entityObject);
 
    
    public T merge(T entityObject);
 
    
    public  List queryList(String hql, Object... values);
 
   
    
    public void flush();
 
   
    public void clear();
 
    
    public  Iterator queryIterator(String hql,Object...values);
 
    public Session getNativeHibernateSession();
 

	public int updateOrDelete(String hql);
	
	
	public List queryListNum(String hql, Integer max, Object... param);
	
	
	public List queryBySql(String sql, Object... param);
 
    
	public Page queryPage(String hql, int pageNum, int pageSize,
			Object... param);
	
	
	public int queryByCount(String hql, Object... param);
	
    
 
    public JdbcDAO getJdbcDAO();
    
    
	public void printCache();
}