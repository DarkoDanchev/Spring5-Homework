package com.darko.danchev.simple.blogging.SimpleBlogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration
@Configuration
@ComponentScan
@RequestMapping(value = "/api")
public class SimpleBloggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleBloggingApplication.class, args);
	}
}
