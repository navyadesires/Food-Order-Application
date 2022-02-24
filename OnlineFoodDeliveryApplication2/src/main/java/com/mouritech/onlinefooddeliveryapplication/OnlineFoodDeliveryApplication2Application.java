package com.mouritech.onlinefooddeliveryapplication;


import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableSwagger2
@EnableJpaRepositories
@SpringBootApplication
public class OnlineFoodDeliveryApplication2Application {

	public static void main(String[] args) {
		SpringApplication.run(OnlineFoodDeliveryApplication2Application.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
	 return new ModelMapper();
	}

}

