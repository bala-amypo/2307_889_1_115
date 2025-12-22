package com.example.demo.service.impl;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ShipmentRecordRepository;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ShipmentRecordServiceImpl implements ShipmentRecordService {
    private final ShipmentRecordRepository repository;

    public ShipmentRecordServiceImpl(ShipmentRecordRepository repository) {
        this.repository = repository; [cite: 187]
    }

    @Override
    public ShipmentRecord createShipment(ShipmentRecord shipment) {
        return repository.save(shipment); [cite: 195]
    }

    @Override
    public ShipmentRecord updateShipmentStatus(Long id, String newStatus) {
        ShipmentRecord shipment = repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Shipment not found")); [cite: 196]
        shipment.setStatus(newStatus); [cite: 196]
        return repository.save(shipment); [cite: 196]
    }

    @Override
    public Optional<ShipmentRecord> getShipmentByCode(String shipmentCode) {
        return repository.findByShipmentCode(shipmentCode); [cite: 192]
    }

    @Override
    public List<ShipmentRecord> getAllShipments() {
        return repository.findAll(); [cite: 193]
    }
}