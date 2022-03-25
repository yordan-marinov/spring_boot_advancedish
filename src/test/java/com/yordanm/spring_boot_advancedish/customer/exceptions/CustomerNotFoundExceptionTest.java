package com.yordanm.spring_boot_advancedish.customer.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class CustomerNotFoundExceptionTest {
    @Test
    void testConstructor() {
        CustomerNotFoundException actualCustomerNotFoundException = new CustomerNotFoundException("An error occurred");
        assertNull(actualCustomerNotFoundException.getCause());
        assertEquals(0, actualCustomerNotFoundException.getSuppressed().length);
        assertEquals("An error occurred", actualCustomerNotFoundException.getMessage());
        assertEquals("An error occurred", actualCustomerNotFoundException.getLocalizedMessage());
    }
}

