package com.tedu.sp04.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tedu.sp01.pojo.User;
import com.tedu.sp04.order.feign.bf.IUserFeignServiceFB;
import com.tedu.web.util.JsonResult;

@FeignClient(name = "user-service",fallback = IUserFeignServiceFB.class)
public interface IUserFeignService {
	@GetMapping("/{userId}")
	public JsonResult<User> getUser(@PathVariable Integer userId);

	@GetMapping("/{userId}/score")
	public JsonResult addScore(@PathVariable Integer userId, Integer score);
}
