package me.play.springmsacircuitbreaker1client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RestController;

@EnableCircuitBreaker
@SpringBootApplication
public class SpringMsaCircuitBreaker1ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMsaCircuitBreaker1ClientApplication.class, args);
	}

}
