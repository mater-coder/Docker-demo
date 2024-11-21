package com.dummy.docker_image;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("Endpoint '/api/hello' was called!");
        return "Hello, Spring Boot!";
    }

}
