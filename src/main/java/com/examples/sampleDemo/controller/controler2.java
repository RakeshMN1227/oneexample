package com.examples.sampleDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page")
public class controler2 {

	
	@RequestMapping("/page1")
	public String sayhelloe()
	{
		return "welcome to page";
				
	}
	
}
