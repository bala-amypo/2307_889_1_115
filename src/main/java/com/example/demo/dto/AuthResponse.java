package com.example.demo.dto;

public class AuthResponse {
    private String token;
    private Long userId;
    private String email;
    private String role;

    public AuthResponse(String token, Long userId, String email, String role) {
        this.token = token; [cite: 134]
        this.userId = userId; [cite: 135]
        this.email = email; [cite: 136]
        this.role = role; [cite: 137]
    }

    // Standard Getters and Setters
    public String getToken() { return token; }
    public Long getUserId() { return userId; }
    public String getEmail() { return email; }
    public String getRole() { return role; }
}