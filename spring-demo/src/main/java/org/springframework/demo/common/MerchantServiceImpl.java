package org.springframework.demo.common;


import org.springframework.stereotype.Component;

@Component
public class MerchantServiceImpl implements MerchantService{
	@Override
	public void getMerchantInfo() {
		System.out.println("this is merchant info return 支付宝");
	}


	public MerchantServiceImpl() {
		System.out.println("this is MerchantServiceImpl constrauct");
	}
}
