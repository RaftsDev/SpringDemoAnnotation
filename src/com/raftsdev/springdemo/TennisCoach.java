package com.raftsdev.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired // field injection
	@Qualifier ("randomService")
	FortuneService fortuneService;
	
	
	TennisCoach(){
		System.out.println(">> inside default constructor");
	}
	
	@PostConstruct
	public void startStuff() {
		System.out.println(">> Started bean...");
	}
	
	@PreDestroy
	public void cleanUpStuff() {
		System.out.println(">> Cleaning before destroy a bean...");
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
	
	/* any method injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> inside doSomeCrazyStuff method");
		fortuneService = theFortuneService;
	} */
	
	
	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
