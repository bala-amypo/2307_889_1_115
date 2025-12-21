package com.example.demo.controller;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/shipments")
public class ShipmentRecordController {
    private final ShipmentRecordService service;

    [cite_start]public ShipmentRecordController(ShipmentRecordService service) { [cite: 238]
        this.service = service;
    }

    @PostMapping
    [cite_start]public ShipmentRecord create(@RequestBody ShipmentRecord shipment) { [cite: 242]
        return service.createShipment(shipment);
    }

    @PutMapping("/{id}/status")
    [cite_start]public ShipmentRecord updateStatus(@PathVariable Long id, @RequestParam String status) { [cite: 243]
        return service.updateShipmentStatus(id, status);
    }

    @GetMapping("/{code}")
    [cite_start]public ResponseEntity<ShipmentRecord> getByCode(@PathVariable String code) { [cite: 244]
        return service.getShipmentByCode(code)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}