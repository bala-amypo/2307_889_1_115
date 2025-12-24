package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BreachRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long shipmentId;
    private Long logId;
    private String breachType;
    private Double breachValue;
    private String severity;
    private boolean resolved;
    private LocalDateTime detectedAt;

    @PrePersist
    public void prePersist() {
        resolved = false;
        detectedAt = LocalDateTime.now();
    }

    public BreachRecord() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getShipmentId() { return shipmentId; }
    public void setShipmentId(Long shipmentId) { this.shipmentId = shipmentId; }

    public Long getLogId() { return logId; }
    public void setLogId(Long logId) { this.logId = logId; }

    public Double getBreachValue() { return breachValue; }
    public void setBreachValue(Double breachValue) { this.breachValue = breachValue; }

    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }

    public boolean getResolved() { return resolved; }
    public void setResolved(boolean resolved) { this.resolved = resolved; }
}
