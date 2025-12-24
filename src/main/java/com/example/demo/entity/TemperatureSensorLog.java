package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TemperatureSensorLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long shipmentId;
    private String sensorId;
    private LocalDateTime recordedAt;
    private Double temperatureValue;
    private String location;

    @PrePersist
    public void prePersist() {
        if (recordedAt == null) recordedAt = LocalDateTime.now();
    }

    public TemperatureSensorLog() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getShipmentId() { return shipmentId; }
    public void setShipmentId(Long shipmentId) { this.shipmentId = shipmentId; }

    public Double getTemperatureValue() { return temperatureValue; }
    public void setTemperatureValue(Double temperatureValue) { this.temperatureValue = temperatureValue; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
