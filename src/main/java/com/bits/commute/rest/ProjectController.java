package com.bits.commute.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	
	@RequestMapping(value="project/create", method=RequestMethod.POST)
	public void create() {
		
	}
	
	@RequestMapping(value="project/update", method=RequestMethod.POST)
	public void update() {
		
	}
	
	public void delete() {
		
	}
	
	public void disable() {
		
	}
	
	public void list() {
		
	}
}
