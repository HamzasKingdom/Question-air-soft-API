package com.questionairv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class Questionairv1Application {

	public static void main(String[] args) {
		SpringApplication.run(Questionairv1Application.class, args);
	}

}
