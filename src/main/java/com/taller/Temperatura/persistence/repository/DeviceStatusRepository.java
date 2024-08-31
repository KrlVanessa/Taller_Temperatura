package com.taller.Temperatura.persistence.repository;

import com.taller.Temperatura.persistence.crud.DeviceStatusCrud;
import com.taller.Temperatura.persistence.entity.DeviceStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.*;

@Repository
public class DeviceStatusRepository {

    private final DeviceStatusCrud deviceStatusCrud;

    @Autowired
    public DeviceStatusRepository(DeviceStatusCrud deviceStatusCrud) {
        this.deviceStatusCrud = deviceStatusCrud;
    }

    public List<DeviceStatus> getStatusesByStatus(String status) {
        return deviceStatusCrud.findByStatus(status);
    }

    public Optional<List<DeviceStatus>> getStatusesByDevice(Long deviceId) {
        return deviceStatusCrud.findByDeviceId(deviceId);
    }

    public List<DeviceStatus> getStatusesByTimeRange(LocalDateTime start, LocalDateTime end) {
        return deviceStatusCrud.findByLastCheckedBetween(start, end);
    }

    public DeviceStatus save(DeviceStatus deviceStatus) {
        return deviceStatusCrud.save(deviceStatus);
    }

    public void deleteById(Long id) {
        deviceStatusCrud.deleteById(id);
    }
}
