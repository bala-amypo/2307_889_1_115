package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    [cite_start]private final UserRepository userRepository; [cite: 233]
    [cite_start]private final PasswordEncoder passwordEncoder; [cite: 233]

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User registerUser(User user) {
        [cite_start]if (userRepository.existsByEmail(user.getEmail())) { [cite: 234]
            throw new IllegalArgumentException("Email already exists");
        }
        [cite_start]user.setPassword(passwordEncoder.encode(user.getPassword())); [cite: 234, 37]
        [cite_start]return userRepository.save(user); [cite: 234]
    }

    @Override
    public User findByEmail(String email) {
        [cite_start]return userRepository.findByEmail(email) [cite: 235]
            [cite_start].orElseThrow(() -> new RuntimeException("User not found")); [cite: 235]
    }
}