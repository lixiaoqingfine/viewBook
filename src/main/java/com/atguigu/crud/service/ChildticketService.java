package com.atguigu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.Childticket;
import com.atguigu.crud.bean.ChildticketExample;
import com.atguigu.crud.bean.Orderinfo;
import com.atguigu.crud.bean.ChildticketExample.Criteria;
import com.atguigu.crud.dao.ChildticketMapper;


@Service
public class ChildticketService {
    
	
	@Autowired
	ChildticketMapper childticketMapper;
	
	//在详情页面查询儿童票价格
	public Childticket childticketsearch(Integer childId) {
		Childticket childticket=childticketMapper.selectByPrimaryKey(childId);
		return childticket;
	}
	
	 //保存新增的景点信息
	 public void saveaddchild(Childticket childticket) {
		 childticketMapper.insertSelective(childticket);
   }
	 
	//查出的所有儿童票信息
		public List<Childticket> searchaddchildId() {
			// TODO Auto-generated method stub
			List<Childticket> childticket = childticketMapper.selectByExampleOrder(null);
			return childticket;
		}
		
		//更新票票价
		public void updatechildticket(Childticket childticket) {
			// TODO Auto-generated method stub
			childticketMapper.updateByPrimaryKeySelective(childticket);
		}		
}
