package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		String[] fortunes = {"Today is a great day", "enjoy with your family", "no matter yo do, smile", "one day at a time"};
		int randomIndex = (int) Math.floor(Math.random()*4);
		return fortunes[randomIndex];
	}

}
