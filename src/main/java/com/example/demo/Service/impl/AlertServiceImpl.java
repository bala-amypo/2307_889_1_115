package com.example.demo.service.impl;

import com.example.demo.entity.AlertRecord;
import com.example.demo.repository.AlertRecordRepository;
import com.example.demo.service.AlertService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlertServiceImpl implements AlertService {
    private final AlertRecordRepository repository;

    public AlertServiceImpl(AlertRecordRepository repository) {
        this.repository = repository; [cite: 187]
    }

    @Override
    public AlertRecord triggerAlert(AlertRecord alert) {
        return repository.save(alert); [cite: 226]
    }

    @Override
    public List<AlertRecord> getAlertsByShipment(Long shipmentId) {
        return repository.findByShipmentId(shipmentId); [cite: 227]
    }
}