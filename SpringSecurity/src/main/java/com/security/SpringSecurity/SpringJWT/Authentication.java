package com.security.SpringSecurity.SpringJWT;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import jakarta.security.auth.message.AuthException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Authentication implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException authException) throws IOException, ServletException {
           response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
           PrintWriter printWriter = response.getWriter();
           printWriter.println("Access Denied"+authException.getMessage());
            }
    
}
