package com.example.demo.repository;

import com.example.demo.entity.TemperatureRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TemperatureRuleRepository extends JpaRepository<TemperatureRule, Long> {
    [cite_start]List<TemperatureRule> findByActiveTrue(); [cite: 160]

    @Query("SELECT r FROM TemperatureRule r WHERE r.productType = ?1 AND r.effectiveFrom <= ?2 AND r.effectiveTo >= ?2")
    [cite_start]Optional<TemperatureRule> findApplicableRule(String productType, LocalDate date); [cite: 161]
}