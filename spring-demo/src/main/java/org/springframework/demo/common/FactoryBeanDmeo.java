package org.springframework.demo.common;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;


/**
 * 如果实现了factoryBean则可以直接实例化该类，不需要经过spring的构造器推断
 */
@Component
public class FactoryBeanDmeo implements FactoryBean<FactoryBeanDmeo> {
	@Override
	public FactoryBeanDmeo getObject() throws Exception {
		System.out.println("this is factoryBean getObject()");
		return new FactoryBeanDmeo();
	}

	@Override
	public Class<?> getObjectType() {
		return FactoryBeanDmeo.class;
	}

	public void getInfo(){
		System.out.println("this is factoryBeanDemo getInfo()");
	}
}
