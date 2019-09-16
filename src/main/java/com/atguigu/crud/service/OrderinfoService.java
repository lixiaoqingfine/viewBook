package com.atguigu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.bean.Orderinfo;
import com.atguigu.crud.bean.OrderinfoExample;
import com.atguigu.crud.bean.OrderinfoExample.Criteria;
import com.atguigu.crud.dao.OrderinfoMapper;



@Service
public class OrderinfoService {

	
	
	@Autowired
	OrderinfoMapper orderinfoMapper;
	
	//支付成功插入订单表
	public void insertorder(Orderinfo orderinfo) {
		orderinfoMapper.insertSelective(orderinfo);
    }
	
	//查询该用户的订单
	public List <Orderinfo>  findorderinfo(Integer userId){
		OrderinfoExample orderinfoExample=new OrderinfoExample();
		Criteria criteria = orderinfoExample.createCriteria();
		criteria.andUserIdEqualTo(userId);
		return orderinfoMapper.selectByExample(orderinfoExample);
		
	}
	
	//查询待使用的订单
	public List <Orderinfo>  findorderused(Boolean orderUsed){
		OrderinfoExample orderinfoExample=new OrderinfoExample();
		Criteria criteria = orderinfoExample.createCriteria();
		criteria.andOrderUsedEqualTo(orderUsed);
		return orderinfoMapper.selectByExample(orderinfoExample);
		
	}
	
	//查询待回复的订单
		public List <Orderinfo>  findordercomment(Boolean orderComment){
			OrderinfoExample orderinfoExample=new OrderinfoExample();
			Criteria criteria = orderinfoExample.createCriteria();
			criteria.andOrderCommentEqualTo(orderComment);
			return orderinfoMapper.selectByExample(orderinfoExample);
			
		}
	
	//查询该用户的订单
		public List <Orderinfo>  findorder(String code){
			OrderinfoExample orderinfoExample=new OrderinfoExample();
			Criteria criteria = orderinfoExample.createCriteria();
			criteria.andCodeEqualTo(code);
			return orderinfoMapper.selectByExample(orderinfoExample);
			
		}
	
	
	//查询按主键查询某一个订单的详细信息
	
	public Orderinfo findorderinfodetail(Integer orderId) {
		Orderinfo orderinfo=orderinfoMapper.selectByPrimaryKey(orderId);
		return orderinfo;
	}
	
	//更新订单信息
	public void updateorder(Orderinfo orderinfo) {
		// TODO Auto-generated method stub
		orderinfoMapper.updateByPrimaryKeySelective(orderinfo);
	}
	
	//后台管理页面查出的所有订单信息分页查询
			public List<Orderinfo> getOrder_page() {
				// TODO Auto-generated method stub
				List<Orderinfo> orderinfo = orderinfoMapper.selectByExample(null);
				return orderinfo;
			}
			
			 public void deleteorder(Integer orderId) {
					// TODO Auto-generated method stub
				 orderinfoMapper.deleteByPrimaryKey(orderId);
					}		
}
