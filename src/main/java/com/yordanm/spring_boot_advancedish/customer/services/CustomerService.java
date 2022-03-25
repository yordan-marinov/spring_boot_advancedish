package com.yordanm.spring_boot_advancedish.customer.services;

import com.yordanm.spring_boot_advancedish.customer.exceptions.CustomerNotFoundException;
import com.yordanm.spring_boot_advancedish.customer.models.Customer;
import com.yordanm.spring_boot_advancedish.customer.models.CustomerDTO;
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

    public List<CustomerDTO> all() {
        return customerRepo.getCustomers().stream()
                .map(CustomerDTO::map)
                .toList();
    }

    public CustomerDTO getCustomer(int customerId) {
        final Optional<CustomerDTO> responseCustomer = customerRepo.getCustomers()
                .stream()
                .filter(customer -> customer.getId() == customerId)
                .map(CustomerDTO::map)
                .findFirst();
        return responseCustomer.orElseThrow(
                ()-> new CustomerNotFoundException(
                        String.format("Customer with id %d not found.", customerId)));
    }
}
