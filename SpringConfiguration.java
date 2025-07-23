package com.subodh.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.subodh.SpringBeans.Student;

@Configuration
public class SpringConfiguration {
	@Bean
	public Student std1() {
		Student std=new Student();
		std.setName("subodh");
		std.setEmail("subodh@gmail.com");
		std.setRollno(119);
		return std;
	}

}
