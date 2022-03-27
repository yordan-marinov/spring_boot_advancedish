package com.yordanm.spring_boot_advancedish.jsonplaceholder.configurations;

import com.yordanm.spring_boot_advancedish.jsonplaceholder.JsonPlaceHolderClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonPlaceHolderConfig {

    @Bean("jsonplaceholder")
    CommandLineRunner runner(JsonPlaceHolderClient jsonPlaceHolderClient){
        return args -> {
            System.out.println("\nurl: https://jsonplaceholder.typicode.com/posts");
            System.out.print("The count of all post is: ");
            System.out.println(jsonPlaceHolderClient.getPosts().size());

            System.out.println("\nurl: https://jsonplaceholder.typicode.com/posts");
            System.out.println("This is the post with id 1");
            System.out.println("\t" + jsonPlaceHolderClient.getPost(1));
        };
    }
}
