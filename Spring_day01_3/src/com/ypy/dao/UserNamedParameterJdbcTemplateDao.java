package com.ypy.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.ypy.model.UserModel;

public class UserNamedParameterJdbcTemplateDao {
	private NamedParameterJdbcTemplate template;
	private String sql;

	public void setTemplate(NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	
	public void save(UserModel user) {
		sql = "insert into t_user (userid,username) values (seq_t_user.nextval,:username)";
		SqlParameterSource source = new BeanPropertySqlParameterSource(user);
		template.update(sql, source);
	}
	
	public void update() {   //也可用save方法的那种方式
		sql = "update t_user set username=:username where userid=:userid";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", "顶顶顶");
		map.put("userid", 140);
		template.update(sql, map);
	}
	
	public void delete() {
		sql = "delete from t_user where userid=:userid";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userid", 140);
		template.update(sql, map);
	}
	
	//查询时需要转换为JdbcTemplate
	public List<UserModel> query() {
		sql = "select * from t_user";
		RowMapper<UserModel> rowMapper = new BeanPropertyRowMapper<UserModel>(UserModel.class);
		return template.getJdbcOperations().query(sql, rowMapper);
	}
}
