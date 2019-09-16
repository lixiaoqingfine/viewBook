package com.atguigu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.atguigu.crud.bean.Olderticket;
import com.atguigu.crud.dao.OlderticketMapper;

@Service
public class OlderticketService {

	
	@Autowired
	OlderticketMapper olderticketMapper;
	
	//在详情页面查询老人票价格
		public Olderticket olderticketsearch(Integer olderId) {
			Olderticket olderticket=olderticketMapper.selectByPrimaryKey(olderId);
			return olderticket;
		}
		
		//查出的所有老人票信息
				public List<Olderticket> searchaddolderId() {
					// TODO Auto-generated method stub
					List<Olderticket> olderticket = olderticketMapper.selectByExampleOlder(null);
					return olderticket;
				}
				
				//新增插入老人票信息
				 public void saveaddolder(Olderticket olderticket) {
					 olderticketMapper.insertSelective(olderticket);
			   }
				 
		//更新票价
				 public void updateolderticket(Olderticket olderticket) {
						// TODO Auto-generated method stub
					 olderticketMapper.updateByPrimaryKeySelective(olderticket);
					}
}
