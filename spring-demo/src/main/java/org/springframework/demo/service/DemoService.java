package org.springframework.demo.service;

import org.springframework.stereotype.Component;

/**
 * @author zwf
 * @DATE 2022/6/21 16:16
 */
@Component
public class DemoService {

	public void show() {
		System.out.println("this is demoService method show()");
	}


	public DemoService() {
		System.out.println("这是 is DemoService no Args controller");
	}
}
