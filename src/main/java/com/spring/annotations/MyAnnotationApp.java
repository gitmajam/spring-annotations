package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAnnotationApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container (inversion of control)
		Coach theCoachA = context.getBean("myCoachA", Coach.class);
		
		//call method on the bean
		System.out.println(theCoachA.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
