package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "breach_records")
public class BreachRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    [cite_start]private Long id; [cite: 92]
    [cite_start]private Long shipmentId; [cite: 93]
    [cite_start]private Long logId; [cite: 94]
    [cite_start]private Double breachValue; [cite: 95]
    [cite_start]private String severity; [cite: 96]
    [cite_start]private boolean resolved; [cite: 97]

    [cite_start]public BreachRecord() {} [cite: 99]

    [cite_start]public BreachRecord(Long shipmentId, Long logId, Double breachValue, String severity, boolean resolved) { [cite: 100]
        this.shipmentId = shipmentId;
        this.logId = logId;
        this.breachValue = breachValue;
        this.severity = severity;
        this.resolved = resolved;
    }

    @PrePersist
    public void prePersist() {
        [cite_start]this.resolved = false; [cite: 102]
    }

    // Getters and Setters
}