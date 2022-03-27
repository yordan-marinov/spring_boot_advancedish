package com.yordanm.spring_boot_advancedish.customer.configurations;

import com.yordanm.spring_boot_advancedish.customer.repositories.CustomerFakeRepo;
import com.yordanm.spring_boot_advancedish.customer.repositories.CustomerRepo;
import com.yordanm.spring_boot_advancedish.customer.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class CustomerConfig {

    @Value("${app.useFakeCustomerRepo:false}")
    private boolean useFakeCustomerRepo;

    @Bean
    CustomerRepo customerRepo(){
        log.info("Customer Fake Repo is: {}", useFakeCustomerRepo);
        return new CustomerFakeRepo();
    }
}
