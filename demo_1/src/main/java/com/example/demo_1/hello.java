package com.example.demo_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/daitssu")
    public String hello(){
        return "Hello World!";
    }
}

//localhost:8080/daitssu