package com.taller.Temperatura.persistence.repository;

import com.taller.Temperatura.persistence.crud.AlertCrud;
import com.taller.Temperatura.persistence.entity.Alert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.*;

@Repository
public class AlertRepository {

    private final AlertCrud alertCrud;

    @Autowired
    public AlertRepository(AlertCrud alertCrud) {
        this.alertCrud = alertCrud;
    }

    public List<Alert> getActiveAlerts() {
        return alertCrud.findByIsActiveTrue();
    }

    public List<Alert> getAlertsBySeverity(String severityLevel) {
        return alertCrud.findBySeverityLevel(severityLevel);
    }

    public List<Alert> getAlertsByTimeRange(LocalDateTime start, LocalDateTime end) {
        return alertCrud.findByAlertTimeBetween(start, end);
    }

    public Optional<List<Alert>> getAlertsByDevice(Long deviceId) {
        return alertCrud.findByDeviceId(deviceId);
    }

    public Alert save(Alert alert) {
        return alertCrud.save(alert);
    }

    public void deleteById(Long id) {
        alertCrud.deleteById(id);
    }
}
