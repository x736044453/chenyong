package com.chenyong.byingcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulServic1Application {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServic1Application.class, args);
	}
}
