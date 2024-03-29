package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan(basePackages="com.controller")
@EnableDiscoveryClient(autoRegister=true)
public class Service {
	
	public static void main(String args[]){
		
		 SpringApplication.run(Service.class, args);
		}

}
