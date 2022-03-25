package com.yordanm.spring_boot_advancedish.customer.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDTO {

    @JsonProperty(value = "customerFirstName")
    private String firstName;
    @JsonProperty(value = "customerLastName")
    private String lastName;

    public static CustomerDTO map(Customer customer){
        return CustomerDTO.builder()
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .build();
    }
}
