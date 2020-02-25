package com.zd.pattern.factory.factorymethod;

import com.zd.pattern.factory.simplefactory.IPayment;

public class FactorymethodTest {
	public static void main(String[] args) {
		
		IPaymentFactory paymentFactory = new AlipayFactory();
		IPayment payment = paymentFactory.createPayment();
		payment.pay();
		
		
	}
}
