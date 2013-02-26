package com.chinasofti.basic.framework.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页对象
 * @author zengzj
 *
 */
public class Page  implements java.io.Serializable{


	
    /**
     * 默认每页的记录数
     */
    private int pageSize = Constants.PAGE_SIZE;
    /**
     * 总记录数
     */
    private int totalCount=1;
    /**
     * 总页数
     */
    private int totalPageCount=1;
    /**
     * 记录当前页码
     */
    private int pageNum=1;

    /**
     * 当前页中存放的记录
     */
    private List result =  new ArrayList();

   
    /**
     * 构造方法，只构造空页
     */
    public Page() {        
    }

    /**
     * 默认构造方法
     *
     * @param start     本页数据起始位置
     * @param totalSize 数据库中总记录条数
     * @param result      本页包含的数据
     */
    public Page(int pageNum, int totalCount,int totalPageCount, List result) {      
        this.pageNum = pageNum;
        this.totalCount = totalCount;
        this.totalPageCount = totalPageCount;
        this.result = result;
    }

    
    public int getPageNum() {
    	//如果当前页小于1, 就等于1
    	if(pageNum<1){
			pageNum=1;
		}
    	//如果当前页大于等于总页数, 就等于总页数
    	if(pageNum>=getTotalPageCount()){
			pageNum=getTotalPageCount();
		}
    	
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	/**
     * 取数据库中包含的总记录数
     */
    public int getTotalCount() {
    	
        return this.totalCount;
    }

    /**
     * 取总页数
     */
    public int getTotalPageCount() {        
            return this.totalPageCount;       
    }

    /**
     * 取每页数据容量
     */
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize){
    	this.pageSize=pageSize;
    }

    /**
     * 当前页中的记录
     */
    public List getResult() {
        return result;
    }

   



    /**
     * 获取任一页第一条数据的位置，每页条数使用默认值
     */
    public static int getStartOfPage(int pageNo) {
        return getStartOfPage(pageNo, Constants.PAGE_SIZE);
    }

    /**
     * 获取任一页第一条数据的位置,startIndex从0开始
     */
    public static int getStartOfPage(int pageNo, int pageSize) {
        return (pageNo - 1) * pageSize;
    }
    
    

   
}
