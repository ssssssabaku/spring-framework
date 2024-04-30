package org.springframework.demo.common;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;


/**
 * 该处理器可以修改beanDefinition定义
 */
@Component
public class MergeBeanDedinitionProcessorDemo implements MergedBeanDefinitionPostProcessor {
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {

		System.out.println("this is MergeBeanDefinitionProcessor........definition: "+beanDefinition+",beanName: "+beanName);
	}

	@Override
	public void resetBeanDefinition(String beanName) {
		MergedBeanDefinitionPostProcessor.super.resetBeanDefinition(beanName);
	}
}
