package com.zd.pattern.factory.abstractfactory;

public class AliInlandPay implements InlandPay{

	@Override
	public void inlandPay() {
		System.err.println("alipay inland pay");
	}

}
