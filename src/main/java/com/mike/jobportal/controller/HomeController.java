package com.mike.jobportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
    // It will be responsible for rendering the home page view
    @GetMapping("/")
    public String home() {
        return "index";
    }


}