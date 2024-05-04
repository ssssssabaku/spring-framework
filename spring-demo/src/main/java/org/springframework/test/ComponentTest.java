package org.springframework.test;

import org.springframework.stereotype.Service;

@Service
public class ComponentTest {

	public ComponentTest() {
		System.out.println("this is ComponentTest 构造器");
	}

	public void info(){
		System.out.println("this is ComponentTest info()");
	}

}
