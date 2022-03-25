package com.yordanm.spring_boot_advancedish.customer.repositories;

import com.yordanm.spring_boot_advancedish.customer.models.Customer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Primary -> This annotation is  not needed any more because is configured trough CustomerConfig class
public class CustomerRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return List.of(Customer.builder()
                .id(4)
                .firstName("David")
                .lastName("Mendez")
                .build());
    }
}
