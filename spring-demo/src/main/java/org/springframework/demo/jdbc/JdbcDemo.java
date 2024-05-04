package org.springframework.demo.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.demo.config.DemoConfig;
import org.springframework.demo.jdbc.mapper.TestMapper;

public class JdbcDemo {


	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(DemoConfig.class);

		TestMapper mapper = app.getBean(TestMapper.class);
		System.out.println(mapper.queryByName("zhangsan"));
	}
}
