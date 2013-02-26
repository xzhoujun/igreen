package com.chinasofti.basic.framework.action;

import com.chinasofti.basic.framework.common.Page;
import com.chinasofti.basic.framework.manage.services.IUserService;
import com.chinasofti.basic.framework.model.mybatis.Dep;

public class IndexAction extends BaseAction {

	private IUserService userService;
	private Integer pageNum;
	private Page page;
	private Dep dep;

	public String execute() {

	

		if (null == pageNum || pageNum <= 0)
			pageNum = 1;

		page = userService.getAllDep(pageNum);

		return "index";
	}

	public String add() {
		System.out.println(dep);
		userService.addDep(dep);
		return execute();
	}

	public String delete() {
		userService.delDep(dep.getDepId());
		return execute();
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	
	
	
	public Dep getDep() {
		return dep;
	}

	public void setDep(Dep dep) {
		this.dep = dep;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

}
