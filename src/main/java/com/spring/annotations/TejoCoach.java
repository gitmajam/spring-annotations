package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myCoachB")
public class TejoCoach implements Coach {

	private FortuneService fortuneService;

	// using constructor inyection
	@Autowired
	public TejoCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on raising elbow";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void afterCreating() {
		System.out.println("doing after creating stuffs with TejoCoach");
	}
	
	@PreDestroy
	public void afterClosing() {
		System.out.println("doing before closing stuffs with TejoCoach");
	}
}
