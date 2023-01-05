package com.assignment3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Movie.class);
		Movie movie = (Movie) context.getBean("movie", Movie.class);
		System.out.println(movie);
		context.close();
		 		
		
	}

}
