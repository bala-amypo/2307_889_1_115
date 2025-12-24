package com.example.demo.controller;

import com.example.demo.entity.TemperatureSensorLog;
import com.example.demo.service.TemperatureLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class TemperatureLogController {

    private final TemperatureLogService logService;

    public TemperatureLogController(TemperatureLogService logService) {
        this.logService = logService;
    }

    // POST /api/logs
    @PostMapping
    public TemperatureSensorLog recordLog(@RequestBody TemperatureSensorLog log) {
        return logService.recordLog(log);
    }

    // GET /api/logs/shipment/{shipmentId}
    @GetMapping("/shipment/{shipmentId}")
    public List<TemperatureSensorLog> getLogsByShipment(
            @PathVariable Long shipmentId) {
        return logService.getLogsByShipment(shipmentId);
    }

    // GET /api/logs/{id}
    @GetMapping("/{id}")
    public TemperatureSensorLog getLogById(@PathVariable Long id) {
        return logService.getLogsByShipment(id).get(0);
    }

    // GET /api/logs
    @GetMapping
    public List<TemperatureSensorLog> getAllLogs() {
        return logService.getLogsByShipment(null);
    }
}
