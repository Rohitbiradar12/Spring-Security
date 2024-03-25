package com.security.SpringSecurity.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.security.SpringSecurity.Models.User;

@Service
public class UserService {

    List<User> user = new ArrayList<>();

    public UserService(){
        user.add(new User(UUID.randomUUID().toString(),"Rohit","rohit@mail.com"));
        user.add(new User(UUID.randomUUID().toString(),"Sud","sudakar@mail.com"));
        user.add(new User(UUID.randomUUID().toString(),"Shravan","dsa@mail.com"));
    }


    public List<User> getUsers(){
        return this.user;
    }
    



    
}
