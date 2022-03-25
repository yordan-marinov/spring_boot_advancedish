package com.yordanm.spring_boot_advancedish.customer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private int id;
    private String firstName;
    private String lastName;
}
