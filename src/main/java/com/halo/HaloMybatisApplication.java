package com.halo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HaloMybatisApplication {

	public static void main(String[] args) {
		System.getProperty("user.home");
		SpringApplication.run(HaloMybatisApplication.class, args);
	}

}
