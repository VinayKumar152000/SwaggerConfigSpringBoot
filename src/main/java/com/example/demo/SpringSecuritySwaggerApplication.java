package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringSecuritySwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecuritySwaggerApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		// return an prepared docket instance
		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.example.demo")).build().apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {

		return new ApiInfo("Address Book Api", "Sample Api", "1.0", "Free to use",
				null,
				"API liscense", "localhost:8080", Collections.emptyList());
	}
}
