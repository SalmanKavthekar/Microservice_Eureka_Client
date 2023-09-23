package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEurekaClientApplication.class, args);
	}

}
