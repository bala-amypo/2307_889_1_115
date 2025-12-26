package com.example.demo.controller;

import com.example.demo.entity.TemperatureRule;
import com.example.demo.service.TemperatureRuleService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rules")
public class TemperatureRuleController {

    private final TemperatureRuleService ruleService;

    public TemperatureRuleController(TemperatureRuleService ruleService) {
        this.ruleService = ruleService;
    demo/src/main/java/com/example/demo/dto

    // POST /api/rules
    @PostMapping
    public TemperatureRule createRule(@RequestBody TemperatureRule rule) {
        return ruleService.createRule(rule);
    }

    // PUT /api/rules/{id}
    @PutMapping("/{id}")
    public TemperatureRule updateRule(
            @PathVariable Long id,
            @RequestBody TemperatureRule rule) {
        rule.setId(id);
        return ruleService.createRule(rule);
    }

    // GET /api/rules/active
    @GetMapping("/active")
    public List<TemperatureRule> getActiveRules() {
        return ruleService.getActiveRules();
    }

    // GET /api/rules/product/{productType}
    @GetMapping("/product/{productType}")
    public Optional<TemperatureRule> getRuleForProduct(
            @PathVariable String productType,
            @RequestParam(required = false) LocalDate date) {

        return ruleService.getRuleForProduct(
                productType,
                date != null ? date : LocalDate.now()
        );
    }

    // GET /api/rules
    @GetMapping
    public List<TemperatureRule> getAllRules() {
        return ruleService.getActiveRules();
    }
}
