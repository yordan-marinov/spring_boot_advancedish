package com.yordanm.spring_boot_advancedish.customer.controllers;

import com.yordanm.spring_boot_advancedish.customer.models.Customer;
import com.yordanm.spring_boot_advancedish.customer.models.CustomerDTO;
import com.yordanm.spring_boot_advancedish.customer.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2/customers")
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @GetMapping(path = "/{customerId}")
    public CustomerDTO returnCustomer(@PathVariable int customerId){
        System.out.println("This is the version 2");

        return customerService.getCustomer(customerId);
    }

    @GetMapping
    public List<CustomerDTO> getAll(){
        System.out.println("This is the version 2");

        return customerService.all();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        System.out.println(customer);
        System.out.println("This is the version 2");

        return customer;
    }

    @DeleteMapping(path = "{customerId}")
    public CustomerDTO deleteCustomer(@PathVariable Integer customerId){
        CustomerDTO customer = customerService.getCustomer(customerId);
        System.out.println(customer);
        System.out.println("This is the version 2");

        return customer;
    }
}
