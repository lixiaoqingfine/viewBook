package com.atguigu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.Address;
import com.atguigu.crud.bean.AddressExample;

import com.atguigu.crud.bean.AddressExample.Criteria;
import com.atguigu.crud.dao.AddressMapper;

@Service
public class AddressService {

	
	@Autowired
	AddressMapper addressMapper;
	
	public List<Address> getAddress(Integer worldId) {
		AddressExample addressExample=new AddressExample();
		Criteria criteria=addressExample.createCriteria();
		criteria.andWorldIdEqualTo(worldId);
		return addressMapper.selectByExample(addressExample);
	}
	
	public List<Address> getAddressnoparam() {
		// TODO Auto-generated method stub
		List<Address> address = addressMapper.selectByExample(null);
		return address;
	}
}
