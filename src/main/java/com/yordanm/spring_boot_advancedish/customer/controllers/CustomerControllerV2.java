package com.yordanm.spring_boot_advancedish.customer.controllers;

import com.yordanm.spring_boot_advancedish.customer.models.Customer;
import com.yordanm.spring_boot_advancedish.customer.models.CustomerDTO;
import com.yordanm.spring_boot_advancedish.customer.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2/customers")
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @GetMapping(path = "/{customerId}")
    public CustomerDTO returnCustomer(@PathVariable int customerId) {
        System.out.println("This is the version 2");

        return customerService.getCustomer(customerId);
    }

    @GetMapping
    public List<CustomerDTO> getAll() {
        System.out.println("This is the version 2");

        return customerService.all();
    }

    @PostMapping
    public CustomerDTO createCustomer(@RequestBody @Valid Customer customer) {
        final CustomerDTO customerDTO = CustomerDTO.map(customer);
        System.out.println(customerDTO);
        System.out.println("This is the version 2");

        return customerDTO;
    }

    @DeleteMapping(path = "{customerId}")
    public CustomerDTO deleteCustomer(@PathVariable Integer customerId) {
        CustomerDTO customer = customerService.getCustomer(customerId);
        System.out.println(customer);
        System.out.println("This is the version 2");

        return customer;
    }
}
