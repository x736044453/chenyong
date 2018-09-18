package com.chenyong.byingcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulServic2Application {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServic2Application.class, args);
	}
}
