package com.example.demo.controller;

import com.example.demo.dto.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping("/login")
    public void login(@RequestBody LoginRequest request) {
        // Implementation for authentication and JWT generation [cite: 271]
    }

    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest request) {
        // Implementation for user registration and JWT generation [cite: 272]
    }
}