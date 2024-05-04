package org.springframework.demo.jdbc;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@MapperScan("org.springframework.demo.jdbc.mapper")
@EnableTransactionManagement
public class DataConfig {


	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("system");
		dataSource.setUrl("jdbc:mysql://192.168.1.20:3306/test?serverTimezone=UTC");
		return dataSource;
	}
	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
	@Bean
	public SqlSessionFactoryBean createSession(){
		SqlSessionFactoryBean sqlSessionFactory =new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		return sqlSessionFactory;
	}


}
