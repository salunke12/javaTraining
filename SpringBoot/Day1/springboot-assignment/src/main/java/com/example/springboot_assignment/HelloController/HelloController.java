package com.example.springboot_assignment.HelloController;

import com.example.springboot_assignment.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final GreetingService greetingService;

    @Autowired
    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/api/hello")
    public String sayHello() {
        return greetingService.getGreetingMessage();
    }
}
