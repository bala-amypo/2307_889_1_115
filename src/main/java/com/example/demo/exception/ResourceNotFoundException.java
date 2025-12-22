package com.example.demo.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        [cite_start]super(message); [cite: 178, 180]
    }
}