package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myCoachD")
public class CanicasCoach implements Coach {
	
	//using direct field inyection
	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes create a gap";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
