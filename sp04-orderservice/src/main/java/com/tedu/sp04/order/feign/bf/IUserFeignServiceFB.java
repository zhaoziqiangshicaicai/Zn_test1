package com.tedu.sp04.order.feign.bf;

import org.springframework.stereotype.Component;

import com.tedu.sp01.pojo.User;
import com.tedu.sp04.order.feign.IUserFeignService;
import com.tedu.web.util.JsonResult;
@Component
public class IUserFeignServiceFB implements IUserFeignService {

	@Override
	public JsonResult<User> getUser(Integer userId) {
		// TODO Auto-generated method stub
		return JsonResult.err("获取user失败");
	}

	@Override
	public JsonResult addScore(Integer userId, Integer score) {
		// TODO Auto-generated method stub
		return JsonResult.err("添加user-addScore失败");
	}

}
