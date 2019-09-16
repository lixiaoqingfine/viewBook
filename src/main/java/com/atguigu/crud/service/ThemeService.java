package com.atguigu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.Theme;
import com.atguigu.crud.dao.ThemeMapper;


@Service
public class ThemeService {

	
	@Autowired
	ThemeMapper ThemeMapper;
	
	public List<Theme> getTheme() {
		// TODO Auto-generated method stub
		List<Theme> theme = ThemeMapper.selectByExample(null);
		return theme;
	}
}
