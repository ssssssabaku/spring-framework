package org.springframework.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * 测试构造器推断
 */
@Component
public class ConstructorArgsDemo {


	@Autowired
	private DemoService demoService;
	@Autowired
	private UserService userService;

	@Autowired(required = false)
	public ConstructorArgsDemo(UserService userService) {
		System.out.println("this is ConstructorArgsDemo constructor method info.....");
		this.userService = userService;
	}
	@Autowired(required = false)
	public ConstructorArgsDemo(DemoService demoService, UserService userService) {
		System.out.println("this is ConstructorArgsDemo constructor method info.....");
		this.userService = userService;
		this.demoService = demoService;
	}

	public ConstructorArgsDemo() {
		System.out.println("this is ConstructorArgsDemo no args constructor");
	}

	public void getInfo(){
		System.out.println("this is ConstructorArgsDemo getInfo() demoService: "+demoService+" userService: "+userService);
	}
}
