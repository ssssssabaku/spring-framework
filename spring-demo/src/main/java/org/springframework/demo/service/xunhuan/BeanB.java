package org.springframework.demo.service.xunhuan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {


	@Autowired
	private BeanA beanA;


	public void getInfo(){
		System.out.println("this is Bean B beanA:"+beanA);
	}
}
