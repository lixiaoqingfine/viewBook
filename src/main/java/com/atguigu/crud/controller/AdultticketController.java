package com.atguigu.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.crud.bean.Adultticket;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.service.AdultticketService;

@Controller
public class AdultticketController {

	
	@Autowired
	AdultticketService adultticketService;
	
	//查询所有成人票信息
	@RequestMapping("/searchaddadultId")
	@ResponseBody
	public Msg searchaddadultId(){
		List<Adultticket> adultticket = adultticketService.searchaddadultId();
		return Msg.success().add("adultticket", adultticket);
	}
	
	//保存插入成人票价信息
	@RequestMapping(value="/saveaddadult",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveaddadult(@Valid Adultticket adultticket){	
	
		adultticketService.saveaddadult(adultticket);
			return Msg.success();	
	}
	
	//更新票价
	@ResponseBody
	@RequestMapping(value="/updateadultticket/{adultId}",method=RequestMethod.PUT)
	public Msg updateorder(Adultticket adultticket,HttpServletRequest request) {
		adultticketService.updateadultticket(adultticket);
		return Msg.success();
	}
	
}
