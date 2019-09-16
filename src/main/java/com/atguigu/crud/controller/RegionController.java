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
import com.atguigu.crud.bean.Region;

import com.atguigu.crud.service.RegionService;

@Controller
public class RegionController {

	
	
	@Autowired
	RegionService regionservice;
	
	@RequestMapping("/searchregion")
	@ResponseBody
	public Msg searchregion(@RequestParam("addressId")Integer addressId){
	   List <Region> region= regionservice.searchregion(addressId);
	   return Msg.success().add("region", region);
	}
	
/*	@RequestMapping(value="/searchregion/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg searchregion(@PathVariable("id")Integer id) {
		Region region=regionservice.searchregion(id);
		return Msg.success().add("region",region);
		
	}*/
	
	//查出所有境内外信息
		@RequestMapping("/getRegion")
		@ResponseBody
		public Msg getRegion(@RequestParam("addressId")Integer addressId){
			List<Region> region = regionservice.getRegion(addressId);
			return Msg.success().add("region", region);
		}
		
	//不带参数
		@RequestMapping("/getRegionnoparam")
		@ResponseBody
		public Msg getRegionnoparam(){
			List<Region> region = regionservice.getRegionnoparam();
			return Msg.success().add("region", region);
		}
}
