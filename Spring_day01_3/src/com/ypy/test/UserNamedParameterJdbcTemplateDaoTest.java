package com.ypy.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ypy.dao.UserNamedParameterJdbcTemplateDao;
import com.ypy.model.UserModel;

public class UserNamedParameterJdbcTemplateDaoTest {

	private UserNamedParameterJdbcTemplateDao dao;

	//在test之前执行
	@Before
	public void setUp() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		dao = ac.getBean(UserNamedParameterJdbcTemplateDao.class);
	}

	@Test
	public void testSave() {   
		UserModel user = new UserModel();
		user.setUsername("qqqqqqq");
		dao.save(user);
	}

	@Test
	public void testUpdate() {
		dao.update();
	}
	
	@Test
	public void testDelete() {
		dao.delete();
	}
	
	@Test
	public void testQuery() {
		List<UserModel> list = dao.query();
		for (UserModel userModel : list) {
			System.out.println(userModel);
		}
	}
}
