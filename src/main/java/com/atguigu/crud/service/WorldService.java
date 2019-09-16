package com.atguigu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.World;
import com.atguigu.crud.dao.WorldMapper;

@Service
public class WorldService {

	@Autowired
	WorldMapper worldMapper;
	
	public List<World> getWorld() {
		// TODO Auto-generated method stub
		List<World> world = worldMapper.selectByExample(null);
		return world;
	}

}
