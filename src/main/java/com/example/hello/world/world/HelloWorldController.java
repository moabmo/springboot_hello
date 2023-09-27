package com.example.hello.world.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(value = "/helloworld")
    public String helloWorld() {
        return "Hello World App Spring Boot";
    }
}
