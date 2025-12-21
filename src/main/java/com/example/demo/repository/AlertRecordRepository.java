package com.example.demo.repository;

import com.example.demo.entity.AlertRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AlertRecordRepository extends JpaRepository<AlertRecord, Long> {
    [cite_start]List<AlertRecord> findByShipmentId(Long shipmentId); [cite: 170]
}