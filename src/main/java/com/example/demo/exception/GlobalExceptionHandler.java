package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleNotFound(ResourceNotFoundException ex) {
        [cite_start]return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND); [cite: 180]
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleValidation(IllegalArgumentException ex) {
        [cite_start]return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST); [cite: 182, 183]
    }
}