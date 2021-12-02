package com.bridgelabz.hellobridgelabzspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Purpose :  Print greeting message using MVC Controller on web service page
 *
 * @author : Ramkrishna Sheral
 * @version : 0.0.1
 * @since : 01-12-2021
 */
@Controller
public class HelloWebController {
    /**
     * Purpose : GET Request method is used to get greeting hello message from BridgeLabz using RestController
     *
     * @return hello message
     */
    @GetMapping("/web")
    public String hello() {
        return "hello";
    }
    /**
     * Purpose : GET Request method is used to access Custom Greeting Hello message from Bridgelabz
     *
     * @param model is used as a container storing the message attribute value in MVC architecture
     * @return the Greeting Custom Hello message from Bridgelabz
     */
    @GetMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("message",
                "This is a custom message Hello from Bridgelabz");
        return "message";
    }
}