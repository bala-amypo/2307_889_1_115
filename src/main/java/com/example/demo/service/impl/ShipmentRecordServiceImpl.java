package com.example.demo.service.impl;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.repository.ShipmentRecordRepository;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ShipmentRecordServiceImpl implements ShipmentRecordService {

    private final ShipmentRecordRepository shipmentRepo;

    // Constructor injection (order matters for TestNG)
    public ShipmentRecordServiceImpl(ShipmentRecordRepository shipmentRepo) {
        this.shipmentRepo = shipmentRepo;
    }

    @Override
    public ShipmentRecord createShipment(ShipmentRecord shipment) {
        return shipmentRepo.save(shipment);
    }

    @Override
    public ShipmentRecord updateShipmentStatus(Long id, String status) {
        ShipmentRecord shipment = shipmentRepo.findById(id).orElseThrow();
        shipment.setStatus(status);
        return shipmentRepo.save(shipment);
    }

    @Override
    public Optional<ShipmentRecord> getShipmentByCode(String code) {
        return shipmentRepo.findByShipmentCode(code);
    }

    @Override
    public List<ShipmentRecord> getAllShipments() {
        return shipmentRepo.findAll();
    }
}
