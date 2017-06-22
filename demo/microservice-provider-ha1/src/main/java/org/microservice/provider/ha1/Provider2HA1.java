package org.microservice.provider.ha1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider2HA1 {
    public static void main( String[] args ) {
        SpringApplication.run(Provider2HA1.class, args);
    }
}
