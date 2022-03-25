package com.yordanm.spring_boot_advancedish.customer.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDTO {

    @JsonProperty(value = "customer_first_name")
    private String firstName;

    @JsonProperty(value = "customer_last_name")
    private String lastName;

    @JsonProperty(value = "customer_email")
    private String email;

    public static CustomerDTO map(Customer customer){
        return CustomerDTO.builder()
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .email(customer.getEmail())
                .build();
    }
}
