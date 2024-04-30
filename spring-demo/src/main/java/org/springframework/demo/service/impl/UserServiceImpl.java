package org.springframework.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.demo.common.MerchantService;
import org.springframework.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author zwf
 * @DATE 2022/6/21 17:07
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private MerchantService merchantService;

	@Override
	public void getUserInfo() {
		System.out.println("this is user info method");
		merchantService.getMerchantInfo();
	}


	public UserServiceImpl(){
		System.out.println("this is UserServiceImpl contruact");
	}
}
