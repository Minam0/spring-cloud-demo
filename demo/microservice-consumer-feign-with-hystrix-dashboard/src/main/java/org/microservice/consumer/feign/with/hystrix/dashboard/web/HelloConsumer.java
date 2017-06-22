package org.microservice.consumer.feign.with.hystrix.dashboard.web;

import org.microservice.consumer.feign.with.hystrix.dashboard.web.remote.ComputeFeign;
import org.microservice.consumer.feign.with.hystrix.dashboard.web.remote.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConsumer {

		@Autowired HelloFeign remoteService;
		@Autowired ComputeFeign addService;
		
		@RequestMapping("/consumer/hello")
		public String Index(){
			return remoteService.hello();
		} 
		
		@RequestMapping("/consumer/add")
		public String Add() {
			return addService.comp(10, 20);
		}
}
