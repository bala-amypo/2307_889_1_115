package com.example.demo.controller;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentRecordController {

    private final ShipmentRecordService shipmentService;

    public ShipmentRecordController(ShipmentRecordService shipmentService) {
        this.shipmentService = shipmentService;
    }

    // POST /api/shipments
    @PostMapping
    public ShipmentRecord createShipment(@RequestBody ShipmentRecord shipment) {
        return shipmentService.createShipment(shipment);
    }

    // PUT /api/shipments/{id}/status
    @PutMapping("/{id}/status")
    public ShipmentRecord updateShipmentStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return shipmentService.updateShipmentStatus(id, status);
    }

    // GET /api/shipments/code/{shipmentCode}
    @GetMapping("/code/{shipmentCode}")
    public Optional<ShipmentRecord> getByCode(@PathVariable String shipmentCode) {
        return shipmentService.getShipmentByCode(shipmentCode);
    }

    // GET /api/shipments/{id}
    @GetMapping("/{id}")
    public ShipmentRecord getById(@PathVariable Long id) {
        return shipmentService.getAllShipments()
                .stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    // GET /api/shipments
    @GetMapping
    public List<ShipmentRecord> getAllShipments() {
        return shipmentService.getAllShipments();
    }
}
