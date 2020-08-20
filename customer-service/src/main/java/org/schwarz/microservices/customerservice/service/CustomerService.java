package org.schwarz.microservices.customerservice.service;

import org.schwarz.microservices.customerservice.domain.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    // Repository relations here.
    public Customer saveCustomer(Customer customer) {
        return customer;
    }
}
