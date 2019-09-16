package com.atguigu.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.bean.Theme;
import com.atguigu.crud.service.ThemeService;

@Controller
public class ThemeController {

	
	@Autowired
	ThemeService themeService;
	
	//查出所有主题信息
		@RequestMapping("/getTheme")
		@ResponseBody
		public Msg getTheme(){
			List<Theme> theme = themeService.getTheme();
			return Msg.success().add("theme", theme);
		}
}
