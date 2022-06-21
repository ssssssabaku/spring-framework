package org.springframework.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.demo.config.DemoConfig;
import org.springframework.demo.service.DemoService;
import org.springframework.demo.service.UserService;

/**
 * vm options add  --add-opens java.base/java.lang=ALL-UNNAMED
 *
 * @author zwf
 * @DATE 2022/6/21 16:14
 */
public class DemoApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(DemoConfig.class);
		DemoService demoService = app.getBean(DemoService.class);
		UserService bean = app.getBean(UserService.class);

		demoService.show();
		bean.getUserInfo();


	}
}
