package com.yordanm.spring_boot_advancedish.jsonplaceholder.models;

public record Post(
        Integer userId,
        Integer id,
        String title,
        String body) {
}
