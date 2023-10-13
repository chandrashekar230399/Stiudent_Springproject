package com.chandu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfig.class);
		Student s1 = context.getBean(Student.class);
		s1.printDetails();
		s1.printTotal();
		s1.printAvg();
	}
}
