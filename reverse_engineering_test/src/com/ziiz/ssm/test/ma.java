package com.ziiz.ssm.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ziiz.ssm.mapper.UserMapper;
import com.ziiz.ssm.po.User;

public class ma {
	@Test
	public void test()  {
		 @SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		 
		 UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
			User user = new User();
			user.setUserage(42);
			user.setUsercode("0002");
			user.setUsername("南达娜");
			user.setUsersex(1);
			userMapper.insert(user);
			
		}
}
