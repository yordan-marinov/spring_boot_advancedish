package com.yordanm.spring_boot_advancedish.customer.repositories;


import com.yordanm.spring_boot_advancedish.customer.models.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerFakeRepository implements CustomerRepository{

    @Override
    public List<Customer> getCustomers() {
        return List.of(
                Customer.builder()
                        .id(1)
                        .firstName("Mikey")
                        .lastName("Mouse")
                        .build(),
                Customer.builder()
                        .id(2)
                        .firstName("Joe")
                        .lastName("Doe")
                        .build(),
                Customer.builder()
                        .id(3)
                        .firstName("James")
                        .lastName("Bond")
                        .build()
        );
    }
}
