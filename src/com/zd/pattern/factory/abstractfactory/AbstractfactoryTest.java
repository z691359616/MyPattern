package com.zd.pattern.factory.abstractfactory;

public class AbstractfactoryTest {
	public static void main(String[] args) {
		
		PaymentFactory alipayFactory = new AlipayFactory();
		alipayFactory.inlandPayment().inlandPay();
		alipayFactory.foreignPayment().foreignPay();
		
		PaymentFactory wechantpayFactory = new WechatpayFactory();
		wechantpayFactory.inlandPayment().inlandPay();
		wechantpayFactory.foreignPayment().foreignPay();
		
	}
}
