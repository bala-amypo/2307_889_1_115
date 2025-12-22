package com.example.demo.service.impl;

import com.example.demo.entity.BreachRecord;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.BreachRecordRepository;
import com.example.demo.service.BreachDetectionService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BreachDetectionServiceImpl implements BreachDetectionService {
    private final BreachRecordRepository repository;

    public BreachDetectionServiceImpl(BreachRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public BreachRecord logBreach(BreachRecord breach) {
        [cite_start]return repository.save(breach); [cite: 219]
    }

    @Override
    public BreachRecord resolveBreach(Long id) {
        [cite_start]BreachRecord breach = repository.findById(id) [cite: 220]
            [cite_start].orElseThrow(() -> new ResourceNotFoundException("Breach not found")); [cite: 220]
        [cite_start]breach.setResolved(true); [cite: 220, 103]
        [cite_start]return repository.save(breach); [cite: 220]
    }

    @Override
    public List<BreachRecord> getBreachesByShipment(Long shipmentId) {
        [cite_start]return repository.findByShipmentId(shipmentId); [cite: 217]
    }
}