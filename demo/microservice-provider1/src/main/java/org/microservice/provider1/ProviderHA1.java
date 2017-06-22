package org.microservice.provider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderHA1 {
    public static void main( String[] args ) {
        SpringApplication.run(ProviderHA1.class, args);
    }
}
