package org.springframework.demo.postProcessor;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * 生成bean阶段修改bean属性
 */
@Component
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		if("transactionTest".equals(beanName)){
			System.out.println("2222222--------transactionTest  MyMergedBeanDefinitionPostProcessor 222222222-------");
		}
	}
}
