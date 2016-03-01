package com.izea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
@SpringBootApplication
public class StringReverseApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringReverseApplication.class, args);
	}
}
