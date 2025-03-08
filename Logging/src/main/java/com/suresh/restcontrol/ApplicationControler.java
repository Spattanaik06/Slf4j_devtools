package com.suresh.restcontrol;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationControler 
{
	Logger logger=LoggerFactory.getLogger(ApplicationControler.class);
	@GetMapping("/welcome")
	public String welcomeMessage()
	{
		logger.info("welcome msg method started....");
		String s="Welcome to Suresh's  Web Browser....";
		logger.info("welcome msg method ended....");
		return s;
	}
	@GetMapping("/greet")
	public String greetingMessage()
	{
		logger.info("greeting msg method started....");
		String s="Greetings from Suresh";
		logger.info(" greeting method ended....");
		return s;
	}
	
}
