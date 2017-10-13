package com.ypy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ypy.service.UserService;

public class UserServiceTest {

	@Test
	public void testHello() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService u = ac.getBean(UserService.class);
		u.hello();
		u.query();
	}

}
