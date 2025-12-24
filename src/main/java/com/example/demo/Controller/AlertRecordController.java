package com.example.demo.controller;

import com.example.demo.entity.AlertRecord;
import com.example.demo.service.AlertService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class AlertRecordController {

    private final AlertService alertService;

    public AlertRecordController(AlertService alertService) {
        this.alertService = alertService;
    }

    // POST /api/alerts
    @PostMapping
    public AlertRecord triggerAlert(@RequestBody AlertRecord alert) {
        return alertService.triggerAlert(alert);
    }

    // PUT /api/alerts/{id}/acknowledge
    @PutMapping("/{id}/acknowledge")
    public AlertRecord acknowledgeAlert(@PathVariable Long id) {
        AlertRecord alert = alertService.getAlertsByShipment(id).get(0);
        alert.setAcknowledged(true);
        return alert;
    }

    // GET /api/alerts/shipment/{shipmentId}
    @GetMapping("/shipment/{shipmentId}")
    public List<AlertRecord> getAlertsByShipment(
            @PathVariable Long shipmentId) {
        return alertService.getAlertsByShipment(shipmentId);
    }

    // GET /api/alerts/{id}
    @GetMapping("/{id}")
    public AlertRecord getAlertById(@PathVariable Long id) {
        return alertService.getAlertsByShipment(id).get(0);
    }

    // GET /api/alerts
    @GetMapping
    public List<AlertRecord> getAllAlerts() {
        return alertService.getAlertsByShipment(null);
    }
}
