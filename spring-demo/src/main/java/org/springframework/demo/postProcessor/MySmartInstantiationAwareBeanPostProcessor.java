package org.springframework.demo.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

@Component
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

	/**
	 * 获取构造函数
	 * @param beanClass the raw class of the bean (never {@code null})
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName)
			throws BeansException {
		if("transactionTest".equals(beanName)){
			System.out.println("111111--------transactionTest  MySmartInstantiationAwareBeanPostProcessor  11111111");
		}
		return null;
	}
}
