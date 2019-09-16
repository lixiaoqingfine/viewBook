package com.atguigu.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.bean.World;
import com.atguigu.crud.service.WorldService;

@Controller
public class WorldController {

	
	@Autowired
	WorldService worldService;
	
	//查出所有境内外信息
	@RequestMapping("/getWorld")
	@ResponseBody
	public Msg getWorld(){
		List<World> world = worldService.getWorld();
		return Msg.success().add("world", world);
	}
}
