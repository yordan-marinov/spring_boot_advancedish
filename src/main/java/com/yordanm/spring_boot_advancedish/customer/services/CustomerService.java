package com.yordanm.spring_boot_advancedish.customer.services;

import com.yordanm.spring_boot_advancedish.customer.models.Customer;
import com.yordanm.spring_boot_advancedish.customer.repositories.CustomerFakeRepository;
import com.yordanm.spring_boot_advancedish.customer.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public record CustomerService(
        CustomerFakeRepository customerRepository) {

    public Customer getCustomer(int customerId) {
        final Optional<Customer> responseCustomer = all()
                .stream()
                .filter(customer -> customer.getId() == customerId)
                .findFirst();
        return responseCustomer.orElseThrow();
    }

    public List<Customer> all() {
        return customerRepository.getCustomers();
    }
}
