package com.zd.pattern.factory.simplefactory;

public class Wechatpay implements IPayment{

	@Override
	public void pay() {
		System.err.println("this is Wechatpay");
		
	}

}
