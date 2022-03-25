package com.yordanm.spring_boot_advancedish.customer.repositories;


import com.yordanm.spring_boot_advancedish.customer.models.Customer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "fake")
public class CustomerFakeRepo implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return List.of(
                Customer.builder()
                        .id(1)
                        .firstName("Mikey")
                        .lastName("Mouse")
                        .email("mikey@emil.com")
                        .password("password")
                        .build(),
                Customer.builder()
                        .id(2)
                        .firstName("Joe")
                        .lastName("Doe")
                        .email("joe@emil.com")
                        .password("password")
                        .build(),
                Customer.builder()
                        .id(3)
                        .firstName("James")
                        .lastName("Bond")
                        .email("james@emil.com")
                        .password("password")
                        .build()
        );
    }
}
