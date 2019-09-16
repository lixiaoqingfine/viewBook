package com.atguigu.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.bean.Olderticket;

import com.atguigu.crud.service.OlderticketService;

@Controller
public class OlderticketController {

	
	@Autowired
	OlderticketService olderticketService;
	
	
	//在详情页面查询儿童票价格
    @RequestMapping(value="/olderticketsearch/{olderId}",method=RequestMethod.GET)
	@ResponseBody
	public Msg olderticketsearch(@PathVariable("olderId")Integer olderId) {
    	Olderticket olderticket=olderticketService.olderticketsearch(olderId);
		return Msg.success().add("olderticket",olderticket);
			
	}
    
  //查询所有老人票信息
	@RequestMapping("/searchaddolderId")
	@ResponseBody
	public Msg searchaddolderId(){
		List<Olderticket> olderticket = olderticketService.searchaddolderId();
		return Msg.success().add("olderticket", olderticket);
	}
	
	//插入新增老人票价格
	@RequestMapping(value="/saveaddolder",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveaddolder(@Valid Olderticket olderticket){	
		olderticketService.saveaddolder(olderticket);
			return Msg.success();	
	}
	
	//更新票价
	@ResponseBody
	@RequestMapping(value="/updateolderticket/{olderId}",method=RequestMethod.PUT)
	public Msg updateolderticket(Olderticket olderticket,HttpServletRequest request) {
		olderticketService.updateolderticket(olderticket);
		return Msg.success();
	}
	
}
