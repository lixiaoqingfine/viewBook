package com.atguigu.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.crud.bean.Comment;
import com.atguigu.crud.bean.Msg;

import com.atguigu.crud.service.CommentService;

@Controller
public class CommentController {

	
	@Autowired
	CommentService commentService;
	
	
	//在详情页面查询评论
	@RequestMapping("/findcomment")
	@ResponseBody
	public Msg findcomment(@RequestParam("scenicId")Integer scenicId){
		List <Comment> comment= commentService.findcomment(scenicId);
	   return Msg.success().add("comment", comment);
	}
	
	//查询某个用户的全部评论
	@RequestMapping("/findusercomment")
	@ResponseBody
	public Msg findusercomment(@RequestParam("userId")Integer userId){
		List <Comment> comment= commentService.findusercomment(userId);
	   return Msg.success().add("comment", comment);
	}
	
	//插入评论
	@RequestMapping(value="/insertcomment",method=RequestMethod.POST)
	@ResponseBody
	public Msg insertcomment(Comment comment) {
		commentService.insertcomment(comment);
		return Msg.success();
	}
	
	//根据主键去查评论
	@RequestMapping(value="/commentsearch/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg commentsearch(@PathVariable("id")Integer id) {
		Comment comment=commentService.commentsearch(id);
		return Msg.success().add("comment",comment);
		
	}
	
	//更新评论
	
	@ResponseBody
	@RequestMapping(value="/updatecomment/{commentId}",method=RequestMethod.PUT)
	public Msg updatecomment(Comment comment,HttpServletRequest request) {
		commentService.updatecomment(comment);
		return Msg.success();
	}
}
