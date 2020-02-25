package com.zd.pattern.factory.simplefactory;

public class PaymentFactory {
	public IPayment createPayment(Class<? extends IPayment> clazz){
		try {
			if(null != clazz)
				return clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
