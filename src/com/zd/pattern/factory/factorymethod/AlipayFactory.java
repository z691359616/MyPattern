package com.zd.pattern.factory.factorymethod;

import com.zd.pattern.factory.simplefactory.Alipay;
import com.zd.pattern.factory.simplefactory.IPayment;

public class AlipayFactory implements IPaymentFactory {

	@Override
	public IPayment createPayment() {
		return new Alipay();
	}

}
