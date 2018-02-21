package com.robxrocks.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.robxrocks.springdemo.coach.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach == alphaCoach);
		System.out.println("mem loc for theCoach: " + theCoach);
		System.out.println("mem loc for alphaCoach: " + alphaCoach + "\n");
		
		context.close();
	}

}
