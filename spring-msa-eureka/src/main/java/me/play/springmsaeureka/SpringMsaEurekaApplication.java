package me.play.springmsaeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringMsaEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMsaEurekaApplication.class, args);
    }
}