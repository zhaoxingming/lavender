package com.alibaba.lavendaer.core.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-test.xml")
public class AIntegrationTest extends AbstractTransactionalJUnit4SpringContextTests{

	@Autowired
	private AService aService;
	
	@Test
	@Transactional
	public void testAService(){
		aService.method1();
	}
}
