package com.ua.sutty.authorization.controller;

import com.ua.sutty.authorization.forms.UserForm;
import com.ua.sutty.authorization.models.User;
import com.ua.sutty.authorization.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    private String main(){
        return "/home";
    }

    @GetMapping("/home")
    private String home(){
        return "home";
    }

    @GetMapping("/login")
    private String login(){
        return "login";
    }

    @PostMapping("/login/signUp")
    private String addUser(UserForm userForm){
        User newUser = User.from(userForm);
        userService.addUser(newUser);
        System.out.println(newUser);
        return "redirect:/home";
    }

    @PostMapping("/login/signIn")
    private String signIn(){
        return "redirect:/home";
    }
}
