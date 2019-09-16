package com.atguigu.crud.service;

import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.servlet.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.atguigu.crud.bean.Scenic;
import com.atguigu.crud.bean.ScenicExample;

import com.atguigu.crud.bean.ScenicExample.Criteria;


import com.atguigu.crud.dao.ScenicMapper;

@Service
public class ScenicService {
	
	@Autowired
	ScenicMapper scenicMapper;
	
	
	public Scenic getScenicDetail(Integer id) {
		Scenic scenic=scenicMapper.selectByPrimaryKeyWithAll(id);
		return scenic;
	}
	
	
	//查出的所有热门景点信息
	public List<Scenic> getHot() {
		// TODO Auto-generated method stub
		List<Scenic> scenic = scenicMapper.selectByExampleWithAdult(null);
		return scenic;
	}
	
	//后台管理页面查出的所有景点信息分页查询
		public List<Scenic> getHot_page() {
			// TODO Auto-generated method stub
			List<Scenic> scenic = scenicMapper.selectByExampleWithAll(null);
			return scenic;
		}

//查出所有推荐景点
	public List <Scenic>  getRecommend(Boolean isRecommend){
		ScenicExample scenicExample = new ScenicExample();
		Criteria criteria = scenicExample.createCriteria();
		criteria.andIsRecommendEqualTo(isRecommend);
		return scenicMapper.selectByExampleWithAdult(scenicExample);
	}
	
//按地区分类查询景点
	public List <Scenic>  categorysearch(Integer regionId){
		ScenicExample scenicExample = new ScenicExample();
		Criteria criteria = scenicExample.createCriteria();
		criteria.andRegionIdEqualTo(regionId);
		return scenicMapper.selectByExampleWithAdult(scenicExample);
		
	}
	
	//按照景点名字查出景点id
	public List <Scenic>  findscenicId(String scenicName){
		ScenicExample scenicExample = new ScenicExample();
		Criteria criteria = scenicExample.createCriteria();
		criteria.andScenicNameEqualTo(scenicName);
		return scenicMapper.selectByExampleWithAdult(scenicExample);
		
	}
	
	//在后台景点管理页面搜索框查询
	public List <Scenic>  findscenicinfo(String scenicName){
		ScenicExample scenicExample = new ScenicExample();
		Criteria criteria = scenicExample.createCriteria();
		criteria.andScenicNameLike("%"+scenicName+"%");
		return scenicMapper.selectByExampleWithAll(scenicExample);
		
	}
	
	 //搜索框进行模糊查询
		public List <Scenic>  scenicNamesearch(String scenicName){
			ScenicExample scenicExample = new ScenicExample();
			Criteria criteria = scenicExample.createCriteria();
			criteria.andScenicNameLike("%"+scenicName+"%");
			return scenicMapper.selectByExampleWithAdult(scenicExample);
			
		}
	
	
	
	//按主题查询景点
		public List <Scenic>  themesearch(Integer themeId){
			ScenicExample scenicExample = new ScenicExample();
			Criteria criteria = scenicExample.createCriteria();
			criteria.andThemeIdEqualTo(themeId);
			return scenicMapper.selectByExampleWithAdult(scenicExample);
		}
	
		
		//在summary查询国内游
		public List <Scenic>  chinasearch(Integer worldId){
			ScenicExample scenicExample = new ScenicExample();
			Criteria criteria = scenicExample.createCriteria();
			criteria.andWorldIdEqualTo(worldId);
			return scenicMapper.selectByExampleWithAdult(scenicExample);
		}
		
		//在summary查询特价游
		public List <Scenic>  ischeapsearch(Boolean isCheap){
			ScenicExample scenicExample = new ScenicExample();
			Criteria criteria = scenicExample.createCriteria();
			criteria.andIsCheapEqualTo(isCheap);
			return scenicMapper.selectByExampleWithAdult(scenicExample);
		}
		
		//在收藏页面查询所有收藏景点ID的对应景点信息
				public List <Scenic>  findcollectscenic(List<Integer> sceniclist){
					ScenicExample scenicExample = new ScenicExample();
					Criteria criteria = scenicExample.createCriteria();
					criteria.andScenicIdIn(sceniclist);
					return scenicMapper.selectByExampleWithAdult(scenicExample);
				}
		
	//按地区分类+评分高低  查询景点
		/*public List <Scenic>  categoryscoresearch(Integer regionId){
			ScenicExample scenicExample = new ScenicExample();
			Criteria criteria = scenicExample.createCriteria();
			criteria.andRegionIdEqualTo(regionId);
			return scenicMapper.selectByExampleByScore(scenicExample);
		}*/

     //保存新增的景点信息
				 public void saveaddscenic(Scenic scenic) {
					 scenicMapper.insertSelective(scenic);
			    }
	//更新新增景点信息
				 public void updatescenic(Scenic scenic) {
						// TODO Auto-generated method stub
					 scenicMapper.updateByPrimaryKeySelective(scenic);
					}
				 
				//查出的所有新增景点信息
					public List<Scenic> searchaddscenic() {
						// TODO Auto-generated method stub
						List<Scenic> scenic = scenicMapper.selectByExampleOrder(null);
						return scenic;
					}
					
			//删除景点信息
			 public void deletescenic(Integer scenicId) {
				// TODO Auto-generated method stub
				 scenicMapper.deleteByPrimaryKey(scenicId);
				}
			 
			 
}
