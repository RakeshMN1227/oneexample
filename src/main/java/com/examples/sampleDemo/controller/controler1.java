package com.examples.sampleDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/home")
public class controler1 {
	
	@RequestMapping("/home1")
	public String sayhelloe()
	{
		return "welcome to home";
				
	}

}
