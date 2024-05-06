package org.springframework.demo.jdbc;

import jakarta.annotation.Resource;
import org.springframework.core.annotation.Order;
import org.springframework.demo.jdbc.mapper.TestMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Order(10000)
public class TransactionTest {

	@Resource
	private TestMapper  testMapper;

	/**
	 * isolation隔离级别 （两个事务之间）
	 * propagation传播机制（嵌套事务之间）
	 * rollbackFor哪些异常回滚
	 * timeOut 超过多少时间自动回滚
	 * @param name
	 * @return
	 */
	@Transactional(rollbackFor = Exception.class,isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
	public int updateName(String name){
		Integer id = 1;
		if(null == name){
			name = "abcd";
		}
		return testMapper.updateNameById(id,name);
	}

}
