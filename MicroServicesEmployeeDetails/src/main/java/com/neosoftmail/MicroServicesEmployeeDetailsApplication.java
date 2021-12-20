package com.neosoftmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MicroServicesEmployeeDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesEmployeeDetailsApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
	RestTemplate rs = new RestTemplate();
	return rs;
	}

}
