package com.chenyong.byingcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chenyong.byingcar.command.HystrixCommandUtils;

@RestController
public class TestController {
	
	@Autowired
	private HystrixCommandUtils hystrixCommandUtils;

	@RequestMapping("/test")
	public String test() {
		return hystrixCommandUtils.testHystrix("http://bying-car/test");
	}
	
}
