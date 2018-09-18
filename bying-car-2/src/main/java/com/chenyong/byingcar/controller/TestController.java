package com.chenyong.byingcar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Value("${cyy.name}")
	private String name;
	
	@Value("${cyy.age}")
	private String age;

	@RequestMapping("/test")
	public String test(){
		return name+age;
	}
	
}
