package com.example.demo.controller;

import com.example.demo.entity.TemperatureRule;
import com.example.demo.service.TemperatureRuleService;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/rules")
public class TemperatureRuleController {
    private final TemperatureRuleService ruleService;

    public TemperatureRuleController(TemperatureRuleService ruleService) {
        this.ruleService = ruleService;
    }

    @PostMapping
    public TemperatureRule createRule(@RequestBody TemperatureRule rule) {
        return ruleService.createRule(rule);
    }

    @GetMapping("/active")
    public List<TemperatureRule> getActiveRules() {
        return ruleService.getActiveRules();
    }

    @GetMapping("/applicable")
    public TemperatureRule getApplicableRule(@RequestParam String productType) {
        return ruleService.getRuleForProduct(productType, LocalDate.now())
                .orElseThrow(() -> new RuntimeException("No active rule found for product type"));
    }
}