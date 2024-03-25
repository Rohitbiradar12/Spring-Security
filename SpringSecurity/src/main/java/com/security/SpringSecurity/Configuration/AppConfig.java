package com.security.SpringSecurity.Configuration;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

public class AppConfig {


    public UserDetailsService userDetailsService(){
        UserDetails user=User.builder().username("rohit").password("abc").build();

        return new InMemoryUserDetailsManager(user);
    }
    
}
