package com.security.SpringSecurity.Controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.SpringSecurity.Models.User;
import com.security.SpringSecurity.Services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
    
    @Autowired
    private UserService userService;




    @GetMapping("/user")
    public List<User> getUser(){
        System.out.println("return home");
        return this.userService.getUsers();
    }

    @GetMapping("/currentUser")
    public String getCurrentUser(Principal principal){
       return principal.getName();
    }
    
}
