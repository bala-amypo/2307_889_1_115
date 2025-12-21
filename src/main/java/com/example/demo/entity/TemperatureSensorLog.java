package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "temperature_sensor_logs")
public class TemperatureSensorLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    [cite_start]private Long id; [cite: 58]
    [cite_start]private Long shipmentId; [cite: 59]
    [cite_start]private Double temperatureValue; [cite: 60]
    [cite_start]private LocalDateTime recordedAt; [cite: 61]
    [cite_start]private String location; [cite: 62]

    [cite_start]public TemperatureSensorLog() {} [cite: 64]

    [cite_start]public TemperatureSensorLog(Long shipmentId, Double temperatureValue, LocalDateTime recordedAt, String location) { [cite: 65]
        this.shipmentId = shipmentId;
        this.temperatureValue = temperatureValue;
        this.recordedAt = recordedAt;
        this.location = location;
    }

    public Long getId() { return id; }
    public Long getShipmentId() { return shipmentId; [cite_start]} [cite: 68]
    public Double getTemperatureValue() { return temperatureValue; [cite_start]} [cite: 68]
    public String getLocation() { return location; [cite_start]} [cite: 67]
    // Getters and Setters
}