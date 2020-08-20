package org.schwarz.microservices.apptwo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class AppTwoController {

    URI serviceTwoURI;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostConstruct
    private void init() {
        List<String> services = discoveryClient.getServices();
        String appTwoId = services.get(services.indexOf("app-one"));
        List<ServiceInstance> instances = discoveryClient.getInstances(appTwoId);
        ServiceInstance serviceInstance = instances.get(0);
        serviceTwoURI = serviceInstance.getUri();
    }

    @GetMapping("/greet")
    public String getAppOneGreeting() {
        return "Greetings from App Two!";
    }

    @GetMapping("/greetOtherApp")
    public String getOtherAppGreeting() throws URISyntaxException {
        return new RestTemplate().getForObject(new URI(serviceTwoURI.toString() + "/greet"), String.class);
    }

}
