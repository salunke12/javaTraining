package com.example.springboot_assignment.repository;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepository {

    public String getGreeting() {
        return "Hello from Repository!";
    }
}
