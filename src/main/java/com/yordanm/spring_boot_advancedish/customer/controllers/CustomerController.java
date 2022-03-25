package com.yordanm.spring_boot_advancedish.customer.controllers;

import com.yordanm.spring_boot_advancedish.customer.models.Customer;
import com.yordanm.spring_boot_advancedish.customer.models.CustomerDTO;
import com.yordanm.spring_boot_advancedish.customer.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping(path = "/{customerId}")
    public CustomerDTO returnCustomer(@PathVariable int customerId){
        return customerService.getCustomer(customerId);
    }

    @GetMapping
    public List<CustomerDTO> getAll(){
        return customerService.all();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        System.out.println(customer);
        return customer;
    }

    @DeleteMapping(path = "{customerId}")
    public CustomerDTO deleteCustomer(@PathVariable Integer customerId){
        CustomerDTO customer = customerService.getCustomer(customerId);
        System.out.println(customer);
        return customer;
    }
}
