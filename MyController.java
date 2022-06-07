package com.example.springdc213.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/aboutus")
    public String openAboutUs(){
        return "aboutus";
    }
    @GetMapping("/home")
    public String OpenHome(){
        return "home";
    }
    @GetMapping("/list")
    public String OpenList(){
        return "list";
    }
}
