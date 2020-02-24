package com.zd.pattern.factory.simplefactory;


public class Alipay implements Payment{
	@Override
	public void pay() {
		System.err.println("this is Alipay");
		
	}

}
