package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myCoachB")
public class TejoCoach implements Coach {

	private FortuneService fortuneService;
	
	//using constructor inyection
	@Autowired
	public TejoCoach(FortuneService fortuneService) {
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
}
