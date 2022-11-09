package com.home.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/customerServiceFallback")
    public String customerServiceFallBackMethod(){
        return "Customer Service is taking longer than expected " + "Please try again after sometime....!";
    }

    @GetMapping("/productServiceFallback")
    public String productServiceFallBackMethod(){
        return "Product Service is taking longer than expected " + "Please try again after sometime....!";
    }
}
