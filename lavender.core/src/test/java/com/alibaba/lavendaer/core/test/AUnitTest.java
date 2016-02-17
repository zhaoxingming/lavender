package com.alibaba.lavendaer.core.test;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Mocked;
import mockit.Tested;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AUnitTest {
	
	
	@Tested
    private AService aService=new AService();

	@Injectable
    @Mocked
    private BService bService;
	
	
	@BeforeClass
	public static void init(){
		System.out.println("start;");
	}
	
	@Before
	public  void initMethod(){
		System.out.println("start method;");
	}
	
	@Test
    public void testMethod1(){
		
        new Expectations() {
            {
            	bService.b_method1();
            result=null;
            times=1;
            }
        };
        aService.method1();
        aService.method2();
    }
}
