package com.spring.annotations;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component("randomFortuneService")
public class RandomFortuneService implements FortuneService{
	
	private List<String> fortunes;

	@Override
	public String getFortune() {
		int randomIndex = (int) Math.floor(Math.random()*fortunes.size());
		return fortunes.get(randomIndex);
	}
	
	@PostConstruct
	public void readFortunes() {
		fortunes = Readers.readerTxt("fortunes.txt");
	}

}
