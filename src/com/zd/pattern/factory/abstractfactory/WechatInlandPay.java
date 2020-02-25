package com.zd.pattern.factory.abstractfactory;

public class WechatInlandPay implements InlandPay {

	@Override
	public void inlandPay() {
		System.err.println("wechat inland pay");
	}

}
