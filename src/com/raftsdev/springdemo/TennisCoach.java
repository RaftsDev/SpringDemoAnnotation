package com.raftsdev.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	FortuneService fortuneService;
	
	
	TennisCoach(){
		System.out.println(">> inside default constructor");
	}
	
	/* Previous constructor injection
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}
*/
	
	/* setter injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> inside setter method");
		fortuneService = theFortuneService;
	} */
	
	// any method injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> inside doSomeCrazyStuff method");
		fortuneService = theFortuneService;
	} 
	
	
	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
