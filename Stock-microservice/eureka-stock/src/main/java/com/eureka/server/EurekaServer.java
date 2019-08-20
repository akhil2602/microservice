package com.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaServer
public class EurekaServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 SpringApplication.run(EurekaServer.class, args);
	}

}