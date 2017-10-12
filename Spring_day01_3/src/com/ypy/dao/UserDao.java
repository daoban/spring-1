package com.ypy.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ypy.model.UserModel;

public class UserDao {
	private JdbcTemplate template;
	private String sql;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void save() {
		sql = "insert into t_user (userid,username) values (seq_t_user.nextval,?)";
		template.update(sql, "nnn");
	}
	
	public void delete() {
		sql = "delete from t_user where userid = ?";
		template.update(sql, 120);
	}
	
	public void update() {
		sql = "update t_user set username=? where userid=?";
		template.update(sql, "vvv", 120);
	}
	
	public List<UserModel> query() {
		sql = "select * from t_user";
		RowMapper<UserModel> rowMapper = new BeanPropertyRowMapper<UserModel>(UserModel.class);
		return template.query(sql, rowMapper);
	}
	
	public UserModel queryForOne() {
		sql = "select * from t_user where userid = ?";
		RowMapper<UserModel> rowMapper = new BeanPropertyRowMapper<UserModel>(UserModel.class);
		return template.queryForObject(sql, rowMapper, 1);
	}
	
	public int queryCount() {
		sql = "select count(1) from t_user";
		return template.queryForObject(sql, Integer.class);
	}
}
