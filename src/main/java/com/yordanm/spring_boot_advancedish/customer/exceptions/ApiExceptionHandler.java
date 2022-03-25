package com.yordanm.spring_boot_advancedish.customer.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = ApiRequestException.class)
    public ResponseEntity<Object> handleApiCustomerException(ApiRequestException e){
        ApiCustomerException exception = new ApiCustomerException(
                e.getMessage(),
                e,
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now()
        );
        return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);
    }

//    @ExceptionHandler(value = CustomerNotFoundException.class)
//    public ResponseEntity<Object> handleApiCustomerException(CustomerNotFoundException e){
//        ApiCustomerException exception = new ApiCustomerException(
//                e.getMessage(),
//                e,
//                HttpStatus.NOT_FOUND,
//                ZonedDateTime.now()
//        );
//        return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);
//    }
}
