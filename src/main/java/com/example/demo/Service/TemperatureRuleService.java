package com.example.demo.service.impl;

import com.example.demo.entity.TemperatureRule;
import com.example.demo.repository.TemperatureRuleRepository;
import com.example.demo.service.TemperatureRuleService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TemperatureRuleServiceImpl implements TemperatureRuleService {
    private final TemperatureRuleRepository repository;

    [cite_start]public TemperatureRuleServiceImpl(TemperatureRuleRepository repository) { [cite: 187]
        this.repository = repository;
    }

    @Override
    public TemperatureRule createRule(TemperatureRule rule) {
        [cite_start]if (rule.getMinTemp() >= rule.getMaxTemp()) { [cite: 84]
            [cite_start]throw new IllegalArgumentException("minTemp must be less than maxTemp"); [cite: 183]
        }
        return repository.save(rule);
    }

    @Override
    public List<TemperatureRule> getActiveRules() {
        [cite_start]return repository.findByActiveTrue(); [cite: 212]
    }

    @Override
    public Optional<TemperatureRule> getRuleForProduct(String productType, LocalDate date) {
        [cite_start]return repository.findApplicableRule(productType, date); [cite: 211]
    }
}