package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.util.JwtUtil;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {
    private final JwtUtil jwtUtil;
    public AuthenticationController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }
    @GetMapping("/authenticate")
    public Map<String,String> authenticate(Authentication authentication){
        String username = authentication.getName();
        String token = jwtUtil.generateToken(username);
        Map<String,String> response = new HashMap<>();
        response.put("token", token);
        return response;

    }
}
