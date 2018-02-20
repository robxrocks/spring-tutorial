package com.robxrocks.springdemo;

import com.robxrocks.springdemo.coach.Coach;
import com.robxrocks.springdemo.coach.TrackCoach;

public class MyApp {

	public static void main(String[] args) {

		Coach theCoach = new TrackCoach();
		
		System.out.print(theCoach.getDailyWorkout());

	}

}
