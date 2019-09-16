package com.atguigu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.Region;
import com.atguigu.crud.bean.RegionExample;
import com.atguigu.crud.bean.RegionExample.Criteria;
import com.atguigu.crud.dao.RegionMapper;



@Service
public class RegionService {


	@Autowired
	RegionMapper regionMapper;
	
	public List <Region>  searchregion(Integer addressId){
		RegionExample regionExample=new RegionExample();
		Criteria criteria = regionExample.createCriteria();
		criteria.andAddressIdEqualTo(addressId);
		return regionMapper.selectByExampleWithAddress(regionExample);
	}
	
	/*public Region searchregion(Integer id) {
		Region region=regionMapper.selectByPrimaryKeyWidthAddress(id);
		return region;
	}*/
	
	public List<Region> getRegion(Integer addressId) {
		RegionExample regionExample=new RegionExample();
		Criteria criteria = regionExample.createCriteria();
		criteria.andAddressIdEqualTo(addressId);
		return regionMapper.selectByExample(regionExample);
	}
	
	public List<Region> getRegionnoparam() {
		// TODO Auto-generated method stub
		List<Region> region = regionMapper.selectByExample(null);
		return region;
	}
}
