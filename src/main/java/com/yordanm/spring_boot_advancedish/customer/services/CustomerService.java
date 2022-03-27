package com.yordanm.spring_boot_advancedish.customer.services;

import com.yordanm.spring_boot_advancedish.customer.exceptions.CustomerNotFoundException;
import com.yordanm.spring_boot_advancedish.customer.models.CustomerDTO;
import com.yordanm.spring_boot_advancedish.customer.repositories.CustomerRepo;
import com.yordanm.spring_boot_advancedish.customer.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor
public record CustomerService(CustomerRepo customerRepo,
                              CustomerRepository customerRepository) {

    public List<CustomerDTO> allV1() {
        return customerRepo.getCustomers().stream()
                .map(CustomerDTO::map)
                .toList();
    }


    public CustomerDTO getCustomerFakeRepo(int customerId) {
        final Optional<CustomerDTO> responseCustomer = customerRepo.getCustomers()
                .stream()
                .filter(customer -> customer.getId() == customerId)
                .map(CustomerDTO::map)
                .findFirst();
        return responseCustomer.orElseThrow(
                () -> new CustomerNotFoundException(
                        String.format("Customer with id %d not found.", customerId)));
    }


    public CustomerDTO getCustomer(int customerId) {
        return customerRepository.findById(customerId)
                .map(CustomerDTO::map)
                .orElseThrow(
                        () -> new CustomerNotFoundException(
                                String.format("Customer with id %d not found.", customerId)
                        )
                );
    }


    public List<CustomerDTO> all() {
        return customerRepository.findAll()
                .stream()
                .map(CustomerDTO::map)
                .toList();
    }
}
