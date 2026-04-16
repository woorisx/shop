package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name", "alice");
        return "hello";
    }
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name", "alice");
        model.addAttribute("age", 20);
        return "index";
    }

    
}
