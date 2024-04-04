package com.security.SpringSecurity.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.SpringSecurity.Entity.User;
import com.security.SpringSecurity.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User createUser(User user){
        return userRepository.save(user);
    }
    



    
}
