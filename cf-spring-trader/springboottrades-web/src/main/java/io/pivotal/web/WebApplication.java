package io.pivotal.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@Configuration
public class WebApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
    
	@LoadBalanced	
 	@Bean
 	public RestTemplate restTemplate(RestTemplateBuilder builder) {
 		return builder.build();
 	}    
}
