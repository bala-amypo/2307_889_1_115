package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shipment")
public class ShipmentRecordController {

    @GetMapping("/all")
    public String getAllShipments() {
        return "All shipments";
    }

    @GetMapping("/{id}")
    public String getShipment(@PathVariable Long id) {
        return "Shipment " + id;
    }

    @PostMapping("/create")
    public String createShipment() {
        return "Shipment created";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteShipment(@PathVariable Long id) {
        return "Shipment deleted " + id;
    }
}
