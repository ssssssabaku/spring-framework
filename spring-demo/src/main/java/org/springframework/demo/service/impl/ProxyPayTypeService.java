package org.springframework.demo.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class ProxyPayTypeService  implements InstantiationAwareBeanPostProcessor {

	public ProxyPayTypeService() {
		System.out.println("this is payTypeContracut");
	}

	//实例化后 属性填充前的前置处理
	public  Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("this is ProxyPayTypeService processBeforeMethod ");
		return null;
	}
}
