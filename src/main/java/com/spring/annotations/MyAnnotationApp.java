package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAnnotationApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container (inversion of control)
		Coach theCoachA = context.getBean("myCoachA", Coach.class);
		Coach theCoachB = context.getBean("myCoachB", Coach.class);
		Coach theCoachC = context.getBean("myCoachC", Coach.class);
		Coach theCoachD = context.getBean("myCoachD", Coach.class);
		
		//call method on the bean
		System.out.println(theCoachA.hashCode());
		System.out.println(theCoachB.hashCode());
		System.out.println(theCoachC.hashCode());
		System.out.println(theCoachD.hashCode());
		System.out.println(theCoachA.getDailyWorkout());
		System.out.println(theCoachB.getDailyWorkout());
		System.out.println(theCoachC.getDailyWorkout());
		System.out.println(theCoachD.getDailyWorkout());
		
		//verify Autowired Fortune service with setter
		System.out.println(theCoachA.getDailyFortune());
		//verify Autowired Fortune service with constructor
		System.out.println(theCoachB.getDailyFortune());
		//verify Autowired Fortune service with any method name
		System.out.println(theCoachC.getDailyFortune());
		//verify Autowired Fortune service with direct field
		System.out.println(theCoachD.getDailyFortune());
		
		//close the context
		context.close();

	}

}
