package io.pivotal.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;

/**
 * SpringBoot application for the portfolio microservice.
 * 
 * Responsible for managing the portfolio as well as providing the API.
 * 
 * @author David Ferreira Pinto
 *
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableDiscoveryClient
@Configuration
public class PortfolioApplication {
	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}
	
	@LoadBalanced	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
