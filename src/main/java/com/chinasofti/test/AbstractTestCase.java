package com.chinasofti.test;


import org.junit.runner.RunWith;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;


@ContextConfiguration(locations = { "classpath:applicationContext-init.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional   //对所有的测试方法都使用事务，并在测试完成后回滚事务
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)

public abstract class AbstractTestCase extends
		AbstractTransactionalDataSourceSpringContextTests {

}
