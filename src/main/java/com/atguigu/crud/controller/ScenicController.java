package com.atguigu.crud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.bean.Scenic;

import com.atguigu.crud.service.ScenicService;
//import com.atguigu.crud.test.Mail;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class ScenicController {

	@Autowired
	ScenicService scenicService;
	
	
	
	
	@RequestMapping(value="/scenicsearch/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getScenicDetail(@PathVariable("id")Integer id) {
		Scenic scenic=scenicService.getScenicDetail(id);
		return Msg.success().add("scenic",scenic);
		
	}
	
	
	//查出的所有热门景点信息
	@RequestMapping("/searchHot")
	@ResponseBody
	public Msg getHot(){
		List<Scenic> scenic = scenicService.getHot();
		return Msg.success().add("scenic", scenic);
	}
	
	//分页查出所有景点
	@RequestMapping("/searchHot_page")
	@ResponseBody
	public Msg getHot_page(@RequestParam(value = "pn", defaultValue = "1") Integer pn){
		// 这不是一个分页查询
				// 引入PageHelper分页插件
				// 在查询之前只需要调用，传入页码，以及每页的大小
				PageHelper.startPage(pn, 5);
				// startPage后面紧跟的这个查询就是一个分页查询
				List<Scenic> scenic = scenicService.getHot_page();
				// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
				// 封装了详细3的分页信息,包括有我们查询出来的数据，传入连续显示的页数
				PageInfo page = new PageInfo(scenic, 5);
				return Msg.success().add("pageInfo", page);
	}
	
	//查询所有推荐景点信息
	@RequestMapping("/searchRecommend")
	@ResponseBody
	public Msg searchRecommend(@RequestParam("isRecommend")Boolean isRecommend){
	   List <Scenic> scenic= scenicService.getRecommend(isRecommend);
	   return Msg.success().add("scenic", scenic);
	}
	
	//按地区分类查询景点
	@RequestMapping("/categorysearch")
	@ResponseBody
	public Msg categorysearch(@RequestParam("regionId")Integer regionId){
	   List <Scenic> scenic= scenicService.categorysearch(regionId);
	   return Msg.success().add("scenic", scenic);
	}
	
	//按照景点名字查出景点id
	@RequestMapping("/findscenicId")
	@ResponseBody
	public Msg findscenicId(@RequestParam("scenicName")String scenicName){
	   List <Scenic> scenic= scenicService.findscenicId(scenicName);
	   return Msg.success().add("scenic", scenic);
	}
	
	//在后台景点管理页面搜索框查询
	@RequestMapping("/findscenicinfo")
	@ResponseBody
	public Msg findscenicinfo(@RequestParam("scenicName")String scenicName){
	   List <Scenic> scenic= scenicService.findscenicinfo(scenicName);
	   return Msg.success().add("scenic", scenic);
	}
	
	//按主题查询景点
	@RequestMapping("/themesearch")
	@ResponseBody
	public Msg themesearch(@RequestParam("themeId")Integer themeId){
	   List <Scenic> scenic= scenicService.themesearch(themeId);
	   return Msg.success().add("scenic", scenic);
	}
	
	//在summary查询国内游
	@RequestMapping("/chinasearch")
	@ResponseBody
	public Msg chinasearch(@RequestParam("worldId")Integer worldId){
	   List <Scenic> scenic= scenicService.chinasearch(worldId);
	   return Msg.success().add("scenic", scenic);
	}
	
	//在summary查询特价游
	@RequestMapping("/ischeapsearch")
	@ResponseBody
	public Msg ischeapsearch(@RequestParam("isCheap")Boolean isCheap){
	   List <Scenic> scenic= scenicService.ischeapsearch(isCheap);
	   return Msg.success().add("scenic", scenic);
	}
	
	 //搜索框进行模糊查询
	@RequestMapping("/scenicNamesearch")
	@ResponseBody
	public Msg scenicNamesearch(@RequestParam("scenicName")String scenicName){
	   List <Scenic> scenic= scenicService.scenicNamesearch(scenicName);
	   return Msg.success().add("scenic", scenic);
	}
	
	
	//查询所有收藏景点ID的对应景点信息
		@ResponseBody
		@RequestMapping("/findcollectscenic")
		public Msg findcollectscenic(@RequestParam("scenicId")Integer[] scenicId){
			List<Integer> sceniclist=new ArrayList<Integer>();
			for(int i=0;i<scenicId.length;i++) {
				sceniclist.add(scenicId[i]);
			}
			List <Scenic> scenic =scenicService.findcollectscenic(sceniclist);
			return Msg.success().add("scenic", scenic);
		}
	
	
	//按地区分类+评分从高到低  查询景点
	/*@RequestMapping("/categoryscoresearch")
	@ResponseBody
	public Msg categoryscoresearch(@RequestParam("regionId")Integer regionId){
	   List <Scenic> scenic= scenicService.categoryscoresearch(regionId);
	   return Msg.success().add("scenic", scenic);
	}*/
	
	//保存新增景点信息
		@RequestMapping(value="/saveaddscenic",method=RequestMethod.POST)
		@ResponseBody
		public Msg saveaddscenic(@Valid Scenic scenic){	
			    scenicService.saveaddscenic(scenic);
				return Msg.success();	
		}
		
	//修改新增景点信息
		@ResponseBody
		@RequestMapping(value="/updatescenic/{scenicId}",method=RequestMethod.PUT)
		public Msg updatescenic(Scenic scenic,HttpServletRequest request) {
			scenicService.updatescenic(scenic);
			return Msg.success();
		}
		
	//查询新增景点信息
		@RequestMapping("/searchaddscenic")
		@ResponseBody
		public Msg searchaddscenic(){
			List<Scenic> scenic = scenicService.searchaddscenic();
			return Msg.success().add("scenic", scenic);
		}
		
    //删除景点信息
		@ResponseBody
		@RequestMapping(value="/deletescenic/{scenicId}",method=RequestMethod.DELETE)
		public Msg deletescenic(@PathVariable("scenicId")Integer scenicId) {	
			scenicService.deletescenic(scenicId);
			return Msg.success();
		}
}
