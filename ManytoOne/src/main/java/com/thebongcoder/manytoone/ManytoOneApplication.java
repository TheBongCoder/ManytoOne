package com.thebongcoder.manytoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages="com.thebongcoder.*")
@EntityScan("com.thebongcoder.*")
public class ManytoOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManytoOneApplication.class, args);
	}

}
