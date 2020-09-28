package com.hz.ssm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class SpringBootStart_consumer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStart_consumer.class, args);

	}

}
