package com.ypy.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class OrderDao {
	@Autowired
	private JdbcTemplate template;
	private String sql;
	
	public void saveOrder() {
		sql = "insert into t_orders (orderid,username) values (?,?)";
		template.update(sql, new Date().getTime(),"≤‚ ‘");
	}
	
	public void saveOrderDetial() {
		sql = "insert into t_orderdetail (detailid,orderid,mcid) values (seq_t_orderdetail.nextval,?,?)";
		template.update(sql, new Date().getTime(),88);
	}
}
