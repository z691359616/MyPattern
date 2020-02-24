package com.zd.pattern.factory.simplefactory;

public class PaymentFactory {
	public Payment createPayment(Class<? extends Payment> clazz){
		try {
			if(null != clazz)
				return clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
