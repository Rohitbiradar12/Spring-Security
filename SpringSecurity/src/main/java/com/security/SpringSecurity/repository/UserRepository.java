package com.security.SpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.SpringSecurity.Entity.User;
import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Integer> {

    public Optional<User> findByUserEmail(String userEmail);
    
}
