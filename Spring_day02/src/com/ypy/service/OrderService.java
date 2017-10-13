package com.ypy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ypy.dao.OrderDao;

@Service
public class OrderService {
	@Autowired
	private OrderDao dao;
	
	public void save() {
		dao.saveOrder();
		dao.saveOrderDetial();
	}
}
