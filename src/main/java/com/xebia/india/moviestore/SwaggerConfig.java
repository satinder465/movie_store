package com.xebia.india.moviestore;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


//import org.assertj.core.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Configuration
@Configuration
//Enable Swagger
@EnableSwagger2
public class SwaggerConfig {
	//Copied from ApiInfo class to reuse as much as possible code to provide own info.
	public static final Contact DEFAULT_CONTACT = new Contact("Satinder", "ssss", "skg05.kaur@gmail.com");
	  public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Awesome APi Title", 
			  "Awesome Api Documentation", 
			  "1.0", 
			  "urn:tos",
	          DEFAULT_CONTACT, 
	          "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<String>(Arrays.asList("application/json","application/xml"));
	
	// Bean - Docket
	// Swagger2
	// All the paths
	// All the api's	
//	private static final ApiInfo DEFAULT_API_INFO = null;

	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO).produces(DEFAULT_PRODUCES_AND_CONSUMES).consumes(DEFAULT_PRODUCES_AND_CONSUMES);
	}
	

}
