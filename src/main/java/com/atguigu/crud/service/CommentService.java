package com.atguigu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.Comment;
import com.atguigu.crud.bean.CommentExample;

import com.atguigu.crud.bean.CommentExample.Criteria;
import com.atguigu.crud.dao.CommentMapper;



@Service
public class CommentService {

	@Autowired
	CommentMapper commentMapper;
	
	//在详情页面查询评论
	public List <Comment>  findcomment(Integer scenicId){
		CommentExample commentExample=new CommentExample();
		Criteria criteria = commentExample.createCriteria();
		criteria.andScenicIdEqualTo(scenicId);
		return commentMapper.selectByExample(commentExample);
		
	}
	
	//查询某个用户的全部评论
		public List <Comment>  findusercomment(Integer userId){
			CommentExample commentExample=new CommentExample();
			Criteria criteria = commentExample.createCriteria();
			criteria.andUserIdEqualTo(userId);
			return commentMapper.selectByExample(commentExample);
			
		}
	
	//插入评论
	 public void insertcomment(Comment comment) {
		 commentMapper.insertSelective(comment);
    }
	 
	 //根据主键查评论
	 public Comment commentsearch(Integer id) {
		 Comment comment=commentMapper.selectByPrimaryKey(id);
			return comment;
		}
	 
	 //更新评论
	 public void updatecomment(Comment comment) {
			// TODO Auto-generated method stub
		 commentMapper.updateByPrimaryKeySelective(comment);
		}
}
