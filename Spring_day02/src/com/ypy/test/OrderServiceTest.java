package com.ypy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ypy.service.OrderService;

public class OrderServiceTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		OrderService order = ac.getBean(OrderService.class);
		order.save();
	}

}
