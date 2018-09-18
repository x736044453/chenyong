package com.chenyong.byingcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chenyong.byingcar.command.HystrixCommandUtils;

@RestController
@RefreshScope  //配置中心刷新注解
public class TestController {
	@Autowired
	private HystrixCommandUtils hystrixCommandUtils;
	
	@Value("${cyy.name}")
	private String name;
	
	@Value("${cyy.age}")
	private String age;
	
	@RequestMapping("/test")
	public String test() {
		return name+age;
	}
	
	@RequestMapping("/test1")
	public String test1() {
		return hystrixCommandUtils.testHystrix("http://bying-car/test");
	}

}
