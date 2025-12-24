package com.example.demo.controller;

import com.example.demo.entity.BreachRecord;
import com.example.demo.service.BreachDetectionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/breaches")
public class BreachRecordController {

    private final BreachDetectionService breachService;

    public BreachRecordController(BreachDetectionService breachService) {
        this.breachService = breachService;
    }

    // POST /api/breaches
    @PostMapping
    public BreachRecord logBreach(@RequestBody BreachRecord breach) {
        return breachService.logBreach(breach);
    }

    // PUT /api/breaches/{id}/resolve
    @PutMapping("/{id}/resolve")
    public BreachRecord resolveBreach(@PathVariable Long id) {
        return breachService.resolveBreach(id);
    }

    // GET /api/breaches/shipment/{shipmentId}
    @GetMapping("/shipment/{shipmentId}")
    public List<BreachRecord> getBreachesByShipment(
            @PathVariable Long shipmentId) {
        return breachService.getBreachesByShipment(shipmentId);
    }

    // GET /api/breaches/{id}
    @GetMapping("/{id}")
    public BreachRecord getBreachById(@PathVariable Long id) {
        return breachService.getBreachesByShipment(id).get(0);
    }

    // GET /api/breaches
    @GetMapping
    public List<BreachRecord> getAllBreaches() {
        return breachService.getBreachesByShipment(null);
    }
}
