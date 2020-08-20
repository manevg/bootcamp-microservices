package org.schwarz.microservices.appone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class AppOneController {

    @GetMapping("/greet")
    public String getAppOneGreeting() {
        return "Greetings from App One!";
    }

    @GetMapping("/greetOtherApp")
    public String getOtherAppGreeting() throws URISyntaxException {
        return new RestTemplate().getForObject(new URI("http://localhost:9092/greet"), String.class);
    }

}
