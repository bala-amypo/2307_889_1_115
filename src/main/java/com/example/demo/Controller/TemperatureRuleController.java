package com.example.demo.Service;

public interface TemperatureRuleService {

    void addRule(String rule);

    void updateRule(Long id, String rule);

    void deleteRule(Long id);

    String getAllRules();
}
