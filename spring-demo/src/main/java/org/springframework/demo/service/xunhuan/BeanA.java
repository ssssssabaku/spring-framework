package org.springframework.demo.service.xunhuan;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

	@Resource
	private BeanB beanB;


	public void getInfo(){
		System.out.println("this is bean A  beanB:"+beanB);
	}

}
