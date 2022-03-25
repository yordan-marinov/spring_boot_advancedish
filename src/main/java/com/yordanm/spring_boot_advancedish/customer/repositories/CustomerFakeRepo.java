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
