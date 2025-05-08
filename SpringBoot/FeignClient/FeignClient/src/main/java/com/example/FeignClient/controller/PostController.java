package com.example.FeignClient.controller;

import com.example.FeignClient.client.PostClient;
import com.example.FeignClient.dto.PostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostClient postClient;

    @GetMapping("/feign/posts")
    public List<PostDTO> getPosts() {
        return postClient.getPosts();
    }
}
