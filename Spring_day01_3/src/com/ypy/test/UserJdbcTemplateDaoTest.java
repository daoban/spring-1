package com.ypy.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ypy.dao.UserJdbcTemplateDao;
import com.ypy.model.UserModel;

public class UserJdbcTemplateDaoTest {
	/*@Test
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
	}*/
	
	@Test
	public void testSave() throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserJdbcTemplateDao dao = ac.getBean(UserJdbcTemplateDao.class);
		dao.save();
	}
	
	@Test
	public void testDelete() throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserJdbcTemplateDao dao = ac.getBean(UserJdbcTemplateDao.class);
		dao.delete();
	}
	
	@Test
	public void testUpdate() throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserJdbcTemplateDao dao = ac.getBean(UserJdbcTemplateDao.class);
		dao.update();
	}
	
	@Test
	public void testQuery() throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserJdbcTemplateDao dao = ac.getBean(UserJdbcTemplateDao.class);
		List<UserModel> list = dao.query();
		for (UserModel userModel : list) {
			System.out.println(userModel);
		}
	}
	
	@Test
	public void testQueryForOne() throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserJdbcTemplateDao dao = ac.getBean(UserJdbcTemplateDao.class);
		UserModel user = dao.queryForOne();
		System.out.println(user);
	}
	
	@Test
	public void testQueryCount() throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserJdbcTemplateDao dao = ac.getBean(UserJdbcTemplateDao.class);
		int count = dao.queryCount();
		System.out.println(count);
	}
}
