package com.zd.pattern.factory.abstractfactory;

public class AliForeignPay implements ForeignPay{

	@Override
	public void foreignPay() {
		System.err.println("alipay foreign pay");
	}

}
