package com.yordanm.spring_boot_advancedish.jsonplaceholder;

import com.yordanm.spring_boot_advancedish.jsonplaceholder.models.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        value = "jsonplaceholder",
        url = "https://jsonplaceholder.typicode.com"
)
public interface JsonPlaceHolderClient {

    @GetMapping("/posts")
    List<Post> getPosts();

    @GetMapping("/posts/{id}")
    Post getPost(@PathVariable int id);
}
