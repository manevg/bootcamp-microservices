package org.schwarz.microservices.customerservice.controller;

import org.schwarz.microservices.customerservice.domain.Customer;
import org.schwarz.microservices.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/")
    public Customer saveCustomer() {
        Customer customer = Customer.builder().id(1).name("Lorenzo Lamas").build();
        return customerService.saveCustomer(customer);
    }

}
