package com.chenyong.byingcar.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class HystrixCommandUtils {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="helloFallback")
	public String testHystrix(String url) {
		String string = null;
		try {
			string = restTemplate.getForEntity(url, String.class).getBody();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return string;
	}
	
	public String helloFallback(String url){
        return "error";
    }

}
