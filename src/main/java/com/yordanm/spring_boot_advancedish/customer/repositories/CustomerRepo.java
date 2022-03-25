package com.yordanm.spring_boot_advancedish.customer.repositories;

import com.yordanm.spring_boot_advancedish.customer.models.Customer;

import java.util.List;

public interface CustomerRepo {

    List<Customer> getCustomers();
}
