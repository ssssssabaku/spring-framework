package org.springframework.demo.common;


import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * 实现了SmartInstantiationAwareBeanPostProcessor接口
 * 就可以在构造器推断时 直接使用该接口返回的构造器进行实例化
 */
//@Component
public class SmartInstantiationAwareBeanPostProcessorDemo implements SmartInstantiationAwareBeanPostProcessor {




	@Override
	public Constructor<SmartInstantiationAwareBeanPostProcessorDemo>[] determineCandidateConstructors(Class<?> beanClass, String beanName)
			throws BeansException {
//		System.out.println("this is smartProcess beanName:"+beanName);
//		Constructor<SmartInstantiationAwareBeanPostProcessorDemo> con = null;
//		try {
//			con = SmartInstantiationAwareBeanPostProcessorDemo.class.getConstructor(SmartInstantiationAwareBeanPostProcessorDemo.class);
//		} catch (NoSuchMethodException e) {
//			e.printStackTrace();
//		}
//		Constructor [] constructors = new Constructor[]{};
//		constructors[0] = con;
//		return constructors;
	 	SmartInstantiationAwareBeanPostProcessor.super.determineCandidateConstructors(beanClass,beanName);
		 return null;
	}

	public void getInfo(){
		System.out.println("this is SmartInstantiationAwareBeanPostProcessorDemo getInfo()");
	}

	/**
	 * 完成bean依赖属性初始化后的处理器
	 */
	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName)
			throws BeansException {
		System.out.println("this is postProcessProperties for SmartInstantiationAwareBeanPostProcessorDemo");

		return pvs;
	}
}
