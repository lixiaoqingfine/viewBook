package com.atguigu.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.bean.User;
import com.atguigu.crud.service.UserService;


@Controller
public class UserController {
  
	
	@Autowired
	UserService userservice;
	
	//将用户信息插入到用户表
	@RequestMapping(value="/insertuser",method=RequestMethod.POST)
	@ResponseBody
	public Msg insertuser(User user) {
		userservice.insertcollect(user);
		return Msg.success();
	}
	
	//查询该用户是否已经注册
	@RequestMapping("/finduser")
	@ResponseBody
	public Msg finduser(@RequestParam("openId")String openId){
	   List <User> user= userservice.finduser(openId);
	   return Msg.success().add("user", user);
	}
	
	//更新该用户的个人信息
	@ResponseBody
	@RequestMapping(value="/updateuser/{userId}",method=RequestMethod.PUT)
	public Msg updateuser(User user,HttpServletRequest request) {
		userservice.updateuser(user);
		return Msg.success();
	}
	
	//查询用户密码
	@RequestMapping("/finduserpsw")
	@ResponseBody
	public Msg finduserpsw(@RequestParam("userId")Integer userId){
	   List <User> user= userservice.finduserpsw(userId);
	   return Msg.success().add("user", user);
	}
	
	
	
}
