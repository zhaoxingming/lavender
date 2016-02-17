package com.alibaba.lavendaer.core.test;

public class AService {
	
	private BService bService;
	
	public void method1(){
		bService.b_method1();
	}
	
	public void method2(){
		bService.b_method2();
	}

	public BService getbService() {
		return bService;
	}

	public void setbService(BService bService) {
		this.bService = bService;
	}
	
	
}
