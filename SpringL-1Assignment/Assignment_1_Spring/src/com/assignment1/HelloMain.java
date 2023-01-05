package com.assignment1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/assignment1/Config.xml");
		Hello_Class cla=context.getBean("Hello_Class", Hello_Class.class);
		
		System.out.println(cla.getMessage());
		
		context.close();
		
		
	}

}
