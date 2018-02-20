package com.robxrocks.springdemo.fortune;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = new String[] {
			"You've got good fortune with you today.",
			"You've got better fortune with you today.",
			"You've got best fortune with you today.",
	};
	private Random rand = new Random();

	@Override
	public String getFortune() {
		return fortunes[rand.nextInt(fortunes.length)];
	}
	
}
