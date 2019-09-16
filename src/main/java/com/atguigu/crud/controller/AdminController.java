package com.atguigu.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.crud.bean.Admin;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.service.AdminService;

@Controller
public class AdminController {

	
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/findadmin")
	@ResponseBody
	public Msg findadmin(@RequestParam("adminName")String adminName,@RequestParam("password")String password){
	   List <Admin> admin= adminService.findadmin(adminName,password);
	   return Msg.success().add("admin", admin);
	}
}
