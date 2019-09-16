package com.atguigu.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.crud.bean.Address;
import com.atguigu.crud.bean.Msg;

import com.atguigu.crud.service.AddressService;

@Controller
public class AddressController {

	
	@Autowired
	AddressService addressService;
	
	//查出所有所属区域信息
		@RequestMapping("/getAddress")
		@ResponseBody
		public Msg getAddress(@RequestParam("worldId")Integer worldId){
			List<Address> address = addressService.getAddress(worldId);
			return Msg.success().add("address", address);
		}
		
	//不带参数的查询
		@RequestMapping("/getAddressnoparam")
		@ResponseBody
		public Msg getAddressnoparam(){
			List<Address> address = addressService.getAddressnoparam();
			return Msg.success().add("address", address);
		}
}
