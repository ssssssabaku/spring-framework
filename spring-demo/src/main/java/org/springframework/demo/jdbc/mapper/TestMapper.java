package org.springframework.demo.jdbc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.HashMap;

@Mapper
public interface TestMapper {


	@Select("select id ,name from test where name=#{name}")
	HashMap<String,Object> queryByName(String name);

	@Update("update test set name=#{name} where id =#{id}")
	int updateNameById(Integer id,String name);


}
