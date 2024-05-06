package org.springframework.demo.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;


@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	public MyInstantiationAwareBeanPostProcessor(){
		System.out.println("this is MyInstantiationAwareBeanPostProcessor new()");
	}


	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if("transactionTest".equals(beanName)){
			System.out.println("33333--------transactionTest  InstantiationAwareBeanPostProcessor  Before3333-------");
		}
		return null;
	}

	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if("transactionTest".equals(beanName)){
			System.out.println("3333333=======transactionTest  InstantiationAwareBeanPostProcessor  after3333=======");
		}
		return true;
	}
}
