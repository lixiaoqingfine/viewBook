package com.atguigu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.atguigu.crud.bean.User;
import com.atguigu.crud.bean.UserExample;
import com.atguigu.crud.bean.UserExample.Criteria;
import com.atguigu.crud.dao.UserMapper;



@Service
public class UserService {

	
	@Autowired
	UserMapper userMapper;
	
	//插入用户数据
		 public void insertcollect(User user) {
			 userMapper.insertSelective(user);
	    }
		 
		 
   //查询该用户是否已经注册
		 public List <User>  finduser(String openId){
			   UserExample userExample =new UserExample();
				Criteria criteria = userExample.createCriteria();
				criteria.andCodeEqualTo(openId);
				return userMapper.selectByExample(userExample);
			}
		 
   //更新用户信息
		 public void updateuser(User user) {
				// TODO Auto-generated method stub
			 userMapper.updateByPrimaryKeySelective(user);
			}
		 
  //查询用户的支付密码
		 public List <User>  finduserpsw(Integer userId){
			   UserExample userExample =new UserExample();
				Criteria criteria = userExample.createCriteria();
				criteria.andUserIdEqualTo(userId);
				return userMapper.selectByExample(userExample);
			}
		 
}
