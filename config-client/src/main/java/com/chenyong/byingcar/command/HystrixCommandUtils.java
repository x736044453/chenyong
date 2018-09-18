package com.chenyong.byingcar.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Component
public class HystrixCommandUtils {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="helloFallback",commandProperties = {
			@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="2000")})
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
