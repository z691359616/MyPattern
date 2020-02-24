package com.zd.pattern.factory.simplefactory;

public class Wechatpay implements Payment{

	@Override
	public void pay() {
		System.err.println("this is Wechatpay");
		
	}

}
