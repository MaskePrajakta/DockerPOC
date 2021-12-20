package com.neosoftmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroServicesAddressDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesAddressDetailsApplication.class, args);
	}

}
