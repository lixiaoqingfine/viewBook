package com.atguigu.crud.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.crud.dao.AdminMapper;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {

	@Autowired
	AdminMapper adminMapper;
	
	
	
	@Test
	public void testCRUD(){
		
		System.out.println(adminMapper);
		
	/*	ticket record=new ticket(null,2,2, (long)99);
	
		ticketMapper.insert(record);*/
		/*ticketMapper.updateByPrimaryKeySelective(record);*/
		
	/*	EmployeeExample example = new EmployeeExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailEqualTo(email);
		long count = employeeMapper.countByExample(example);
		return count == 0;*/
	}


}
