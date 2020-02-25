package com.zd.pattern.factory.factorymethod;

import com.zd.pattern.factory.simplefactory.IPayment;

public interface IPaymentFactory {
	IPayment createPayment();
}
