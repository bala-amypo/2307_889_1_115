package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AlertRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long shipmentId;
    private Long breachId;
    private String alertType;
    private String message;
    private boolean acknowledged;
    private LocalDateTime sentAt;

    @PrePersist
    public void prePersist() {
        acknowledged = false;
        sentAt = LocalDateTime.now();
    }

    public AlertRecord() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getShipmentId() { return shipmentId; }
    public void setShipmentId(Long shipmentId) { this.shipmentId = shipmentId; }

    public Long getBreachId() { return breachId; }
    public void setBreachId(Long breachId) { this.breachId = breachId; }

    public boolean getAcknowledged() { return acknowledged; }
    public void setAcknowledged(boolean acknowledged) { this.acknowledged = acknowledged; }

    public LocalDateTime getSentAt() { return sentAt; }
}
