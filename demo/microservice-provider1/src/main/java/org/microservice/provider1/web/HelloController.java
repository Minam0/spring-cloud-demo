package org.microservice.provider1.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String Index() {
		
		return "Hello, This is provider1";
	}
}
