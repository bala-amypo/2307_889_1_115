package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    [cite_start]private Long id; [cite: 26]
    [cite_start]private String fullName; [cite: 27]
    @Column(unique = true)
    [cite_start]private String email; [cite: 28]
    [cite_start]private String password; [cite: 29]
    [cite_start]private String role; [cite: 30]

    [cite_start]public User() {} [cite: 33]

    [cite_start]public User(Long id, String fullName, String email, String password, String role) { [cite: 34]
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    @PrePersist
    public void prePersist() {
        if (role == null) {
            [cite_start]role = "MONITOR"; [cite: 36]
        }
    }
    // Getters and Setters omitted for brevity
}