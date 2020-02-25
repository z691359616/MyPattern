package com.zd.pattern.factory.abstractfactory;

public class AlipayFactory implements PaymentFactory{

	@Override
	public InlandPay inlandPayment() {
		return new AliInlandPay();
	}

	@Override
	public ForeignPay foreignPayment() {
		return new AliForeignPay();
	}
	
}
