package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/temperature")
public class TemperatureLogController {

    @GetMapping("/logs")
    public String getLogs() {
        return "Temperature logs";
    }

    @PostMapping("/add")
    public String addLog() {
        return "Temperature log added";
    }

    @GetMapping("/latest")
    public String getLatest() {
        return "Latest temperature log";
    }
}
