package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component("myCoachA")
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
}
