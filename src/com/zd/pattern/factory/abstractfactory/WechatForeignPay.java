package com.zd.pattern.factory.abstractfactory;

public class WechatForeignPay implements ForeignPay{

	@Override
	public void foreignPay() {
		System.err.println("wechat foreign pay");
	}

}
