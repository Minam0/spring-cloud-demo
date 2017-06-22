package org.microservice.consumer.feign.with.hystrix.dashboard.web.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="SC-EUREKA-HA-PROVIDER2", fallback=ComputeHytrix.class)
public interface ComputeFeign {
	
	@RequestMapping(value="/computer/add", method=RequestMethod.GET)
	public String comp(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
