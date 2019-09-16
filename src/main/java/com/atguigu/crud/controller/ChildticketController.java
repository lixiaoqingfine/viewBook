package com.atguigu.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.crud.bean.Childticket;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.service.ChildticketService;

@Controller
public class ChildticketController {

	
	@Autowired
	ChildticketService childticketService;
	
	//在详情页面查询儿童票价格
	@RequestMapping(value="/childticketsearch/{childId}",method=RequestMethod.GET)
	@ResponseBody
	public Msg childticketsearch(@PathVariable("childId")Integer childId) {
		Childticket childticket=childticketService.childticketsearch(childId);
		return Msg.success().add("childticket",childticket);
		
	}
	
	//保存插入儿童票价信息
			@RequestMapping(value="/saveaddchild",method=RequestMethod.POST)
			@ResponseBody
			public Msg saveaddchild(@Valid Childticket childticket){	
				childticketService.saveaddchild(childticket);
					return Msg.success();	
			}
			
   //查询所有儿童票信息
			@RequestMapping("/searchaddchildId")
			@ResponseBody
			public Msg searchaddchildId(){
				List<Childticket> childticket = childticketService.searchaddchildId();
				return Msg.success().add("childticket", childticket);
			}
			
   //更新票价
			@ResponseBody
			@RequestMapping(value="/updatechildticket/{childId}",method=RequestMethod.PUT)
			public Msg updateorder(Childticket childticket,HttpServletRequest request) {
				childticketService.updatechildticket(childticket);
				return Msg.success();
			}		
	
}
