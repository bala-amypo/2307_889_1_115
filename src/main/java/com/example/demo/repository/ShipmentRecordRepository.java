package com.example.demo.repository;

import com.example.demo.entity.ShipmentRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ShipmentRecordRepository extends JpaRepository<ShipmentRecord, Long> {
    [cite_start]Optional<ShipmentRecord> findByShipmentCode(String shipmentCode); [cite: 151]
}