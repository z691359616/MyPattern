package com.zd.pattern.factory.factorymethod;

import com.zd.pattern.factory.simplefactory.IPayment;
import com.zd.pattern.factory.simplefactory.Wechatpay;

public class WechatpayFactory implements IPaymentFactory{

	@Override
	public IPayment createPayment() {
		return new Wechatpay();
	}

}
