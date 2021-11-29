package com.experimen.learnjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//untuk project yang sebenarnya dilarang letakin @enableswagger disini 
public class LearnjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnjpaApplication.class, args);
	}

}
