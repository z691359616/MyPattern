package com.zd.pattern.factory.abstractfactory;

public interface PaymentFactory {
	InlandPay inlandPayment();
	ForeignPay foreignPayment();
}
