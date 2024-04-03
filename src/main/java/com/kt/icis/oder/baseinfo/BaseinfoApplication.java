package com.kt.icis.oder.baseinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BaseinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseinfoApplication.class, args);
	}

}
