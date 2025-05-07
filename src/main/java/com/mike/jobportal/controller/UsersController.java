package com.mike.jobportal.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.mike.jobportal.entity.Users;
import com.mike.jobportal.entity.UsersType;
import com.mike.jobportal.services.UsersTypeService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UsersController {
    
    private final UsersTypeService usersTypeService;

 //   @Autowired
    public UsersController(UsersTypeService usersTypeService) {
        this.usersTypeService = usersTypeService;
    }

    @GetMapping("/register")
    public String register(Model model) {
        List<UsersType> usersTypes = usersTypeService.getAll();
        model.addAttribute("getAllTypes", usersTypes);
        model.addAttribute("users", new Users());
        return "register";
    }   
}
