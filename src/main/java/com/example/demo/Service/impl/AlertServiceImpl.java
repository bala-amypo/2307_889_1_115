package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

@Service
public class AlertServiceImpl {

    public String sendAlert() {
        return "Alert sent";
    }

    public String getAlerts() {
        return "All alerts";
    }

    public void deleteAlert(Long id) {
        System.out.println("Alert deleted " + id);
    }
}
