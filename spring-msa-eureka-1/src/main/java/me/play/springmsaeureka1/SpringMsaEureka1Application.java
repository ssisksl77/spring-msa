package me.play.springmsaeureka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringMsaEureka1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringMsaEureka1Application.class, args);
    }

}
