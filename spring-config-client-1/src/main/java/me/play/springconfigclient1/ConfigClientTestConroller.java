package me.play.springconfigclient1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientTestConroller {
    @Value("${greeting}")
    private String greeting;

    @GetMapping("/greeting")
    public String greeting()  {
        return greeting;
    }

}
