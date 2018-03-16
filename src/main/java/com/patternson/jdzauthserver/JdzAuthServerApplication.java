package com.patternson.jdzauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan({"com.patternson"})
@SpringBootApplication
public class JdzAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdzAuthServerApplication.class, args);
	}
}
