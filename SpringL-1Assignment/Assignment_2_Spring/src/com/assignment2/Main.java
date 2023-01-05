package com.assignment2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/assignment2/Config.xml");
		
		 		Movie movie=context.getBean("Movie", Movie.class);
		 		System.out.println(movie.toString());
		 		context.close();
		 		
		
	}

}
