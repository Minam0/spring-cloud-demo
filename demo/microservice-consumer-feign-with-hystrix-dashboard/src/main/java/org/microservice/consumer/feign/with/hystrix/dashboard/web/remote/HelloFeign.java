package org.microservice.consumer.feign.with.hystrix.dashboard.web.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="SC-EUREKA-HA-PROVIDER", fallback=HelloRemoteHystrix.class)
public interface HelloFeign {
		
	@RequestMapping("/hello")
	public String hello();
}
