package com.bridgelabz.hellobridgelabzspringapp.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Purpose : To Print Hello message using RestController
 *
 * @author : Ramkrishna Sheral
 * @version : 0.0.1
 * @since : 01-12-2021
 */
@RestController
public class HelloRestController {

    /**
     * Purpose : GET Request method is used to get greeting hello message from BridgeLabz using RestController
     *
     * @return hello from bridgelabz  message
     */
    @GetMapping("/")
    public String index(){
        return "Hello from bridgelabz";
    }

}
