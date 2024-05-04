package org.springframework.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.demo.common.FactoryBeanDmeo;
import org.springframework.demo.common.SmartInstantiationAwareBeanPostProcessorDemo;
import org.springframework.demo.config.DemoConfig;
import org.springframework.demo.service.ConstructorArgsDemo;
import org.springframework.demo.service.DemoService;
import org.springframework.demo.service.UserService;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * vm options add  --add-opens java.base/java.lang=ALL-UNNAMED
 *
 * @author zwf
 * @DATE 2022/6/21 16:14
 */
public class DemoApplication {

	public static void main(String[] args) throws SQLException {

		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(DemoConfig.class);
		DemoService demoService = app.getBean(DemoService.class);
		UserService bean = app.getBean(UserService.class);
		FactoryBeanDmeo factoryBeanDemo = app.getBean(FactoryBeanDmeo.class);
//		SmartInstantiationAwareBeanPostProcessorDemo smartProcessor = app.getBean(SmartInstantiationAwareBeanPostProcessorDemo.class);
		ConstructorArgsDemo constructorArgsDemo = app.getBean(ConstructorArgsDemo.class);

		demoService.show();
		bean.getUserInfo();
		factoryBeanDemo.getInfo();
//		smartProcessor.getInfo();
		constructorArgsDemo.getInfo();

		System.out.println(app.getBean(DataSource.class).getConnection());


	}
}
