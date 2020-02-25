package me.play.springmsacircuitbreaker1server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringMsaCircuitBreaker1ServerApplication {

    @RequestMapping(value = "/recommended")
    public String readingList() {
        return "Spring in Action (Manning), Cloud Native Java (O'REilly)";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringMsaCircuitBreaker1ServerApplication.class, args);
    }

}
