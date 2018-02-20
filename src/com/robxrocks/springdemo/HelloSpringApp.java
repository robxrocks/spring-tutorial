package com.robxrocks.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.robxrocks.springdemo.coach.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myGolfCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}
	
}
