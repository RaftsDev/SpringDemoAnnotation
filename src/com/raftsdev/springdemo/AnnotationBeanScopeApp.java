package com.raftsdev.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println("Is it the same object: "+ (theCoach == alphaCoach));
		
		System.out.println("  theCoach memory location: " + theCoach);
		
		System.out.println("alphaCoach memory location: " + alphaCoach);
		
	}

}
