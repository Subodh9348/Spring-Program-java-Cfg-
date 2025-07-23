package com.subodh.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subodh.SpringBeans.Student;
import com.subodh.cfg.SpringConfiguration;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Student std=(Student) context.getBean("std1");
		std.display();
	}

}
