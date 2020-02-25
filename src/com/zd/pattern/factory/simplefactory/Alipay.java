package com.zd.pattern.factory.simplefactory;


public class Alipay implements IPayment{
	@Override
	public void pay() {
		System.err.println("this is Alipay");
		
	}

}
