package com.atguigu.crud.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.crud.bean.Collect;
import com.atguigu.crud.bean.Msg;

import com.atguigu.crud.service.CollectService;

@Controller
public class CollectController {

	
	@Autowired
	CollectService collectService;
	
	//在景点详情页面查询是否收藏
	@ResponseBody
	@RequestMapping("/findcollect")
	public Msg checkuser(@RequestParam("userId")Integer userId,@RequestParam("scenicId")Integer scenicId){
		List <Collect> collect =collectService.findcollect(userId, scenicId);
		return Msg.success().add("collect", collect);
	}
	
	//查询收藏页面的 所有收藏景点ID
	@ResponseBody
	@RequestMapping("/findallcollect")
	public Msg findallcollect(@RequestParam("userId")Integer userId){
		List <Collect> collect =collectService.findallcollect(userId);
		return Msg.success().add("collect", collect);
	}
	
	
	
	//测试查询多个主键
	/*@ResponseBody
	@RequestMapping("/findarray")
	public Msg findarray(@RequestParam("testlist")Integer[]testlist){	
	    List<Integer> testlist1 = new ArrayList<Integer>();
	    for(int i=0;i<testlist.length;i++) {
	    	testlist1.add(testlist[i]);
        }
		List <Collect> collect =collectService.findarray(testlist1);
		return Msg.success().add("collect", collect);
	}*/
	
	
	
	@RequestMapping(value="/insertcollect",method=RequestMethod.POST)
	@ResponseBody
	public Msg insertcollect(Collect collect) {
		collectService.insertcollect(collect);
		return Msg.success();
	}
	
	@ResponseBody
	@RequestMapping(value="/updatecollect/{collectionId}",method=RequestMethod.PUT)
	public Msg update_ticket(Collect collect,HttpServletRequest request) {
		
		collectService.updatecollect(collect);
		return Msg.success();
	}
	
	//在景点详情页面删除收藏景点
	@ResponseBody
	@RequestMapping(value="/deletecollect/{collectId}",method=RequestMethod.DELETE)
	public Msg deletecollect(@PathVariable("collectId")Integer collectId) {	
		collectService.deletecollect(collectId);
		return Msg.success();
	}
	
	
	
}
