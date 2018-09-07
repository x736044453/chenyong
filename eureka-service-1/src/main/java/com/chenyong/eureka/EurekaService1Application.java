package com.chenyong.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaService1Application {
	private static final Logger logger = LoggerFactory.getLogger(EurekaService1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(EurekaService1Application.class, args);
		logger.info("EurekaService1Application启动成功");
	}
}
