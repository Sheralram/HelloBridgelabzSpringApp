package com.bridgelabz.hellobridgelabzspringapp.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping("/")
    public String index(){
        return "Hello from bridgelabz";
    }

}
