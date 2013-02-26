package com.chinasofti.test;
import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.chinasofti.basic.framework.manage.services.IBaseServices;
import com.chinasofti.basic.framework.manage.services.IUserService;


public class BaseServicesTest  extends AbstractTestCase{
	
	@Resource	
	private IBaseServices baseServices;
	private IUserService userService;

	
	@Test
	public void testJdbc(){
		
		assertNotNull(baseServices.getJdbcDAO().queryList("select * from tbusers"));
		System.out.println(baseServices.getJdbcDAO().queryList("select * from tbusers"));
	}
		
	
	@Before
	// 在每个测试用例方法之前都会执行
	public void init() {
	}

	@After
	// 在每个测试用例执行完之后执行
	public void destory() {
	}

}
