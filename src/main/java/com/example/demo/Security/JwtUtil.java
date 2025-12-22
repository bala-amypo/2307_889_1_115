package com.example.demo.Security;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public String generateToken(String username) {
        return "dummy-jwt-token-for-" + username;
    }

    public boolean validateToken(String token) {
        return token != null && token.startsWith("dummy");
    }

    public String extractUsername(String token) {
        return token.replace("dummy-jwt-token-for-", "");
    }
}
