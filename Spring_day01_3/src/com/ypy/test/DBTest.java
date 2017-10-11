package com.ypy.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBTest {

	@Test
	public void testDBCP() throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource ds = (DataSource) ac.getBean("dataSourceDBCP");
		System.out.println(ds.getConnection());   //只要有返回值就说明连接成功
	}
	@Test
	public void testC3p0() throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource ds = (DataSource) ac.getBean("dataSourceC3p0");
		System.out.println(ds.getConnection());
	}
}
