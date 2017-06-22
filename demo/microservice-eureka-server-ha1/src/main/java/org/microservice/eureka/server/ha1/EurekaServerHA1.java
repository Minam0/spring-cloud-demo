package org.microservice.eureka.server.ha1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurekaServerHA1 {
    public static void main( String[] args ) {
    	SpringApplication.run(EurekaServerHA1.class, args);
    }
}
