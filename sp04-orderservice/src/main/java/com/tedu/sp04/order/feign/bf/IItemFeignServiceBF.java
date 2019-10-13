package com.tedu.sp04.order.feign.bf;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp04.order.feign.IItemFeignService;
import com.tedu.web.util.JsonResult;
@Component
public class IItemFeignServiceBF implements IItemFeignService{

	@Override
	public JsonResult<List<Item>> getItems(String orderId) {
		// TODO Auto-generated method stub
		return JsonResult.err("获取 items失败");
	}

	@Override
	public JsonResult decreaseNumber(List<Item> items) {
		// TODO Auto-generated method stub
		return JsonResult.err("调整库存失败");
	}
	
}
