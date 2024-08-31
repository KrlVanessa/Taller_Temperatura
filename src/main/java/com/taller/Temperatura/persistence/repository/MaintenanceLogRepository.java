package com.taller.Temperatura.persistence.repository;

import com.taller.Temperatura.persistence.crud.MaintenanceLogCrud;
import com.taller.Temperatura.persistence.entity.MaintenanceLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.*;

@Repository
public class MaintenanceLogRepository {

    private final MaintenanceLogCrud maintenanceLogCrud;

    @Autowired
    public MaintenanceLogRepository(MaintenanceLogCrud maintenanceLogCrud) {
        this.maintenanceLogCrud = maintenanceLogCrud;
    }

    public List<MaintenanceLog> getLogsByDate(LocalDateTime maintenanceDate) {
        return maintenanceLogCrud.findByMaintenanceDate(maintenanceDate);
    }

    public Optional<List<MaintenanceLog>> getLogsByDevice(Long deviceId) {
        return maintenanceLogCrud.findByDeviceId(deviceId);
    }

    public Optional<List<MaintenanceLog>> getLogsByUser(Long userId) {
        return maintenanceLogCrud.findByPerformedById(userId);
    }

    public MaintenanceLog save(MaintenanceLog maintenanceLog) {
        return maintenanceLogCrud.save(maintenanceLog);
    }

    public void deleteById(Long id) {
        maintenanceLogCrud.deleteById(id);
    }
}
