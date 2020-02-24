package com.zd.pattern.factory.simplefactory;

public class SimpleFactoryTest {
	public static void main(String[] args) {
		
		PaymentFactory pf = new PaymentFactory();
		Payment payment = pf.createPayment(Alipay.class);
		payment.pay();
		
		
	}
}
