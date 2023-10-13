package com.chandu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedConfig {

	@Bean
	public Student getStudent()
	{
		Student s = new Student(12,"chandu",30000, 90, 80, 70);	
				return s ;
		
	}
	
}
