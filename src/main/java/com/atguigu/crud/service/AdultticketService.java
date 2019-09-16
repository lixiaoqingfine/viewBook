package com.atguigu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.Adultticket;
import com.atguigu.crud.dao.AdultticketMapper;



@Service
public class AdultticketService {

	
	@Autowired
	AdultticketMapper  adultticketMapper;
	//查出的所有成人票信息
			public List<Adultticket> searchaddadultId() {
				// TODO Auto-generated method stub
				List<Adultticket> adultticket = adultticketMapper.selectByExampleorder(null);
				return adultticket;
			}
			
			 //保存新增的成人票信息
			 public void saveaddadult(Adultticket adultticket) {
				 adultticketMapper.insertSelective(adultticket);
		   }
			 
	//更新票价
			 public void updateadultticket(Adultticket adultticket) {
					// TODO Auto-generated method stub
				 adultticketMapper.updateByPrimaryKeySelective(adultticket);
				}		 
}
