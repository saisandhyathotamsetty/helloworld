package com.capgemini.teamA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//Get HTTP Method
	//http://localhost:8080/hw
	
	@GetMapping("/hw")
	/*
	 * Added a comment and pushing it to github account
	 */
	public String helloworld() {
		return "Hello World";

	}

}
