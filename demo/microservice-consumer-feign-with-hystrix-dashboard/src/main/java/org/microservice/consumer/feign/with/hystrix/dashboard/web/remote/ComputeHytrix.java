package org.microservice.consumer.feign.with.hystrix.dashboard.web.remote;

import org.springframework.stereotype.Component;

@Component
public class ComputeHytrix implements ComputeFeign{

	@Override
	public String comp(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return "compute service not available now";
	}


}
