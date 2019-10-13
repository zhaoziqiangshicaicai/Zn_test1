package com.tedu.sp04.order.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.pojo.Order;
import com.tedu.sp01.pojo.User;
import com.tedu.sp01.service.OrderService;
import com.tedu.sp04.order.feign.IItemFeignService;
import com.tedu.sp04.order.feign.IUserFeignService;
import com.tedu.web.util.JsonResult;

import lombok.extern.slf4j.Slf4j; 
@Slf4j 
@Service 
public class OrderServiceImpl implements OrderService {
	@Autowired
	private IItemFeignService itemFeignService;
	
	@Autowired
	private IUserFeignService userFeignService;
	
	@Override 
	public Order getOrder(String orderId) {
		//TODO: 调用user‐service获取用户信息 
		//TODO: 调用item‐service获取商品信息 
		JsonResult<List<Item>> items = itemFeignService.getItems("10"); 
		System.out.println("items : "+items);
		JsonResult<User> user = userFeignService.getUser(10);
		System.out.println("user : "+user);
		//TODO: 调用item‐service获取商品信息 
		//userFeignService.getUser(userId)
		Order order = new Order(); 
		order.setId(orderId); 
		return order;
	}
	@Override
	public void addOrder(Order order) {
	//TODO: 调用item‐service减少商品库存 
	//TODO: 调用user‐service增加用户积分 
		log.info("保存订单："+order); 
		} 
	}
