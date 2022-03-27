package com.yordanm.spring_boot_advancedish.customer.controllers;

import com.yordanm.spring_boot_advancedish.customer.models.Customer;
import com.yordanm.spring_boot_advancedish.customer.models.CustomerDTO;
import com.yordanm.spring_boot_advancedish.customer.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Deprecated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping(path = "/{customerId}")
    public CustomerDTO returnCustomer(@PathVariable int customerId){
        return customerService.getCustomerFakeRepo(customerId);
    }

    @GetMapping
    public List<CustomerDTO> getAll(){
        return customerService.allV1();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody @Valid Customer customer){
        System.out.println(customer);
        return customer;
    }

    @DeleteMapping(path = "{customerId}")
    public CustomerDTO deleteCustomer(@PathVariable Integer customerId){
        CustomerDTO customer = customerService.getCustomerFakeRepo(customerId);
        System.out.println(customer);
        return customer;
    }
}
