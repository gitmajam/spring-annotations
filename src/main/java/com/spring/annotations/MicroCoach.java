package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myCoachC")
public class MicroCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on hit the ball";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//using setter inyection with any method name with autowired annotation
	@Autowired
	public void setWatheverNameMethod(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
