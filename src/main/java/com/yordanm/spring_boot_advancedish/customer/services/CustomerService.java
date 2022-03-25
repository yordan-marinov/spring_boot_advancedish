package com.yordanm.spring_boot_advancedish.customer.services;

import com.yordanm.spring_boot_advancedish.customer.models.Customer;
import com.yordanm.spring_boot_advancedish.customer.repositories.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final  CustomerRepo customerRepo;

    public List<Customer> all() {
        return customerRepo.getCustomers();
    }

    public Customer getCustomer(int customerId) {
        final Optional<Customer> responseCustomer = all()
                .stream()
                .filter(customer -> customer.getId() == customerId)
                .findFirst();
        return responseCustomer.orElseThrow();
    }
}
