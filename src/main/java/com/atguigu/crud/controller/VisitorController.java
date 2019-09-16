package com.atguigu.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.atguigu.crud.bean.Msg;

import com.atguigu.crud.bean.Visitor;
import com.atguigu.crud.service.VisitorService;

@Controller
public class VisitorController {

	
	@Autowired
	VisitorService visitorService;
	
	//将出行人信息插入到visiotr表
	@RequestMapping(value="/insertvisitor",method=RequestMethod.POST)
	@ResponseBody
	public Msg insertvisitor(Visitor visitor) {
		visitorService.insertvisitor(visitor);
		return Msg.success();
	}
	
	//查出该用户的出行人信息
	@ResponseBody
	@RequestMapping("/findallvisitor")
	public Msg findallvisitor(@RequestParam("userId")Integer userId){
		List <Visitor> visitor =visitorService.findallvisitor(userId);
		return Msg.success().add("visitor", visitor);
	}
	
	//删除该出行人信息
	@ResponseBody
	@RequestMapping(value="/deletevisitor/{visitorId}",method=RequestMethod.DELETE)
	public Msg deletevisitor(@PathVariable("visitorId")Integer visitorId) {	
		visitorService.deletevisitor(visitorId);
		return Msg.success();
	}
	
	//编辑一条用户出行人信息  查出单条
	@RequestMapping(value="/findonevisitor/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg findonevisitor(@PathVariable("id")Integer id) {
		Visitor visitor=visitorService.findonevisitor(id);
		return Msg.success().add("visitor",visitor);
		
	}
}
