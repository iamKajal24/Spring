package com.springcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaConfig")
public class JavaConfig {
	@Bean
	public Samosa getSamosa() {
		
		return new Samosa();
	}

    @Bean(name = {"student","temp","con"})
    public Student getStudent() {
        // Creating and returning a new Student object
        return new Student(getSamosa());
    }
}
