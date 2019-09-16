package com.atguigu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.atguigu.crud.bean.Visitor;
import com.atguigu.crud.bean.VisitorExample;
import com.atguigu.crud.bean.VisitorExample.Criteria;
import com.atguigu.crud.dao.VisitorMapper;

@Service
public class VisitorService {

	
	
	@Autowired
	VisitorMapper visitorMapper;
	
	//插入出行人信息到visitor表
	 public void insertvisitor(Visitor visitor) {
		 visitorMapper.insertSelective(visitor);
    }
	 
	 //查询该用户的出行人信息
	 public List <Visitor>  findallvisitor(Integer userId){
		  VisitorExample visitorExample=new VisitorExample();
			Criteria criteria = visitorExample.createCriteria();
			criteria.andUserIdEqualTo(userId);
			return visitorMapper.selectByExample(visitorExample);
		}
	 
	 //删除出行人信息
	 public void deletevisitor(Integer visitorId) {
			// TODO Auto-generated method stub
		 visitorMapper.deleteByPrimaryKey(visitorId);
		}
	 
	 //查出单条出行人信息 按主键查
	 public Visitor findonevisitor(Integer id) {
		 Visitor visitor=visitorMapper.selectByPrimaryKey(id);
			return visitor;
		}
}
