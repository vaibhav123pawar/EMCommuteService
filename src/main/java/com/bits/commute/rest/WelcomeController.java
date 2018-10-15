package com.bits.commute.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bits.commute.vo.GreetingResponseVO;

@RestController
public class WelcomeController {
	@RequestMapping(value="/greetings", method=RequestMethod.GET)
	public @ResponseBody GreetingResponseVO greetings() {
		
		GreetingResponseVO greeting = new GreetingResponseVO();
		greeting.setGreeting("Welcome");
		greeting.setName("Vaibhav");
		return greeting;
	}
}
