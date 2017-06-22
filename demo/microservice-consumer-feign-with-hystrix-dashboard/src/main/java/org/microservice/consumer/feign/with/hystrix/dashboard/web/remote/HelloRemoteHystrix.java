package org.microservice.consumer.feign.with.hystrix.dashboard.web.remote;

import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloFeign {

	@Override
	public String hello() {
		return "Service not available right now";
	}

}
