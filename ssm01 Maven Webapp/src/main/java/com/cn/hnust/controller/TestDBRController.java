package com.cn.hnust.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.service.DBRService;

@Controller
@RequestMapping("/DBR")
public class TestDBRController {
	@Resource
	private DBRService dbrService;
	
	@RequestMapping("/userinfo")
	public void test(){
		this.dbrService.getInfo();
		
	}
}
