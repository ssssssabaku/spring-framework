package org.springframework.demo.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.demo.service.ProxyChannelService;
import org.springframework.stereotype.Component;

@Component
public class ProxyChannelServiceImpl  implements ProxyChannelService,BeanPostProcessor {
	@Override
	public void getChannel() {
		System.out.println("get channel info.....to return alipay");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("this is ProxyChannelServiceImpl postProcessBeforeMethod");
		return bean;
	}
}
