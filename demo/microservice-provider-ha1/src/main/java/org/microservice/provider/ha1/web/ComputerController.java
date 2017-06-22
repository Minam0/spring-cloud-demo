package org.microservice.provider.ha1.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/computer")
public class ComputerController {

	@RequestMapping(value="/add", method=RequestMethod.GET)
    public String add(@RequestParam Integer a, @RequestParam Integer b) {
		return "a + b = " + (a+b) + "from provider 1";
	}
}
