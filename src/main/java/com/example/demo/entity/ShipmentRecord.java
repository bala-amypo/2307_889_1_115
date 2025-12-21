package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shipment_records")
public class ShipmentRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    [cite_start]private Long id; [cite: 42]
    [cite_start]private String shipmentCode; [cite: 43]
    [cite_start]private String origin; [cite: 44]
    [cite_start]private String destination; [cite: 45]
    [cite_start]private String status; [cite: 46]

    [cite_start]public ShipmentRecord() {} [cite: 49]

    [cite_start]public ShipmentRecord(String shipmentCode, String origin, String destination, String status) { [cite: 50]
        this.shipmentCode = shipmentCode;
        this.origin = origin;
        this.destination = destination;
        this.status = status;
    }

    @PrePersist
    public void prePersist() {
        if (this.status == null) {
            [cite_start]this.status = "IN_TRANSIT"; [cite: 52]
        }
    }
    // Getters and Setters
}