package com.abd.io.Springbootwithtesting;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
@Configuration
public class SpringBootWithTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithTestingApplication.class, args);
	}

	@Bean(name = "properties")
	public PropertiesFactoryBean mapper() {
		PropertiesFactoryBean bean = new PropertiesFactoryBean();
		bean.setLocation(new ClassPathResource("application.properties"));
		return bean;
	}
}
