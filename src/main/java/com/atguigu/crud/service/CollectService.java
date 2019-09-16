package com.atguigu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.Collect;
import com.atguigu.crud.bean.CollectExample;
import com.atguigu.crud.bean.CollectExample.Criteria;
import com.atguigu.crud.dao.CollectMapper;

@Service
public class CollectService {

	@Autowired
	CollectMapper collectMapper;
	
	//在景点详情页面查询是否收藏
	public List <Collect>  findcollect(Integer userId,Integer scenicId){
		CollectExample collectExample = new CollectExample();
		Criteria criteria = collectExample.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andScenicIdEqualTo(scenicId);
		return collectMapper.selectByExample(collectExample);
	}
	
	//查询收藏页面的 所有收藏景点ID
	public List <Collect>  findallcollect(Integer userId){
		CollectExample collectExample = new CollectExample();
		Criteria criteria = collectExample.createCriteria();
		criteria.andUserIdEqualTo(userId);
		return collectMapper.selectByExample(collectExample);
	}
	
	
	
	
	//测试查询多个主键
	/*public List <Collect>  findarray(List<Integer> testlist1){
		CollectExample collectExample = new CollectExample();
		Criteria criteria = collectExample.createCriteria();
		criteria.andCollectionIdIn(testlist1);
		return collectMapper.selectByExample(collectExample);
	}*/
	
	
	
	//插入收藏数据
	 public void insertcollect(Collect collect) {
		 collectMapper.insertSelective(collect);
    }
	 
	 //更新收藏数据
	 public void updatecollect(Collect collect) {
			// TODO Auto-generated method stub
		 collectMapper.updateByPrimaryKeySelective(collect);
		}
	 
	 //删除收藏景点
	 public void deletecollect(Integer collectId) {
			// TODO Auto-generated method stub
		 collectMapper.deleteByPrimaryKey(collectId);
		}
	
}
