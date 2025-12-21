package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "alert_records")
public class AlertRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    [cite_start]private Long id; [cite: 108]
    [cite_start]private Long shipmentId; [cite: 109]
    [cite_start]private Long breachId; [cite: 110]
    [cite_start]private boolean acknowledged; [cite: 111]
    [cite_start]private LocalDateTime sentAt; [cite: 112]

    [cite_start]public AlertRecord() {} [cite: 114]

    [cite_start]public AlertRecord(Long shipmentId, Long breachId, boolean acknowledged, LocalDateTime sentAt) { [cite: 115]
        this.shipmentId = shipmentId;
        this.breachId = breachId;
        this.acknowledged = acknowledged;
        this.sentAt = sentAt;
    }

    @PrePersist
    public void prePersist() {
        [cite_start]this.acknowledged = false; [cite: 117]
        [cite_start]this.sentAt = LocalDateTime.now(); [cite: 117]
    }

    // Getters and Setters
}