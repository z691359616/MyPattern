package com.zd.pattern.factory.abstractfactory;

public class WechatpayFactory implements PaymentFactory{

	@Override
	public InlandPay inlandPayment() {
		return new WechatInlandPay();
	}

	@Override
	public ForeignPay foreignPayment() {
		return new WechatForeignPay();
	}

}
