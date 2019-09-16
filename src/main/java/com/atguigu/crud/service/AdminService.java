package com.atguigu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.Admin;
import com.atguigu.crud.bean.AdminExample;
import com.atguigu.crud.bean.AdminExample.Criteria;
import com.atguigu.crud.dao.AdminMapper;







@Service
public class AdminService {

	
	@Autowired
	AdminMapper adminMapper;
	
	public List <Admin>  findadmin(String adminName,String password){
		AdminExample adminExample=new AdminExample();
		Criteria criteria = adminExample.createCriteria();
		criteria.andAdminNameEqualTo(adminName);
		criteria.andPasswordEqualTo(password);
		return adminMapper.selectByExample(adminExample);
		
	}
}
