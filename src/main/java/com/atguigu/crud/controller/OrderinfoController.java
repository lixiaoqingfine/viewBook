package com.atguigu.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.bean.Orderinfo;
import com.atguigu.crud.service.OrderinfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class OrderinfoController {

	
	@Autowired
	OrderinfoService orderinfoService;
	
	//支付成功插入订单表
	@RequestMapping(value="/insertorder",method=RequestMethod.POST)
	@ResponseBody
	public Msg insertorder(Orderinfo orderinfo) {
		orderinfoService.insertorder(orderinfo);
		return Msg.success();
	}
	
	 //查询该用户的订单详情
	@RequestMapping("/findorderinfo")
	@ResponseBody
	public Msg findorderinfo(@RequestParam("userId")Integer userId){
	   List <Orderinfo> orderinfo= orderinfoService.findorderinfo(userId);
	   return Msg.success().add("orderinfo", orderinfo);
	}
	
	//查询待使用的订单
	@RequestMapping("/findorderused")
	@ResponseBody
	public Msg findorderused(@RequestParam("orderUsed")Boolean orderUsed){
	   List <Orderinfo> orderinfo= orderinfoService.findorderused(orderUsed);
	   return Msg.success().add("orderinfo", orderinfo);
	}
	//查询待回复的订单
		@RequestMapping("/findordercomment")
		@ResponseBody
		public Msg findordercomment(@RequestParam("orderComment")Boolean orderComment){
		   List <Orderinfo> orderinfo= orderinfoService.findordercomment(orderComment);
		   return Msg.success().add("orderinfo", orderinfo);
		}
	
	
	
	 //根据动态码查询订单详情
		@RequestMapping("/findordercode")
		@ResponseBody
		public Msg findorder(@RequestParam("code")String code){
		   List <Orderinfo> orderinfo= orderinfoService.findorder(code);
		   return Msg.success().add("orderinfo", orderinfo);
		}
	
	//查询某一个订单（按主键去查订单）
	@RequestMapping(value="/findorderinfodetail/{orderId}",method=RequestMethod.GET)
	@ResponseBody
	public Msg findorderinfodetail(@PathVariable("orderId")Integer orderId) {
		Orderinfo orderinfo=orderinfoService.findorderinfodetail(orderId);
		return Msg.success().add("orderinfo",orderinfo);
	}
	
	//更新订单信息
	@ResponseBody
	@RequestMapping(value="/updateorder/{orderId}",method=RequestMethod.PUT)
	public Msg updateorder(Orderinfo orderinfo,HttpServletRequest request) {
		orderinfoService.updateorder(orderinfo);
		return Msg.success();
	}
	
	//分页查出所有景点
		@RequestMapping("/searchOrder_page")
		@ResponseBody
		public Msg getOrder_page(@RequestParam(value = "pn", defaultValue = "1") Integer pn){
			// 这不是一个分页查询
					// 引入PageHelper分页插件
					// 在查询之前只需要调用，传入页码，以及每页的大小
					PageHelper.startPage(pn, 5);
					// startPage后面紧跟的这个查询就是一个分页查询
					List<Orderinfo> orderinfo = orderinfoService.getOrder_page();
					// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
					// 封装了详细3的分页信息,包括有我们查询出来的数据，传入连续显示的页数
					PageInfo page = new PageInfo(orderinfo, 5);
					return Msg.success().add("pageInfo", page);
		}
	
		//删除订单
		@ResponseBody
		@RequestMapping(value="/deleteorder/{orderId}",method=RequestMethod.DELETE)
		public Msg deleteorder(@PathVariable("orderId")Integer orderId) {	
			orderinfoService.deleteorder(orderId);
			return Msg.success();
		}
		
}
