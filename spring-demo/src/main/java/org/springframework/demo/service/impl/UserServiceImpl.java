package org.springframework.demo.service.impl;

import org.springframework.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author zwf
 * @DATE 2022/6/21 17:07
 */
@Service
public class UserServiceImpl implements UserService {
	@Override
	public void getUserInfo() {
		System.out.println("this is user info method");
	}
}
