package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan(basePackages="com.client")
@EnableDiscoveryClient(autoRegister=true)
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpringApplication.run(Client.class, args);
	}

}
