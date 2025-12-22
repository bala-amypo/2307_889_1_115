package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/breach")
public class BreachRecordController {

    @GetMapping("/all")
    public String getAllBreaches() {
        return "All breach records";
    }

    @GetMapping("/{id}")
    public String getBreachById(@PathVariable Long id) {
        return "Breach ID: " + id;
    }

    @PostMapping("/create")
    public String createBreach() {
        return "Breach created";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBreach(@PathVariable Long id) {
        return "Deleted breach " + id;
    }
}
